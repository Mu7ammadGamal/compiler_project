import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyListener1 extends JavaParserBaseListener{
    TokenStreamRewriter rewriter;
    String fName;
    int counter = 1;
    int counterStack =0;
    TokenStream tokens;
    File file = null;
    String className;

    public MyListener1(TokenStream tokens, String fName) {
        rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
        this.fName = fName;
        String[] pathStrings = fName.split("\\\\");
        pathStrings = pathStrings[pathStrings.length-1].split("\\.");
        this.className = pathStrings[0];
        file = new File(fName.substring(0,fName.lastIndexOf("\\"))+"\\IR.java");
    }


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

    @Override
    public void enterBlockStatement_statement(JavaParser.BlockStatement_statementContext ctx) {
        super.enterBlockStatement_statement(ctx);
    }

    @Override
    public void enterSt1(JavaParser.St1Context ctx) {
        super.enterSt1(ctx);
    }

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


    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
//        String field = "\n\toutput += \"Visited Block" + counter++ + "\\n\";";
        String field = "\n\toutput += \"Visited Block" + counter +"\\n\";\n" +
                "    visited.add("+counter++ +");";
//        String field = "\nSystem.out.println(\"Visted Block "+String.valueOf(counter++)+"\");\n";

        rewriter.insertAfter(ctx.lb, field);
        super.enterBlock(ctx);
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        String filed = "\n\nstatic File file = new File(\""+fName.substring(0,fName.lastIndexOf("\\")) +"\\out.txt\"" +");"+
                "\nstatic String output = \"\";"+
                "\nstatic Set<Integer> visited = new HashSet<Integer>();\n";
        rewriter.insertAfter(ctx.lb,filed);
        super.enterClassBody(ctx);
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        enterIdentifier(ctx.identifier());
        super.enterClassDeclaration(ctx);
    }

    @Override
    public void enterIdentifier(JavaParser.IdentifierContext ctx) {
        if(ctx.IDENTIFIER().getText().equals(className)){
            rewriter.replace(ctx.IDENTIFIER().getSymbol(),"IR");
        }
        super.enterIdentifier(ctx);
    }

}
