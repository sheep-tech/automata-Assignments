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