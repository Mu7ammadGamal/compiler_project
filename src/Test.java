import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        JavaGrammarLexer lexer = new JavaGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGrammarParser parser = new JavaGrammarParser(tokens);
        ParseTree tree = parser.initialization();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyListener(), tree);

    }
}
