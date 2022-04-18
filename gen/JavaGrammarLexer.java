// Generated from D:/University/4th Year/Term 2/Compilers/Sec/compiler_project\JavaGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LETTER=7, DIGIT=8, WS=9, 
		IF=10, ELSE=11, ELIF=12, INT=13, STRING=14, BOOLEAN=15, VOID=16, TRUE=17, 
		FALSE=18, ASSIGN=19, GT=20, LT=21, BANG=22, TILDE=23, QUESTION=24, COLON=25, 
		EQUAL=26, LE=27, GE=28, NOTEQUAL=29, AND=30, OR=31, INC=32, DEC=33, ADD=34, 
		SUB=35, MUL=36, DIV=37, BITAND=38, BITOR=39, CARET=40, MOD=41, ADD_ASSIGN=42, 
		SUB_ASSIGN=43, MUL_ASSIGN=44, DIV_ASSIGN=45, AND_ASSIGN=46, OR_ASSIGN=47, 
		XOR_ASSIGN=48, MOD_ASSIGN=49, PRIVATE=50, PROTECTED=51, PUBLIC=52, RETURN=53, 
		STATIC=54, MAIN=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "LETTER", "DIGIT", "WS", 
			"IF", "ELSE", "ELIF", "INT", "STRING", "BOOLEAN", "VOID", "TRUE", "FALSE", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", "MAIN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'\"'", null, null, null, "'if'", 
			"'else'", "'else if'", "'int'", "'String'", "'Boolean'", "'void'", "'true'", 
			"'false'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
			"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'private'", "'protected'", "'public'", "'return'", 
			"'static'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "LETTER", "DIGIT", "WS", "IF", 
			"ELSE", "ELIF", "INT", "STRING", "BOOLEAN", "VOID", "TRUE", "FALSE", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", "MAIN"
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


	public JavaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n\u0083\n\n\r\n\16\n\u0084\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0135\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2"+
		"\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u0082\3\2\2\2\25\u0088\3\2\2\2\27\u008b"+
		"\3\2\2\2\31\u0090\3\2\2\2\33\u0098\3\2\2\2\35\u009c\3\2\2\2\37\u00a3\3"+
		"\2\2\2!\u00ab\3\2\2\2#\u00b0\3\2\2\2%\u00b5\3\2\2\2\'\u00bb\3\2\2\2)\u00bd"+
		"\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00cc\3\2\2\29\u00cf\3\2\2\2;\u00d2"+
		"\3\2\2\2=\u00d5\3\2\2\2?\u00d8\3\2\2\2A\u00db\3\2\2\2C\u00de\3\2\2\2E"+
		"\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e5\3\2\2\2K\u00e7\3\2\2\2M\u00e9\3\2"+
		"\2\2O\u00eb\3\2\2\2Q\u00ed\3\2\2\2S\u00ef\3\2\2\2U\u00f1\3\2\2\2W\u00f4"+
		"\3\2\2\2Y\u00f7\3\2\2\2[\u00fa\3\2\2\2]\u00fd\3\2\2\2_\u0100\3\2\2\2a"+
		"\u0103\3\2\2\2c\u0106\3\2\2\2e\u0109\3\2\2\2g\u0111\3\2\2\2i\u011b\3\2"+
		"\2\2k\u0122\3\2\2\2m\u0129\3\2\2\2o\u0130\3\2\2\2qr\7*\2\2r\4\3\2\2\2"+
		"st\7+\2\2t\6\3\2\2\2uv\7}\2\2v\b\3\2\2\2wx\7\177\2\2x\n\3\2\2\2yz\7=\2"+
		"\2z\f\3\2\2\2{|\7$\2\2|\16\3\2\2\2}~\t\2\2\2~\20\3\2\2\2\177\u0080\t\3"+
		"\2\2\u0080\22\3\2\2\2\u0081\u0083\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\b\n\2\2\u0087\24\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2"+
		"\u008a\26\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7"+
		"u\2\2\u008e\u008f\7g\2\2\u008f\30\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\u0095\7\"\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097\32\3\2\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b\34\3\2\2\2\u009c\u009d\7U\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7i\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7D\2\2\u00a4\u00a5\7"+
		"q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7c\2\2\u00a9\u00aa\7p\2\2\u00aa \3\2\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7f\2\2\u00af\"\3\2\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7g\2\2\u00b4"+
		"$\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00ba\7g\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00be\7@\2\2\u00be*\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0,"+
		"\3\2\2\2\u00c1\u00c2\7#\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7\u0080\2\2\u00c4"+
		"\60\3\2\2\2\u00c5\u00c6\7A\2\2\u00c6\62\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8"+
		"\64\3\2\2\2\u00c9\u00ca\7?\2\2\u00ca\u00cb\7?\2\2\u00cb\66\3\2\2\2\u00cc"+
		"\u00cd\7>\2\2\u00cd\u00ce\7?\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d4\7?\2\2\u00d4"+
		"<\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d7\7(\2\2\u00d7>\3\2\2\2\u00d8\u00d9"+
		"\7~\2\2\u00d9\u00da\7~\2\2\u00da@\3\2\2\2\u00db\u00dc\7-\2\2\u00dc\u00dd"+
		"\7-\2\2\u00ddB\3\2\2\2\u00de\u00df\7/\2\2\u00df\u00e0\7/\2\2\u00e0D\3"+
		"\2\2\2\u00e1\u00e2\7-\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4H\3\2"+
		"\2\2\u00e5\u00e6\7,\2\2\u00e6J\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8L\3\2"+
		"\2\2\u00e9\u00ea\7(\2\2\u00eaN\3\2\2\2\u00eb\u00ec\7~\2\2\u00ecP\3\2\2"+
		"\2\u00ed\u00ee\7`\2\2\u00eeR\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0T\3\2\2"+
		"\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7?\2\2\u00f3V\3\2\2\2\u00f4\u00f5\7"+
		"/\2\2\u00f5\u00f6\7?\2\2\u00f6X\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9Z\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00fc\7?\2\2\u00fc\\"+
		"\3\2\2\2\u00fd\u00fe\7(\2\2\u00fe\u00ff\7?\2\2\u00ff^\3\2\2\2\u0100\u0101"+
		"\7~\2\2\u0101\u0102\7?\2\2\u0102`\3\2\2\2\u0103\u0104\7`\2\2\u0104\u0105"+
		"\7?\2\2\u0105b\3\2\2\2\u0106\u0107\7\'\2\2\u0107\u0108\7?\2\2\u0108d\3"+
		"\2\2\2\u0109\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7x\2\2\u010d\u010e\7c\2\2\u010e\u010f\7v\2\2\u010f\u0110\7g\2\2"+
		"\u0110f\3\2\2\2\u0111\u0112\7r\2\2\u0112\u0113\7t\2\2\u0113\u0114\7q\2"+
		"\2\u0114\u0115\7v\2\2\u0115\u0116\7g\2\2\u0116\u0117\7e\2\2\u0117\u0118"+
		"\7v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7f\2\2\u011ah\3\2\2\2\u011b\u011c"+
		"\7r\2\2\u011c\u011d\7w\2\2\u011d\u011e\7d\2\2\u011e\u011f\7n\2\2\u011f"+
		"\u0120\7k\2\2\u0120\u0121\7e\2\2\u0121j\3\2\2\2\u0122\u0123\7t\2\2\u0123"+
		"\u0124\7g\2\2\u0124\u0125\7v\2\2\u0125\u0126\7w\2\2\u0126\u0127\7t\2\2"+
		"\u0127\u0128\7p\2\2\u0128l\3\2\2\2\u0129\u012a\7u\2\2\u012a\u012b\7v\2"+
		"\2\u012b\u012c\7c\2\2\u012c\u012d\7v\2\2\u012d\u012e\7k\2\2\u012e\u012f"+
		"\7e\2\2\u012fn\3\2\2\2\u0130\u0131\7o\2\2\u0131\u0132\7c\2\2\u0132\u0133"+
		"\7k\2\2\u0133\u0134\7p\2\2\u0134p\3\2\2\2\4\2\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}