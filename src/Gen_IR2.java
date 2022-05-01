import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class <b>Gen_IR2</b> executes <b>MyListener2</b> to generate a modified intermediate html file that is used
 * color the visited and unvisited blocks obtained by exec the IR file generated from {@link Gen_IR1}
 */
public class Gen_IR2 {
    //    static String fname;
//    public Gen_IR2(String path) {fname = path;}
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String fname = s.nextLine().replaceAll("\\\\","\\\\\\\\");
        //       String fname = args[0];
        JavaLexer lexer = new JavaLexer(CharStreams.fromFileName(fname));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        MyListener2 myListener2 = new MyListener2(tokens, fname);
        ParseTreeWalker pw = new ParseTreeWalker();
        pw.walk(myListener2, tree);


    }
}
