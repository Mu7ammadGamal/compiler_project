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
    TokenStream tokens;
    File file = null;
    File outFile;
    public MyVisitor(TokenStream tokens, String fName) {
        rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
        this.fName = fName;
        String [] pathStrings = fName.split("\\\\");
        file = new File("D:\\University\\4th Year\\Term 2\\Compilers\\Sec\\compiler_project\\src\\IR\\" +pathStrings[pathStrings.length-1] );

    }

    @Override
    public String visitBlockStatement_statement(JavaParser.BlockStatement_statementContext ctx) {
        return visit(ctx.statement());
//        System.out.println(res);
    }

    @Override
    public String visitSt1(JavaParser.St1Context ctx) {
        return visit(ctx.block());
    }

    private String createFileCodeString (){

      String code =
                      " try {" +
                   " FileWriter writer = new FileWriter(outFile" + String.valueOf(counter)+");"+
                      "} catch (IOException e) {" +
                      "e.printStackTrace();" +
                      "}"+
              " try {"
             + "writer.append(\"Visited Block" + String.valueOf(counter++) +
        "} catch (IOException e) {" +
            "e.printStackTrace();" +
        "}";
        return code;
    }

    @Override
    public String visitBlock(JavaParser.BlockContext ctx) {

//        String field = "System.out.println(\"Visted Block "+String.valueOf(counter)+"\");\n" +
//                "        try {\n" +
//                "            fw.append(\"Visited Block "+String.valueOf(counter++)+"\");\n" +
//                "        } catch (IOException e) {\n" +
//                "            e.printStackTrace();\n" +
//                "        }";
        String field = "\nSystem.out.println(\"Visted Block "+String.valueOf(counter++)+"\");\n";
//        String field = createFileCodeString();

        rewriter.insertAfter(ctx.lb, field);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.append(rewriter.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.visitBlock(ctx);
    }

//    @Override
//    public String visitClassBody(JavaParser.ClassBodyContext ctx) {
//        String field = "static FileWriter fw = null;\n" +
//                "        {\n" +
//                "            try {\n" +
//                "                fw = new FileWriter(\"/IRC.text\");\n" +
//                "            } catch (IOException e) {\n" +
//                "                e.printStackTrace();\n" +
//                "            }\n" +
//                "        }";
//
//        rewriter.insertAfter(ctx.lb, field);
//        return super.visitClassBody(ctx);
//    }
}
