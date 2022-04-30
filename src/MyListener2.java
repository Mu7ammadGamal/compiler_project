import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class MyListener2 extends JavaParserBaseListener {
    TokenStreamRewriter rewriter;
    String fName;
    TokenStream tokens;
    File file = null;
    String className;
    Set<Integer> visited;
    int counter = 1;

    public MyListener2(TokenStream tokens, String fName) throws IOException {
        rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
        this.fName = fName;
        String content = new String(Files.readAllBytes(Paths.get("H:\\emmy\\engineering\\4th year\\2nd term\\compiler\\project\\New folder\\compiler_project\\src\\out.txt")));
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

    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        String tags = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <body>\n<div style=\"background-color:MediumSeaGreen ;\"><pre>";
        rewriter.insertBefore(ctx.start, tags);
    }

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

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        if(!visited.contains(counter++)){
            rewriter.insertBefore(ctx.start,"<div style=\"background-color:Tomato ;\"> ");
            rewriter.insertAfter(ctx.rb, "</div>");
        }
        super.enterBlock(ctx);
    }
}
