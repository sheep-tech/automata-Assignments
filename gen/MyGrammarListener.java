// Generated from MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MyGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MyGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MyGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MyGrammarParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MyGrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MyGrammarParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(MyGrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(MyGrammarParser.LoopContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MyGrammarParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MyGrammarParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funStat}.
	 * @param ctx the parse tree
	 */
	void enterFunStat(MyGrammarParser.FunStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funStat}.
	 * @param ctx the parse tree
	 */
	void exitFunStat(MyGrammarParser.FunStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(MyGrammarParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(MyGrammarParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(MyGrammarParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(MyGrammarParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(MyGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(MyGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(MyGrammarParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(MyGrammarParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MyGrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MyGrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtLtExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterGtLtExpr(MyGrammarParser.GtLtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtLtExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitGtLtExpr(MyGrammarParser.GtLtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteqLteqExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterGteqLteqExpr(MyGrammarParser.GteqLteqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteqLteqExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitGteqLteqExpr(MyGrammarParser.GteqLteqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(MyGrammarParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(MyGrammarParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(MyGrammarParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(MyGrammarParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(MyGrammarParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(MyGrammarParser.ReturnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberA}.
	 * @param ctx the parse tree
	 */
	void enterNumberA(MyGrammarParser.NumberAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberA}.
	 * @param ctx the parse tree
	 */
	void exitNumberA(MyGrammarParser.NumberAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberB}.
	 * @param ctx the parse tree
	 */
	void enterNumberB(MyGrammarParser.NumberBContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberB}.
	 * @param ctx the parse tree
	 */
	void exitNumberB(MyGrammarParser.NumberBContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberC}.
	 * @param ctx the parse tree
	 */
	void enterNumberC(MyGrammarParser.NumberCContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberC}.
	 * @param ctx the parse tree
	 */
	void exitNumberC(MyGrammarParser.NumberCContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numberD}.
	 * @param ctx the parse tree
	 */
	void enterNumberD(MyGrammarParser.NumberDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numberD}.
	 * @param ctx the parse tree
	 */
	void exitNumberD(MyGrammarParser.NumberDContext ctx);
}