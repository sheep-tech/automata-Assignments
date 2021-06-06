// Generated from MyGrammar.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link MyGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MyGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(MyGrammarParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(MyGrammarParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(MyGrammarParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(MyGrammarParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(MyGrammarParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(MyGrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pransExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPransExpr(MyGrammarParser.PransExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(MyGrammarParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(MyGrammarParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(MyGrammarParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(MyGrammarParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MyGrammarParser.IdExprContext ctx);
}