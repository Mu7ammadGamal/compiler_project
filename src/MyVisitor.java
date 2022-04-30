import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyVisitor extends JavaParserBaseVisitor<String> {
    TokenStreamRewriter rewriter;
    String fName;
    int counter = 1;
    int counterStack =0;
    TokenStream tokens;
    File file = null;
    String className;

    public MyVisitor(TokenStream tokens, String fName) {
        rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
        this.fName = fName;
        String[] pathStrings = fName.split("\\\\");
        pathStrings = pathStrings[pathStrings.length-1].split("\\.");
        this.className = pathStrings[0];
        file = new File(fName.substring(0,fName.lastIndexOf("\\"))+"\\IR.java");
    }

    @Override
    public String visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        // add imports statements in the start of IR file
        String imports = "import java.io.File;\n" +
                "import java.io.FileWriter;\n" +
                "import java.io.IOException;\n";
        rewriter.insertBefore(ctx.start, imports);
        return super.visitCompilationUnit(ctx);
    }

    @Override
    public String visitBlockStatement_statement(JavaParser.BlockStatement_statementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public String visitSt1(JavaParser.St1Context ctx) {

        return visit(ctx.block());
    }

    @Override
    public String visitSt11(JavaParser.St11Context ctx) {
        // add this code to the IR file in the end of the main function (before return statement),
        // this code appends the complete output string into the output file
        rewriter.insertBefore(ctx.start, "\ttry{\n" +
                "\t\tFileWriter writer=new FileWriter(file);\n" +
                "\t\twriter.append(output);\n" +
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
        return super.visitSt11(ctx);
    }

    @Override
    public String visitBlock(JavaParser.BlockContext ctx) {
  /*      // if the block is "main" block -> add this code in the end of this block:
        if (counter == 1)
        {

            rewriter.insertBefore(ctx.stop, "\ttry{\n" +
                    "\t\tFileWriter writer=new FileWriter(file);\n" +
                    "\t\twriter.append(output);\n" +
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
        }*/
        String field = "\nSystem.out.println(\"Visted Block "+String.valueOf(counter++)+"\");\n";

//        String field = "\n\toutput += \"Visited Block" + counter++ + "\\n\";";
        rewriter.insertAfter(ctx.lb, field);

        counterStack++;
        if(counterStack == 0){
            rewriter.insertBefore(ctx.rb, field);
        }
        counterStack--;
        return super.visitBlock(ctx);
    }

    @Override
    public String visitClassBody(JavaParser.ClassBodyContext ctx) {
        String filed = "     \n\nstatic File file = new File(\""+fName.substring(0,fName.lastIndexOf("\\")) +"\\out.txt\"" +");"+
                "   \n\n static String output = \"\";\n";
        rewriter.insertAfter(ctx.lb,filed);
        return super.visitClassBody(ctx);
    }

    @Override
    public String visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        visit(ctx.identifier());
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitIdentifier(JavaParser.IdentifierContext ctx) {
        if(ctx.IDENTIFIER().getText().equals(className)){
            rewriter.replace(ctx.IDENTIFIER().getSymbol(),"IR");
        }
        return super.visitIdentifier(ctx);
    }
}
