// Generated from C:/Users/buona/Documents/Git/Automata Assignment 3\MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MyGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MyGrammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MyGrammarParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(MyGrammarParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(MyGrammarParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(MyGrammarParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(MyGrammarParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MyGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(MyGrammarParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtLtExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtLtExpr(MyGrammarParser.GtLtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gteqLteqExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteqLteqExpr(MyGrammarParser.GteqLteqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(MyGrammarParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(MyGrammarParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#numberA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberA(MyGrammarParser.NumberAContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#numberB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberB(MyGrammarParser.NumberBContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#numberC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberC(MyGrammarParser.NumberCContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#numberD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberD(MyGrammarParser.NumberDContext ctx);
}