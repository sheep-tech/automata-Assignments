// Generated from C:/Users/buona/Documents/Git/autassignments\MyGrammar.g4 by ANTLR 4.9.1
package gen;
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
	 * Enter a parse tree produced by {@link MyGrammarParser#then_stat}.
	 * @param ctx the parse tree
	 */
	void enterThen_stat(MyGrammarParser.Then_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#then_stat}.
	 * @param ctx the parse tree
	 */
	void exitThen_stat(MyGrammarParser.Then_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#else_stat}.
	 * @param ctx the parse tree
	 */
	void enterElse_stat(MyGrammarParser.Else_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#else_stat}.
	 * @param ctx the parse tree
	 */
	void exitElse_stat(MyGrammarParser.Else_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#declareFunStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareFunStat(MyGrammarParser.DeclareFunStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#declareFunStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareFunStat(MyGrammarParser.DeclareFunStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MyGrammarParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MyGrammarParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(MyGrammarParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(MyGrammarParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(MyGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(MyGrammarParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by the {@code exprFunCall}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunCall(MyGrammarParser.ExprFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFunCall}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunCall(MyGrammarParser.ExprFunCallContext ctx);
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
	 * Enter a parse tree produced by the {@code andBoolExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndBoolExpr(MyGrammarParser.AndBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andBoolExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndBoolExpr(MyGrammarParser.AndBoolExprContext ctx);
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
	 * Enter a parse tree produced by the {@code orBoolExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrBoolExpr(MyGrammarParser.OrBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orBoolExpr}
	 * labeled alternative in {@link MyGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrBoolExpr(MyGrammarParser.OrBoolExprContext ctx);
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
	 * Enter a parse tree produced by the {@code returnBoolExpr}
	 * labeled alternative in {@link MyGrammarParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnBoolExpr(MyGrammarParser.ReturnBoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnBoolExpr}
	 * labeled alternative in {@link MyGrammarParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnBoolExpr(MyGrammarParser.ReturnBoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnCommonExpr}
	 * labeled alternative in {@link MyGrammarParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnCommonExpr(MyGrammarParser.ReturnCommonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnCommonExpr}
	 * labeled alternative in {@link MyGrammarParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnCommonExpr(MyGrammarParser.ReturnCommonExprContext ctx);
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