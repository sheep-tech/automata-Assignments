// Generated from C:/Users/buona/Documents/Git/autassignments\MyGrammar.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link MyGrammarParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(MyGrammarParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#check_sat_response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_sat_response(MyGrammarParser.Check_sat_responseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#get_model_response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_model_response(MyGrammarParser.Get_model_responseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#model_response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_response(MyGrammarParser.Model_responseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#function_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_var(MyGrammarParser.Function_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
}