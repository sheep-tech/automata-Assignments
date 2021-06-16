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
	 * Visit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStart(MyGrammarParser.MyStartContext ctx);
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
	 * Visit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#ite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIte(MyGrammarParser.IteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#then_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_result(MyGrammarParser.Then_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#else_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_result(MyGrammarParser.Else_resultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndNestedOper(MyGrammarParser.AndNestedOperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqNestedOper(MyGrammarParser.EqNestedOperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOper(MyGrammarParser.ValueOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#formal_Param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_Param(MyGrammarParser.Formal_ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
}