// Generated from MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MyGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MyGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(MyGrammarParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(MyGrammarParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(MyGrammarParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(MyGrammarParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MyGrammarParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MyGrammarParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#condition_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(MyGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(MyGrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(MyGrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(MyGrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pransExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPransExpr(MyGrammarParser.PransExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pransExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPransExpr(MyGrammarParser.PransExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(MyGrammarParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(MyGrammarParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(MyGrammarParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(MyGrammarParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(MyGrammarParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(MyGrammarParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(MyGrammarParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(MyGrammarParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MyGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MyGrammarParser.IdExprContext ctx);
}