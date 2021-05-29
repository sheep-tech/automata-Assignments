package gen;// Generated from MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#var1}.
	 * @param ctx the parse tree
	 */
	void enterVar1(MyGrammarParser.Var1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#var1}.
	 * @param ctx the parse tree
	 */
	void exitVar1(MyGrammarParser.Var1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#var2}.
	 * @param ctx the parse tree
	 */
	void enterVar2(MyGrammarParser.Var2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#var2}.
	 * @param ctx the parse tree
	 */
	void exitVar2(MyGrammarParser.Var2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(MyGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(MyGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(MyGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(MyGrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(MyGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(MyGrammarParser.OperationContext ctx);
}