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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SORT=9, 
		INT=10, VALUE=11, ID=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "SORT", 
			"INT", "VALUE", "ID", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sat'", "'unsat'", "'unknown'", "'(model'", "')'", "'(define-fun '", 
			"' () '", "'print'", null, "'Int'", null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SORT", "INT", 
			"VALUE", "ID", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f"+
		"Z\n\f\r\f\16\f[\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3\16\3\16\3\17\6\17h\n"+
		"\17\r\17\16\17i\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\3\2\6\3\2\62;\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\2m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2"+
		"\2\5#\3\2\2\2\7)\3\2\2\2\t\61\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17G\3\2\2"+
		"\2\21L\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27Y\3\2\2\2\31]\3\2\2\2\33d\3\2"+
		"\2\2\35g\3\2\2\2\37 \7u\2\2 !\7c\2\2!\"\7v\2\2\"\4\3\2\2\2#$\7w\2\2$%"+
		"\7p\2\2%&\7u\2\2&\'\7c\2\2\'(\7v\2\2(\6\3\2\2\2)*\7w\2\2*+\7p\2\2+,\7"+
		"m\2\2,-\7p\2\2-.\7q\2\2./\7y\2\2/\60\7p\2\2\60\b\3\2\2\2\61\62\7*\2\2"+
		"\62\63\7o\2\2\63\64\7q\2\2\64\65\7f\2\2\65\66\7g\2\2\66\67\7n\2\2\67\n"+
		"\3\2\2\289\7+\2\29\f\3\2\2\2:;\7*\2\2;<\7f\2\2<=\7g\2\2=>\7h\2\2>?\7k"+
		"\2\2?@\7p\2\2@A\7g\2\2AB\7/\2\2BC\7h\2\2CD\7w\2\2DE\7p\2\2EF\7\"\2\2F"+
		"\16\3\2\2\2GH\7\"\2\2HI\7*\2\2IJ\7+\2\2JK\7\"\2\2K\20\3\2\2\2LM\7r\2\2"+
		"MN\7t\2\2NO\7k\2\2OP\7p\2\2PQ\7v\2\2Q\22\3\2\2\2RS\5\25\13\2S\24\3\2\2"+
		"\2TU\7K\2\2UV\7p\2\2VW\7v\2\2W\26\3\2\2\2XZ\t\2\2\2YX\3\2\2\2Z[\3\2\2"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\\30\3\2\2\2]a\t\3\2\2^`\t\4\2\2_^\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2ab\3\2\2\2b\32\3\2\2\2ca\3\2\2\2de\7\f\2\2e\34\3\2\2\2"+
		"fh\t\5\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\36\3\2\2\2\6\2[ai"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}