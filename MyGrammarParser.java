// Generated from C:/Users/buona/Documents/Git/autassignments\MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AND=8, EQ=9, SORT=10, 
		INT=11, VALUE=12, VAR_ID=13, ID=14, NEWLINE=15, OBRA=16, CBRA=17, WS=18;
	public static final int
		RULE_myStart = 0, RULE_output = 1, RULE_check_sat_response = 2, RULE_get_model_response = 3, 
		RULE_model_response = 4, RULE_statement = 5, RULE_ite = 6, RULE_then_result = 7, 
		RULE_else_result = 8, RULE_oper = 9, RULE_formal_Param = 10, RULE_print = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "output", "check_sat_response", "get_model_response", "model_response", 
			"statement", "ite", "then_result", "else_result", "oper", "formal_Param", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'unsat'", "'unknown'", "'model'", "'define-fun'", "'ite'", 
			"'print'", "'and'", "'='", null, "'Int'", null, null, null, null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "AND", "EQ", "SORT", 
			"INT", "VALUE", "VAR_ID", "ID", "NEWLINE", "OBRA", "CBRA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public MyStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMyStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMyStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMyStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyStartContext myStart() throws RecognitionException {
		MyStartContext _localctx = new MyStartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(24);
				output();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public Check_sat_responseContext check_sat_response() {
			return getRuleContext(Check_sat_responseContext.class,0);
		}
		public Get_model_responseContext get_model_response() {
			return getRuleContext(Get_model_responseContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MyGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyGrammarParser.NEWLINE, i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			check_sat_response();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(33);
				match(NEWLINE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			get_model_response();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(40);
				match(NEWLINE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(46);
				print();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Check_sat_responseContext extends ParserRuleContext {
		public Check_sat_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_sat_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCheck_sat_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCheck_sat_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitCheck_sat_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_sat_responseContext check_sat_response() throws RecognitionException {
		Check_sat_responseContext _localctx = new Check_sat_responseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_check_sat_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_model_responseContext extends ParserRuleContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public List<Model_responseContext> model_response() {
			return getRuleContexts(Model_responseContext.class);
		}
		public Model_responseContext model_response(int i) {
			return getRuleContext(Model_responseContext.class,i);
		}
		public Get_model_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_model_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGet_model_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGet_model_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitGet_model_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_model_responseContext get_model_response() throws RecognitionException {
		Get_model_responseContext _localctx = new Get_model_responseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_get_model_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OBRA);
			setState(55);
			match(T__3);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBRA) {
				{
				{
				setState(56);
				model_response();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(CBRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Model_responseContext extends ParserRuleContext {
		public List<TerminalNode> OBRA() { return getTokens(MyGrammarParser.OBRA); }
		public TerminalNode OBRA(int i) {
			return getToken(MyGrammarParser.OBRA, i);
		}
		public TerminalNode VAR_ID() { return getToken(MyGrammarParser.VAR_ID, 0); }
		public List<TerminalNode> CBRA() { return getTokens(MyGrammarParser.CBRA); }
		public TerminalNode CBRA(int i) {
			return getToken(MyGrammarParser.CBRA, i);
		}
		public TerminalNode SORT() { return getToken(MyGrammarParser.SORT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Formal_ParamContext> formal_Param() {
			return getRuleContexts(Formal_ParamContext.class);
		}
		public Formal_ParamContext formal_Param(int i) {
			return getRuleContext(Formal_ParamContext.class,i);
		}
		public Model_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterModel_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitModel_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitModel_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_responseContext model_response() throws RecognitionException {
		Model_responseContext _localctx = new Model_responseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_model_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(OBRA);
			setState(65);
			match(T__4);
			setState(66);
			match(VAR_ID);
			setState(67);
			match(OBRA);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBRA) {
				{
				{
				setState(68);
				formal_Param();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(CBRA);
			setState(75);
			match(SORT);
			setState(76);
			statement();
			setState(77);
			match(CBRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(MyGrammarParser.VALUE, 0); }
		public IteContext ite() {
			return getRuleContext(IteContext.class,0);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				ite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				oper();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteContext extends ParserRuleContext {
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public Then_resultContext then_result() {
			return getRuleContext(Then_resultContext.class,0);
		}
		public Else_resultContext else_result() {
			return getRuleContext(Else_resultContext.class,0);
		}
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MyGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyGrammarParser.NEWLINE, i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public IteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteContext ite() throws RecognitionException {
		IteContext _localctx = new IteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ite);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBRA) {
				{
				setState(84);
				match(OBRA);
				}
			}

			setState(87);
			match(T__5);
			setState(88);
			oper();
			setState(89);
			then_result();
			setState(90);
			else_result();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					match(NEWLINE);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(97);
				match(CBRA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_resultContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Then_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterThen_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitThen_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitThen_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_resultContext then_result() throws RecognitionException {
		Then_resultContext _localctx = new Then_resultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_then_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_resultContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterElse_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitElse_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitElse_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_resultContext else_result() throws RecognitionException {
		Else_resultContext _localctx = new Else_resultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperContext extends ParserRuleContext {
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
	 
		public OperContext() { }
		public void copyFrom(OperContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode EQ() { return getToken(MyGrammarParser.EQ, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public EqNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEqNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEqNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitEqNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueOperContext extends OperContext {
		public Token val;
		public TerminalNode VAR_ID() { return getToken(MyGrammarParser.VAR_ID, 0); }
		public TerminalNode VALUE() { return getToken(MyGrammarParser.VALUE, 0); }
		public ValueOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValueOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValueOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitValueOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public AndNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAndNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAndNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAndNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oper);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AndNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(OBRA);
				setState(105);
				match(AND);
				setState(106);
				oper();
				setState(107);
				oper();
				setState(108);
				match(CBRA);
				}
				break;
			case 2:
				_localctx = new EqNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(OBRA);
				setState(111);
				match(EQ);
				setState(112);
				oper();
				setState(113);
				oper();
				setState(114);
				match(CBRA);
				}
				break;
			case 3:
				_localctx = new ValueOperContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((ValueOperContext)_localctx).val = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==VAR_ID) ) {
					((ValueOperContext)_localctx).val = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_ParamContext extends ParserRuleContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode VAR_ID() { return getToken(MyGrammarParser.VAR_ID, 0); }
		public TerminalNode SORT() { return getToken(MyGrammarParser.SORT, 0); }
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public Formal_ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_Param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFormal_Param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFormal_Param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFormal_Param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_ParamContext formal_Param() throws RecognitionException {
		Formal_ParamContext _localctx = new Formal_ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formal_Param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(OBRA);
			setState(120);
			match(VAR_ID);
			setState(121);
			match(SORT);
			setState(122);
			match(CBRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3"+
		"\7\3%\n\3\f\3\16\3(\13\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\7\3\62\n"+
		"\3\f\3\16\3\65\13\3\3\4\3\4\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\7U\n\7\3\b\5\bX\n\b\3\b\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb"+
		"\13\b\3\b\5\be\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\3\5\3\2\16\17\2\u0081"+
		"\2\35\3\2\2\2\4\"\3\2\2\2\6\66\3\2\2\2\b8\3\2\2\2\nB\3\2\2\2\fT\3\2\2"+
		"\2\16W\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24w\3\2\2\2\26y\3\2\2\2\30~\3\2"+
		"\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2\3!\3\3\2\2\2\"&\5\6\4\2#%\7\21"+
		"\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3\2\2\2)-\5"+
		"\b\5\2*,\7\21\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2"+
		"/-\3\2\2\2\60\62\5\30\r\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66\67\t\2\2\2\67\7\3\2\2\289\7"+
		"\22\2\29=\7\6\2\2:<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@"+
		"\3\2\2\2?=\3\2\2\2@A\7\23\2\2A\t\3\2\2\2BC\7\22\2\2CD\7\7\2\2DE\7\17\2"+
		"\2EI\7\22\2\2FH\5\26\f\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LM\7\23\2\2MN\7\f\2\2NO\5\f\7\2OP\7\23\2\2P\13\3\2\2\2Q"+
		"U\7\16\2\2RU\5\16\b\2SU\5\24\13\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\r\3\2"+
		"\2\2VX\7\22\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\b\2\2Z[\5\24\13\2[\\"+
		"\5\20\t\2\\`\5\22\n\2]_\7\21\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2ad\3\2\2\2b`\3\2\2\2ce\7\23\2\2dc\3\2\2\2de\3\2\2\2e\17\3\2\2\2fg\5"+
		"\f\7\2g\21\3\2\2\2hi\5\f\7\2i\23\3\2\2\2jk\7\22\2\2kl\7\n\2\2lm\5\24\13"+
		"\2mn\5\24\13\2no\7\23\2\2ox\3\2\2\2pq\7\22\2\2qr\7\13\2\2rs\5\24\13\2"+
		"st\5\24\13\2tu\7\23\2\2ux\3\2\2\2vx\t\3\2\2wj\3\2\2\2wp\3\2\2\2wv\3\2"+
		"\2\2x\25\3\2\2\2yz\7\22\2\2z{\7\17\2\2{|\7\f\2\2|}\7\23\2\2}\27\3\2\2"+
		"\2~\177\7\t\2\2\177\31\3\2\2\2\r\35&-\63=ITW`dw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}