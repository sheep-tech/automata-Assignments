// Generated from C:/Users/buona/Documents/Git/autassignments\MyGrammar.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link MyGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(MyGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(MyGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#check_sat_response}.
	 * @param ctx the parse tree
	 */
	void enterCheck_sat_response(MyGrammarParser.Check_sat_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#check_sat_response}.
	 * @param ctx the parse tree
	 */
	void exitCheck_sat_response(MyGrammarParser.Check_sat_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#get_model_response}.
	 * @param ctx the parse tree
	 */
	void enterGet_model_response(MyGrammarParser.Get_model_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#get_model_response}.
	 * @param ctx the parse tree
	 */
	void exitGet_model_response(MyGrammarParser.Get_model_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#model_response}.
	 * @param ctx the parse tree
	 */
	void enterModel_response(MyGrammarParser.Model_responseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#model_response}.
	 * @param ctx the parse tree
	 */
	void exitModel_response(MyGrammarParser.Model_responseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#function_var}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var(MyGrammarParser.Function_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#function_var}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var(MyGrammarParser.Function_varContext ctx);
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
}