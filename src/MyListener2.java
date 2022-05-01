import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/**
 * This class <b>MyListener2</b> is a listener, which is used to generate a modified intermediate html file that is used to
 * color the visited and unvisited blocks obtained by exec the IR file generated from {@link MyListener1}
 * by handling a subset of the available methods extended from {@link JavaParserBaseListener}.
 */
public class MyListener2 extends JavaParserBaseListener {
    TokenStreamRewriter rewriter;
    String fName;
    TokenStream tokens;
    File file = null;
    String className;
    Set<Integer> visited;
    int counter = 1;

    /**
     *  <b>MyListener2</b> class constructor.
     *  \param TokenStream tokens
     *  \param String fName,
     *  which is the path of the source java file
     */
    public MyListener2(TokenStream tokens, String fName) throws IOException {
        rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
        this.fName = fName;
        String content = new String(Files.readAllBytes(Paths.get("H:\\emmy\\engineering\\4th year\\2nd term\\compiler\\project\\compilerGit\\compiler_project\\src\\out.txt")));
        Set<Integer> s = new HashSet<>();
        for (char c: content.toCharArray()) {
            if(c!=',' && c!='[' && c!=']' && c!=' ' )
                s.add(Integer.parseInt(String.valueOf(c)));
        }
        this.visited = s;
//        System.out.println(this.visited);
        String[] pathStrings = fName.split("\\\\");
        pathStrings = pathStrings[pathStrings.length-1].split("\\.");
        this.className = pathStrings[0];
        file = new File(fName.substring(0,fName.lastIndexOf("\\"))+"\\IR.html");
    }

    /**
     * This function is used to add the necessary <b><i>html elements</i></b> at the beginning of the generated
     * intermediate html file.
     * It enters a parse tree produced by {@link JavaParser#compilationUnit}.
     * @param ctx the parse tree
     */
    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        String tags = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <body>\n<div style=\"background-color:MediumSeaGreen ;\"><pre>";
        rewriter.insertBefore(ctx.start, tags);
    }

    /**
     * This function is used to add the necessary <b><i>html elements</i></b> at the end of the generated
     * intermediate html file as it appends the content of the input java file to the generated html file.
     * It exits a parse tree produced by {@link JavaParser#compilationUnit}.
     * @param ctx the parse tree
     */
    @Override
    public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        String tags = "</pre></div></body>\n" +
                "</html>";
        rewriter.insertAfter(ctx.stop, tags);

        try {
            FileWriter writer = new FileWriter(file);
            writer.append(rewriter.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        super.exitCompilationUnit(ctx);
    }

    /**
     * This function used to check whether the block to be colored is visited or not and color it red if it wasn't visited
     * Enter a parse tree produced by {@link JavaParser#block}.
     * @param ctx the parse tree
     */
    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        if(!visited.contains(counter++)){
            rewriter.insertBefore(ctx.start,"<div style=\"background-color:Tomato ;\"> ");
            rewriter.insertAfter(ctx.rb, "</div>");
        }
        super.enterBlock(ctx);
    }
}
