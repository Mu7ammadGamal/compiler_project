import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        //Test Cases Files
        String fname = "D:\\University\\4th Year\\Term 2\\Compilers\\Sec\\compiler_project\\src\\test3.java";
        JavaLexer lexer = new JavaLexer(CharStreams.fromFileName(fname));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        MyVisitor myVisitor = new MyVisitor(tokens, fname);
        myVisitor.visit(tree);
    }
}
