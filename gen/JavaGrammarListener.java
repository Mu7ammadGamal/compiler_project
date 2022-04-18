// Generated from D:/University/4th Year/Term 2/Compilers/Sec/compiler_project\JavaGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(JavaGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(JavaGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(JavaGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(JavaGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(JavaGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(JavaGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(JavaGrammarParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(JavaGrammarParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(JavaGrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(JavaGrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRet_stmt(JavaGrammarParser.Ret_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ret_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRet_stmt(JavaGrammarParser.Ret_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(JavaGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(JavaGrammarParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(JavaGrammarParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(JavaGrammarParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(JavaGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(JavaGrammarParser.IdContext ctx);
}