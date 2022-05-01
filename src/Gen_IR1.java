import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;

/**
 * This class <b>Gen_IR1</b> executes <b>MyListener1</b> to generate a modified intermediate java file that is used as
 * a dynamic code analyzer to determine the visited and unvisited blocks in an input java file
 */
public class Gen_IR1 {
    //    static String fname;
//    public Gen_IR1(String path) {
//        fname = path;
//    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String fname = s.nextLine().replaceAll("\\\\","\\\\\\\\");
        // String fname = args[0];
        JavaLexer lexer = new JavaLexer(CharStreams.fromFileName(fname));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        MyListener1 myListener1 = new MyListener1(tokens, fname);
        ParseTreeWalker pw = new ParseTreeWalker();
        pw.walk(myListener1, tree);

    }


}
