// Generated from C:/Users/buona/Documents/Git/Automata Assignment 3\MyGrammar.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, NUMBER=3, PLUS=4, MINUS=5, MULT=6, DIV=7, ASSIGN=8, AND=9, 
		OR=10, EQ=11, NEQ=12, GT=13, LT=14, GTEQ=15, LTEQ=16, TRUE=17, FALSE=18, 
		COMMA=19, PRINT=20, WHILE=21, IF=22, THEN=23, ELSE=24, FI=25, DO=26, DOT=27, 
		ID=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NUMBER", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "AND", 
			"OR", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "TRUE", "FALSE", "COMMA", 
			"PRINT", "WHILE", "IF", "THEN", "ELSE", "FI", "DO", "DOT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, "'+'", "'-'", "'*'", "'/'", "'='", "'&&'", 
			"'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'true'", "'false'", 
			"','", "'print'", "'while'", "'if'", "'then'", "'else'", "'fi'", "'do'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMBER", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", 
			"AND", "OR", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "TRUE", "FALSE", 
			"COMMA", "PRINT", "WHILE", "IF", "THEN", "ELSE", "FI", "DO", "DOT", "ID", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\6\4C\n\4\r\4\16\4D\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0097"+
		"\n\35\f\35\16\35\u009a\13\35\3\36\6\36\u009d\n\36\r\36\16\36\u009e\3\36"+
		"\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37\3\2\6\3\2\62;\5\2C\\aac|\b\2##\60\60\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7B\3\2\2\2\tF\3\2\2\2"+
		"\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25S\3\2\2"+
		"\2\27V\3\2\2\2\31Y\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37`\3\2\2\2!c\3\2"+
		"\2\2#f\3\2\2\2%k\3\2\2\2\'q\3\2\2\2)s\3\2\2\2+y\3\2\2\2-\177\3\2\2\2/"+
		"\u0082\3\2\2\2\61\u0087\3\2\2\2\63\u008c\3\2\2\2\65\u008f\3\2\2\2\67\u0092"+
		"\3\2\2\29\u0094\3\2\2\2;\u009c\3\2\2\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6"+
		"\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\b\3\2\2\2"+
		"FG\7-\2\2G\n\3\2\2\2HI\7/\2\2I\f\3\2\2\2JK\7,\2\2K\16\3\2\2\2LM\7\61\2"+
		"\2M\20\3\2\2\2NO\7?\2\2O\22\3\2\2\2PQ\7(\2\2QR\7(\2\2R\24\3\2\2\2ST\7"+
		"~\2\2TU\7~\2\2U\26\3\2\2\2VW\7?\2\2WX\7?\2\2X\30\3\2\2\2YZ\7#\2\2Z[\7"+
		"?\2\2[\32\3\2\2\2\\]\7@\2\2]\34\3\2\2\2^_\7>\2\2_\36\3\2\2\2`a\7@\2\2"+
		"ab\7?\2\2b \3\2\2\2cd\7>\2\2de\7?\2\2e\"\3\2\2\2fg\7v\2\2gh\7t\2\2hi\7"+
		"w\2\2ij\7g\2\2j$\3\2\2\2kl\7h\2\2lm\7c\2\2mn\7n\2\2no\7u\2\2op\7g\2\2"+
		"p&\3\2\2\2qr\7.\2\2r(\3\2\2\2st\7r\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2wx\7"+
		"v\2\2x*\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~,\3\2\2\2"+
		"\177\u0080\7k\2\2\u0080\u0081\7h\2\2\u0081.\3\2\2\2\u0082\u0083\7v\2\2"+
		"\u0083\u0084\7j\2\2\u0084\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086\60\3\2"+
		"\2\2\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b"+
		"\7g\2\2\u008b\62\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7k\2\2\u008e\64"+
		"\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7q\2\2\u0091\66\3\2\2\2\u0092"+
		"\u0093\7\60\2\2\u00938\3\2\2\2\u0094\u0098\t\3\2\2\u0095\u0097\t\4\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099:\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\t\5\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\36\2\2\u00a1<\3\2\2\2\6\2D\u0098"+
		"\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}