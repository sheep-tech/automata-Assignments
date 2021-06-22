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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, STRING_CONCAT=11, PLUS=12, MINUS=13, AND=14, OR=15, EQ=16, NOTEQ=17, 
		GTEQ=18, LTEQ=19, SORT=20, STRING=21, INT=22, BOOL=23, VALUE=24, VAR_ID=25, 
		ID=26, NEWLINE=27, OBRA=28, CBRA=29, WS=30;
	public static final int
		RULE_myStart = 0, RULE_output = 1, RULE_check_sat_response = 2, RULE_get_model_response = 3, 
		RULE_model_response = 4, RULE_statement = 5, RULE_ite = 6, RULE_then_result = 7, 
		RULE_else_result = 8, RULE_letStatement = 9, RULE_oper = 10, RULE_formal_Param = 11, 
		RULE_print = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStart", "output", "check_sat_response", "get_model_response", "model_response", 
			"statement", "ite", "then_result", "else_result", "letStatement", "oper", 
			"formal_Param", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'unsat'", "'unknown'", "'model'", "'define-fun'", "'ite'", 
			"'let'", "'\"'", "':'", "'print'", "'str.++'", "'+'", "'-'", "'and'", 
			"'or'", "'='", "'not'", "'>='", "'<='", null, "'String'", "'Int'", "'Bool'", 
			null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "STRING_CONCAT", 
			"PLUS", "MINUS", "AND", "OR", "EQ", "NOTEQ", "GTEQ", "LTEQ", "SORT", 
			"STRING", "INT", "BOOL", "VALUE", "VAR_ID", "ID", "NEWLINE", "OBRA", 
			"CBRA", "WS"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				{
				setState(26);
				output();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
			setState(34);
			check_sat_response();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(35);
				match(NEWLINE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			get_model_response();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(42);
				match(NEWLINE);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(48);
				print();
				}
				}
				setState(53);
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
			setState(54);
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
			setState(56);
			match(OBRA);
			setState(57);
			match(T__3);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBRA) {
				{
				{
				setState(58);
				model_response();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
		public List<Formal_ParamContext> formal_Param() {
			return getRuleContexts(Formal_ParamContext.class);
		}
		public Formal_ParamContext formal_Param(int i) {
			return getRuleContext(Formal_ParamContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(66);
			match(OBRA);
			setState(67);
			match(T__4);
			setState(68);
			match(VAR_ID);
			setState(69);
			match(OBRA);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBRA) {
				{
				{
				setState(70);
				formal_Param();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(CBRA);
			setState(77);
			match(SORT);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				statement();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << VALUE) | (1L << VAR_ID) | (1L << OBRA))) != 0) );
			setState(83);
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
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				ite();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				oper();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				letStatement();
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBRA) {
				{
				setState(91);
				match(OBRA);
				}
			}

			setState(94);
			match(T__5);
			setState(95);
			oper();
			setState(96);
			then_result();
			setState(97);
			else_result();
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(NEWLINE);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(104);
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
			setState(107);
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
			setState(109);
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

	public static class LetStatementContext extends ParserRuleContext {
		public List<TerminalNode> OBRA() { return getTokens(MyGrammarParser.OBRA); }
		public TerminalNode OBRA(int i) {
			return getToken(MyGrammarParser.OBRA, i);
		}
		public List<TerminalNode> CBRA() { return getTokens(MyGrammarParser.CBRA); }
		public TerminalNode CBRA(int i) {
			return getToken(MyGrammarParser.CBRA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> VAR_ID() { return getTokens(MyGrammarParser.VAR_ID); }
		public TerminalNode VAR_ID(int i) {
			return getToken(MyGrammarParser.VAR_ID, i);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBRA) {
				{
				setState(111);
				match(OBRA);
				}
			}

			setState(114);
			match(T__6);
			setState(115);
			match(OBRA);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(OBRA);
				setState(117);
				match(VAR_ID);
				setState(118);
				statement();
				setState(119);
				match(CBRA);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OBRA );
			setState(125);
			match(CBRA);
			setState(126);
			statement();
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(127);
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
	public static class GteqNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode GTEQ() { return getToken(MyGrammarParser.GTEQ, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public GteqNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterGteqNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitGteqNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitGteqNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode MINUS() { return getToken(MyGrammarParser.MINUS, 0); }
		public TerminalNode VALUE() { return getToken(MyGrammarParser.VALUE, 0); }
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public NegativeNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNegativeNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNegativeNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNegativeNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode NOTEQ() { return getToken(MyGrammarParser.NOTEQ, 0); }
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public NotEqNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNotEqNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNotEqNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNotEqNestedOper(this);
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
	public static class PlusNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode PLUS() { return getToken(MyGrammarParser.PLUS, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public PlusNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPlusNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPlusNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPlusNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteqNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode LTEQ() { return getToken(MyGrammarParser.LTEQ, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public LteqNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLteqNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLteqNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLteqNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode MINUS() { return getToken(MyGrammarParser.MINUS, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public MinusNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMinusNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMinusNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMinusNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotationValueOperContext extends OperContext {
		public List<TerminalNode> VALUE() { return getTokens(MyGrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(MyGrammarParser.VALUE, i);
		}
		public List<TerminalNode> VAR_ID() { return getTokens(MyGrammarParser.VAR_ID); }
		public TerminalNode VAR_ID(int i) {
			return getToken(MyGrammarParser.VAR_ID, i);
		}
		public QuotationValueOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterQuotationValueOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitQuotationValueOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitQuotationValueOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode OR() { return getToken(MyGrammarParser.OR, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public OrNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterOrNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitOrNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitOrNestedOper(this);
			else return visitor.visitChildren(this);
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
	public static class QuotationVarOperContext extends OperContext {
		public TerminalNode VAR_ID() { return getToken(MyGrammarParser.VAR_ID, 0); }
		public QuotationVarOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterQuotationVarOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitQuotationVarOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitQuotationVarOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode AND() { return getToken(MyGrammarParser.AND, 0); }
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
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
	public static class StrConcatNestedOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode STRING_CONCAT() { return getToken(MyGrammarParser.STRING_CONCAT, 0); }
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public StrConcatNestedOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterStrConcatNestedOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitStrConcatNestedOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitStrConcatNestedOper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetValueOperContext extends OperContext {
		public TerminalNode OBRA() { return getToken(MyGrammarParser.OBRA, 0); }
		public TerminalNode VAR_ID() { return getToken(MyGrammarParser.VAR_ID, 0); }
		public TerminalNode CBRA() { return getToken(MyGrammarParser.CBRA, 0); }
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public LetValueOperContext(OperContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLetValueOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLetValueOper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitLetValueOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oper);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new AndNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(OBRA);
				setState(131);
				match(AND);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					oper();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << VALUE) | (1L << VAR_ID) | (1L << OBRA))) != 0) );
				setState(137);
				match(CBRA);
				}
				break;
			case 2:
				_localctx = new OrNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(OBRA);
				setState(140);
				match(OR);
				setState(141);
				oper();
				setState(142);
				oper();
				setState(143);
				match(CBRA);
				}
				break;
			case 3:
				_localctx = new EqNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(OBRA);
				setState(146);
				match(EQ);
				setState(147);
				oper();
				setState(148);
				oper();
				setState(149);
				match(CBRA);
				}
				break;
			case 4:
				_localctx = new NotEqNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(OBRA);
				setState(152);
				match(NOTEQ);
				setState(153);
				oper();
				setState(154);
				match(CBRA);
				}
				break;
			case 5:
				_localctx = new GteqNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(OBRA);
				setState(157);
				match(GTEQ);
				setState(158);
				oper();
				setState(159);
				oper();
				setState(160);
				match(CBRA);
				}
				break;
			case 6:
				_localctx = new LteqNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(OBRA);
				setState(163);
				match(LTEQ);
				setState(164);
				oper();
				setState(165);
				oper();
				setState(166);
				match(CBRA);
				}
				break;
			case 7:
				_localctx = new PlusNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				match(OBRA);
				setState(169);
				match(PLUS);
				setState(170);
				oper();
				setState(171);
				oper();
				setState(172);
				match(CBRA);
				}
				break;
			case 8:
				_localctx = new MinusNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				match(OBRA);
				setState(175);
				match(MINUS);
				setState(176);
				oper();
				setState(177);
				oper();
				setState(178);
				match(CBRA);
				}
				break;
			case 9:
				_localctx = new NegativeNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				match(OBRA);
				setState(181);
				match(MINUS);
				setState(182);
				match(VALUE);
				setState(183);
				match(CBRA);
				}
				break;
			case 10:
				_localctx = new StrConcatNestedOperContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				match(OBRA);
				setState(185);
				match(STRING_CONCAT);
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					oper();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << VALUE) | (1L << VAR_ID) | (1L << OBRA))) != 0) );
				setState(191);
				match(CBRA);
				}
				break;
			case 11:
				_localctx = new ValueOperContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(193);
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
			case 12:
				_localctx = new LetValueOperContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(194);
				match(OBRA);
				setState(195);
				match(VAR_ID);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << VALUE) | (1L << VAR_ID) | (1L << OBRA))) != 0)) {
					{
					{
					setState(196);
					oper();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(CBRA);
				}
				break;
			case 13:
				_localctx = new QuotationVarOperContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(203);
				match(T__7);
				setState(204);
				match(VAR_ID);
				setState(205);
				match(T__7);
				}
				break;
			case 14:
				_localctx = new QuotationValueOperContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(206);
				match(T__7);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(207);
					match(VALUE);
					}
				}

				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(210);
					match(T__8);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VALUE || _la==VAR_ID) {
						{
						setState(211);
						_la = _input.LA(1);
						if ( !(_la==VALUE || _la==VAR_ID) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__7);
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
		enterRule(_localctx, 22, RULE_formal_Param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(OBRA);
			setState(223);
			match(VAR_ID);
			setState(224);
			match(SORT);
			setState(225);
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
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\6\6\6"+
		"R\n\6\r\6\16\6S\3\6\3\6\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\5\b_\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\5\bl\n\b\3\t\3\t\3\n\3\n\3\13"+
		"\5\13s\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13|\n\13\r\13\16\13}"+
		"\3\13\3\13\3\13\5\13\u0083\n\13\3\f\3\f\3\f\6\f\u0088\n\f\r\f\16\f\u0089"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00be"+
		"\n\f\r\f\16\f\u00bf\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\5\f\u00d7\n\f\7\f"+
		"\u00d9\n\f\f\f\16\f\u00dc\13\f\3\f\5\f\u00df\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\3\5\3\2"+
		"\32\33\2\u00fd\2\37\3\2\2\2\4$\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\nD\3\2\2"+
		"\2\f[\3\2\2\2\16^\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24r\3\2\2\2\26\u00de"+
		"\3\2\2\2\30\u00e0\3\2\2\2\32\u00e5\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2"+
		"\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2"+
		"\3#\3\3\2\2\2$(\5\6\4\2%\'\7\35\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)+\3\2\2\2*(\3\2\2\2+/\5\b\5\2,.\7\35\2\2-,\3\2\2\2.\61\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61/\3\2\2\2\62\64\5\32\16\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65"+
		"\3\2\2\289\t\2\2\29\7\3\2\2\2:;\7\36\2\2;?\7\6\2\2<>\5\n\6\2=<\3\2\2\2"+
		">A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\37\2\2C\t\3\2\2"+
		"\2DE\7\36\2\2EF\7\7\2\2FG\7\33\2\2GK\7\36\2\2HJ\5\30\r\2IH\3\2\2\2JM\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\37\2\2OQ\7\26\2\2P"+
		"R\5\f\7\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\37\2\2"+
		"V\13\3\2\2\2W\\\7\32\2\2X\\\5\16\b\2Y\\\5\26\f\2Z\\\5\24\13\2[W\3\2\2"+
		"\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]_\7\36\2\2^]\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`a\7\b\2\2ab\5\26\f\2bc\5\20\t\2cg\5\22\n\2df\7\35\2\2"+
		"ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\7\37\2"+
		"\2kj\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mn\5\f\7\2n\21\3\2\2\2op\5\f\7\2p\23"+
		"\3\2\2\2qs\7\36\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\t\2\2u{\7\36\2\2"+
		"vw\7\36\2\2wx\7\33\2\2xy\5\f\7\2yz\7\37\2\2z|\3\2\2\2{v\3\2\2\2|}\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\37\2\2\u0080\u0082\5"+
		"\f\7\2\u0081\u0083\7\37\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\25\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0087\7\20\2\2\u0086\u0088\5\26"+
		"\f\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\37\2\2\u008c\u00df\3"+
		"\2\2\2\u008d\u008e\7\36\2\2\u008e\u008f\7\21\2\2\u008f\u0090\5\26\f\2"+
		"\u0090\u0091\5\26\f\2\u0091\u0092\7\37\2\2\u0092\u00df\3\2\2\2\u0093\u0094"+
		"\7\36\2\2\u0094\u0095\7\22\2\2\u0095\u0096\5\26\f\2\u0096\u0097\5\26\f"+
		"\2\u0097\u0098\7\37\2\2\u0098\u00df\3\2\2\2\u0099\u009a\7\36\2\2\u009a"+
		"\u009b\7\23\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\37\2\2\u009d\u00df"+
		"\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\5\26\f"+
		"\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\37\2\2\u00a3\u00df\3\2\2\2\u00a4"+
		"\u00a5\7\36\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8"+
		"\5\26\f\2\u00a8\u00a9\7\37\2\2\u00a9\u00df\3\2\2\2\u00aa\u00ab\7\36\2"+
		"\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\5\26\f\2\u00ae"+
		"\u00af\7\37\2\2\u00af\u00df\3\2\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b2\7"+
		"\17\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\5\26\f\2\u00b4\u00b5\7\37\2\2"+
		"\u00b5\u00df\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9"+
		"\7\32\2\2\u00b9\u00df\7\37\2\2\u00ba\u00bb\7\36\2\2\u00bb\u00bd\7\r\2"+
		"\2\u00bc\u00be\5\26\f\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\37"+
		"\2\2\u00c2\u00df\3\2\2\2\u00c3\u00df\t\3\2\2\u00c4\u00c5\7\36\2\2\u00c5"+
		"\u00c9\7\33\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00df\7\37\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\7"+
		"\33\2\2\u00cf\u00df\7\n\2\2\u00d0\u00d2\7\n\2\2\u00d1\u00d3\7\32\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00da\3\2\2\2\u00d4\u00d6\7\13"+
		"\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\7\n\2\2\u00de\u0084\3\2\2\2\u00de\u008d\3\2\2\2\u00de\u0093\3\2"+
		"\2\2\u00de\u0099\3\2\2\2\u00de\u009e\3\2\2\2\u00de\u00a4\3\2\2\2\u00de"+
		"\u00aa\3\2\2\2\u00de\u00b0\3\2\2\2\u00de\u00b6\3\2\2\2\u00de\u00ba\3\2"+
		"\2\2\u00de\u00c3\3\2\2\2\u00de\u00c4\3\2\2\2\u00de\u00cd\3\2\2\2\u00de"+
		"\u00d0\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00e1\7\36\2\2\u00e1\u00e2\7\33"+
		"\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00e4\7\37\2\2\u00e4\31\3\2\2\2\u00e5"+
		"\u00e6\7\f\2\2\u00e6\33\3\2\2\2\27\37(/\65?KS[^gkr}\u0082\u0089\u00bf"+
		"\u00c9\u00d2\u00d6\u00da\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}