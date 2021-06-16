// Generated from C:/Users/buona/Documents/Git/autassignments\MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AND=8, EQ=9, SORT=10, 
		INT=11, VALUE=12, VAR_ID=13, ID=14, NEWLINE=15, OBRA=16, CBRA=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "AND", "EQ", 
			"SORT", "INT", "VALUE", "VAR_ID", "ID", "NEWLINE", "OBRA", "CBRA", "WS"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6\rb\n\r\r\r\16\rc\3\16\3\16"+
		"\3\16\5\16i\n\16\3\17\3\17\7\17m\n\17\f\17\16\17p\13\17\3\20\3\20\3\20"+
		"\5\20u\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23~\n\23\r\23\16\23\177"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\3\2\62;\5\2C\\aac|\b\2##\60\60"+
		"\62;C\\aac|\4\2\13\13\"\"\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5+\3\2\2"+
		"\2\7\61\3\2\2\2\t9\3\2\2\2\13?\3\2\2\2\rJ\3\2\2\2\17N\3\2\2\2\21T\3\2"+
		"\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31a\3\2\2\2\33e\3\2\2\2\35j"+
		"\3\2\2\2\37t\3\2\2\2!x\3\2\2\2#z\3\2\2\2%}\3\2\2\2\'(\7u\2\2()\7c\2\2"+
		")*\7v\2\2*\4\3\2\2\2+,\7w\2\2,-\7p\2\2-.\7u\2\2./\7c\2\2/\60\7v\2\2\60"+
		"\6\3\2\2\2\61\62\7w\2\2\62\63\7p\2\2\63\64\7m\2\2\64\65\7p\2\2\65\66\7"+
		"q\2\2\66\67\7y\2\2\678\7p\2\28\b\3\2\2\29:\7o\2\2:;\7q\2\2;<\7f\2\2<="+
		"\7g\2\2=>\7n\2\2>\n\3\2\2\2?@\7f\2\2@A\7g\2\2AB\7h\2\2BC\7k\2\2CD\7p\2"+
		"\2DE\7g\2\2EF\7/\2\2FG\7h\2\2GH\7w\2\2HI\7p\2\2I\f\3\2\2\2JK\7k\2\2KL"+
		"\7v\2\2LM\7g\2\2M\16\3\2\2\2NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR\7p\2\2RS\7v"+
		"\2\2S\20\3\2\2\2TU\7c\2\2UV\7p\2\2VW\7f\2\2W\22\3\2\2\2XY\7?\2\2Y\24\3"+
		"\2\2\2Z[\5\27\f\2[\26\3\2\2\2\\]\7K\2\2]^\7p\2\2^_\7v\2\2_\30\3\2\2\2"+
		"`b\t\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\32\3\2\2\2eh\5\35"+
		"\17\2fg\7#\2\2gi\5\31\r\2hf\3\2\2\2hi\3\2\2\2i\34\3\2\2\2jn\t\3\2\2km"+
		"\t\4\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\36\3\2\2\2pn\3\2\2\2"+
		"qu\7\f\2\2rs\7\17\2\2su\7\f\2\2tq\3\2\2\2tr\3\2\2\2uv\3\2\2\2vw\b\20\2"+
		"\2w \3\2\2\2xy\7*\2\2y\"\3\2\2\2z{\7+\2\2{$\3\2\2\2|~\t\5\2\2}|\3\2\2"+
		"\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\b\23\2\2\u0082&\3\2\2\2\b\2chnt\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}