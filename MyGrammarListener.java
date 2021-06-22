// Generated from C:/Users/buona/Documents/Git/autassignments\MyGrammar.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link MyGrammarParser#ite}.
	 * @param ctx the parse tree
	 */
	void enterIte(MyGrammarParser.IteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ite}.
	 * @param ctx the parse tree
	 */
	void exitIte(MyGrammarParser.IteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#then_result}.
	 * @param ctx the parse tree
	 */
	void enterThen_result(MyGrammarParser.Then_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#then_result}.
	 * @param ctx the parse tree
	 */
	void exitThen_result(MyGrammarParser.Then_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#else_result}.
	 * @param ctx the parse tree
	 */
	void enterElse_result(MyGrammarParser.Else_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#else_result}.
	 * @param ctx the parse tree
	 */
	void exitElse_result(MyGrammarParser.Else_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void enterLetStatement(MyGrammarParser.LetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void exitLetStatement(MyGrammarParser.LetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterAndNestedOper(MyGrammarParser.AndNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitAndNestedOper(MyGrammarParser.AndNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOrNestedOper(MyGrammarParser.OrNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOrNestedOper(MyGrammarParser.OrNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterEqNestedOper(MyGrammarParser.EqNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitEqNestedOper(MyGrammarParser.EqNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterNotEqNestedOper(MyGrammarParser.NotEqNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitNotEqNestedOper(MyGrammarParser.NotEqNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterGteqNestedOper(MyGrammarParser.GteqNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitGteqNestedOper(MyGrammarParser.GteqNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterLteqNestedOper(MyGrammarParser.LteqNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteqNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitLteqNestedOper(MyGrammarParser.LteqNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterPlusNestedOper(MyGrammarParser.PlusNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitPlusNestedOper(MyGrammarParser.PlusNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterMinusNestedOper(MyGrammarParser.MinusNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitMinusNestedOper(MyGrammarParser.MinusNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterNegativeNestedOper(MyGrammarParser.NegativeNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitNegativeNestedOper(MyGrammarParser.NegativeNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strConcatNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterStrConcatNestedOper(MyGrammarParser.StrConcatNestedOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strConcatNestedOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitStrConcatNestedOper(MyGrammarParser.StrConcatNestedOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterValueOper(MyGrammarParser.ValueOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitValueOper(MyGrammarParser.ValueOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letValueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterLetValueOper(MyGrammarParser.LetValueOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letValueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitLetValueOper(MyGrammarParser.LetValueOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotationVarOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterQuotationVarOper(MyGrammarParser.QuotationVarOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotationVarOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitQuotationVarOper(MyGrammarParser.QuotationVarOperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotationValueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterQuotationValueOper(MyGrammarParser.QuotationValueOperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotationValueOper}
	 * labeled alternative in {@link MyGrammarParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitQuotationValueOper(MyGrammarParser.QuotationValueOperContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#formal_Param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_Param(MyGrammarParser.Formal_ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#formal_Param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_Param(MyGrammarParser.Formal_ParamContext ctx);
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