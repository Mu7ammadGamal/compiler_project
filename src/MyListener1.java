import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class <b>MyListener1</b> is a listener, which is used to generate a modified intermediate java file that is used as
 * a dynamic code analyzer to determine the visited and unvisited blocks in an input java file
 * by handling a subset of the available methods extended from {@link JavaParserBaseListener}.
 */
public class MyListener1 extends JavaParserBaseListener{
    TokenStreamRewriter rewriter;
    String fName;
    int counter = 1;
    int counterStack =0;
    TokenStream tokens;
    File file = null;
    String className;

    /**
     *  <b>MyListener1</b> class constructor.
     *  \param TokenStream tokens
     *  \param String fName,
     *  which is the path of the source java file to be analyzed
     */
    public MyListener1(TokenStream tokens, String fName) {
        rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
        this.fName = fName;
        String[] pathStrings = fName.split("\\\\");
        pathStrings = pathStrings[pathStrings.length-1].split("\\.");
        this.className = pathStrings[0];
        file = new File(fName.substring(0,fName.lastIndexOf("\\"))+"\\IR.java");
    }


    /**
     * This function is used to add the necessary <b><i>Import declarations</i></b> at the beginning of the generated IR java file.
     * It enters a parse tree produced by {@link JavaParser#compilationUnit}.
     * @param ctx the parse tree
     */
    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {

        String imports = "import java.io.File;\n" +
                "import java.io.FileWriter;\n" +
                "import java.io.IOException;\n" +
                "import java.util.HashSet;\n" +
                "import java.util.Set;\n\n";
        rewriter.insertBefore(ctx.start, imports);
        super.enterCompilationUnit(ctx);
    }

    /**
     * This function describes the beginning of a <b><i>statment</i></b> production using the method <b>{@code enterBlockStatement_statement} </b>of the superclass {@link JavaParserBaseListener},
     * which enter a parse tree produced by the <b>{@code blockStatement_statement}</b>
     * labeled alternative in {@link JavaParser#blockStatement}.
     * @param ctx the parse tree
     */
    @Override
    public void enterBlockStatement_statement(JavaParser.BlockStatement_statementContext ctx) {
        super.enterBlockStatement_statement(ctx);
    }

    /**
     * This function describes the beginning of a <b><i>block</i></b> production using the method <b>{@code enterSt1} </b>of the superclass {@link JavaParserBaseListener},
     * which enter a parse tree produced by the <b>{@code st1}</b>
     * labeled alternative in {@link JavaParser#statement}.
     * @param ctx the parse tree
     */
    @Override
    public void enterSt1(JavaParser.St1Context ctx) {
        super.enterSt1(ctx);
    }

    /**
     * This function is used to append the content of the input java file to the generated IR java file with the code block
     * used to generate an out.txt file from the IR file with the number of visited blocks<br>
     * It describes the beginning of a <b><i>Return</i></b> using the method <b>{@code enterSt11} </b>of the superclass
     * {@link JavaParserBaseListener},
     * which enter a parse tree produced by the <b>{@code st11}</b>
     * labeled alternative in {@link JavaParser#statement}.
     * @param ctx the parse tree
     */
    @Override
    public void enterSt11(JavaParser.St11Context ctx) {
        rewriter.insertBefore(ctx.start, "\ttry{\n" +
                "\t\tFileWriter writer=new FileWriter(file);\n" +
                "\t\twriter.append(visited.toString());\n" +
                "\t\twriter.close();\n" +
                "\t\t}catch(IOException e){\n" +
                "\t\te.printStackTrace();\n" +
                "\t\t}\n");
        try {
            FileWriter writer = new FileWriter(file);
            writer.append(rewriter.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.enterSt11(ctx);
    }

    /**
     * This function used to label all the blocks in the generated IR java file, which helps to tag the visited and
     * unvisited blocks when exec the IR file
     * Enter a parse tree produced by {@link JavaParser#block}.
     * @param ctx the parse tree
     */
    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
//        String field = "\n\toutput += \"Visited Block" + counter++ + "\\n\";";
        String field = "\n\toutput += \"Visited Block" + counter +"\\n\";\n" +
                "    visited.add("+counter++ +");";
//        String field = "\nSystem.out.println(\"Visted Block "+String.valueOf(counter++)+"\");\n";

        rewriter.insertAfter(ctx.lb, field);
        super.enterBlock(ctx);
    }

    /**
     * This function used to add the initializations of the variables used to label the blocks in <b>{@code enterlBock}</b>
     * and initialize the out.txt file which contains the set of the visited blocks obtained by exec the IR java file
     * Enter a parse tree produced by {@link JavaParser#classBody}.
     * @param ctx the parse tree
     */
    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        String filed = "\n\nstatic File file = new File(\""+fName.substring(0,fName.lastIndexOf("\\")) +"\\out.txt\"" +");"+
                "\nstatic String output = \"\";"+
                "\nstatic Set<Integer> visited = new HashSet<Integer>();\n";
        rewriter.insertAfter(ctx.lb,filed);
        super.enterClassBody(ctx);
    }

    /**
     * This function is used to declare the class of the IR generated java files with the same name of the file
     * Enter a parse tree produced by {@link JavaParser#classDeclaration}.
     * @param ctx the parse tree
     */
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        enterIdentifier(ctx.identifier());
        super.enterClassDeclaration(ctx);
    }

    /**
     * This function is used to rename the generated IR java file
     * Enter a parse tree produced by {@link JavaParser#identifier}..
     * @param ctx the parse tree
     */
    @Override
    public void enterIdentifier(JavaParser.IdentifierContext ctx) {
        if(ctx.IDENTIFIER().getText().equals(className)){
            rewriter.replace(ctx.IDENTIFIER().getSymbol(),"IR");
        }
        super.enterIdentifier(ctx);
    }

}
