// Generated from D:/University/4th Year/Term 2/Compilers/Sec/compiler_project\JavaGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(JavaGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JavaGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(JavaGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(JavaGrammarParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(JavaGrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ret_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet_stmt(JavaGrammarParser.Ret_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(JavaGrammarParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(JavaGrammarParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(JavaGrammarParser.IdContext ctx);
}