// Generated from /home/breno/Documentos/Redstone-Compiler/src/Redstone.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RedstoneLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATR=2, OPAR=3, OPREL=4, OPLOG=5, OPENPAR=6, CLOSEPAR=7, ID=8, 
		FF=9, NUMINT=10, NUMREAL=11, WS=12, READ=13, WRITE=14, IF=15, ELSE=16, 
		WHILE=17, BOOLEAN=18, STR=19, FUNCTION=20, OPENBRACES=21, CLOSEBRACES=22, 
		OPENBRACKETS=23, CLOSEBRACKETS=24, RETURN=25, COMMA=26, COMMENT=27, ERROR=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "ATR", "OPAR", "OPREL", "OPLOG", "OPENPAR", "CLOSEPAR", "ID", 
			"FF", "NUMINT", "NUMREAL", "WS", "READ", "WRITE", "IF", "ELSE", "WHILE", 
			"BOOLEAN", "STR", "FUNCTION", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", 
			"CLOSEBRACKETS", "RETURN", "COMMA", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<-'", null, null, null, "'('", "')'", null, "';'", null, 
			null, null, "'READ'", "'WRITE'", "'IF'", "'ELSE'", "'WHILE'", null, null, 
			"'FUNC'", "'{'", "'}'", "'['", "']'", "'RETURN'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATR", "OPAR", "OPREL", "OPLOG", "OPENPAR", "CLOSEPAR", 
			"ID", "FF", "NUMINT", "NUMREAL", "WS", "READ", "WRITE", "IF", "ELSE", 
			"WHILE", "BOOLEAN", "STR", "FUNCTION", "OPENBRACES", "CLOSEBRACES", "OPENBRACKETS", 
			"CLOSEBRACKETS", "RETURN", "COMMA", "COMMENT", "ERROR"
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


	public RedstoneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Redstone.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\13\6\13o\n\13\r\13\16\13"+
		"p\3\f\6\ft\n\f\r\f\16\fu\3\f\3\f\6\fz\n\f\r\f\16\f{\3\r\6\r\177\n\r\r"+
		"\r\16\r\u0080\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a7\n\23\3\24"+
		"\3\24\7\24\u00ab\n\24\f\24\16\24\u00ae\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00cc\n\34\f\34\16"+
		"\34\u00cf\13\34\3\34\3\34\3\34\3\34\3\35\3\35\4\u00ac\u00cd\2\36\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\b\5"+
		"\2,-//\61\61\4\2>>@@\4\2aac|\5\2\62;aac|\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\3I\3\2\2\2\5K\3\2\2\2\7N\3\2\2\2\tX\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2"+
		"\17b\3\2\2\2\21d\3\2\2\2\23k\3\2\2\2\25n\3\2\2\2\27s\3\2\2\2\31~\3\2\2"+
		"\2\33\u0084\3\2\2\2\35\u0089\3\2\2\2\37\u008f\3\2\2\2!\u0092\3\2\2\2#"+
		"\u0097\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00b1\3\2\2\2+\u00b6\3"+
		"\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00be\3\2\2\2"+
		"\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00d4\3\2\2\2;<\7K\2\2<=\7P\2\2=J"+
		"\7V\2\2>?\7T\2\2?@\7G\2\2@A\7C\2\2AJ\7N\2\2BC\7U\2\2CD\7V\2\2DJ\7T\2\2"+
		"EF\7D\2\2FG\7Q\2\2GH\7Q\2\2HJ\7N\2\2I;\3\2\2\2I>\3\2\2\2IB\3\2\2\2IE\3"+
		"\2\2\2J\4\3\2\2\2KL\7>\2\2LM\7/\2\2M\6\3\2\2\2NO\t\2\2\2O\b\3\2\2\2PY"+
		"\7?\2\2QR\7#\2\2RY\7?\2\2SY\t\3\2\2TU\7>\2\2UY\7?\2\2VW\7@\2\2WY\7?\2"+
		"\2XP\3\2\2\2XQ\3\2\2\2XS\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\n\3\2\2\2Z[\7(\2"+
		"\2[_\7(\2\2\\]\7~\2\2]_\7~\2\2^Z\3\2\2\2^\\\3\2\2\2_\f\3\2\2\2`a\7*\2"+
		"\2a\16\3\2\2\2bc\7+\2\2c\20\3\2\2\2dh\t\4\2\2eg\t\5\2\2fe\3\2\2\2gj\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2i\22\3\2\2\2jh\3\2\2\2kl\7=\2\2l\24\3\2\2\2"+
		"mo\t\6\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\26\3\2\2\2rt\t\6\2"+
		"\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\60\2\2xz\t\6"+
		"\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\30\3\2\2\2}\177\t\7\2\2"+
		"~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\b\r\2\2\u0083\32\3\2\2\2\u0084\u0085\7T\2\2"+
		"\u0085\u0086\7G\2\2\u0086\u0087\7C\2\2\u0087\u0088\7F\2\2\u0088\34\3\2"+
		"\2\2\u0089\u008a\7Y\2\2\u008a\u008b\7T\2\2\u008b\u008c\7K\2\2\u008c\u008d"+
		"\7V\2\2\u008d\u008e\7G\2\2\u008e\36\3\2\2\2\u008f\u0090\7K\2\2\u0090\u0091"+
		"\7H\2\2\u0091 \3\2\2\2\u0092\u0093\7G\2\2\u0093\u0094\7N\2\2\u0094\u0095"+
		"\7U\2\2\u0095\u0096\7G\2\2\u0096\"\3\2\2\2\u0097\u0098\7Y\2\2\u0098\u0099"+
		"\7J\2\2\u0099\u009a\7K\2\2\u009a\u009b\7N\2\2\u009b\u009c\7G\2\2\u009c"+
		"$\3\2\2\2\u009d\u009e\7V\2\2\u009e\u009f\7T\2\2\u009f\u00a0\7W\2\2\u00a0"+
		"\u00a7\7G\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3\7C\2\2\u00a3\u00a4\7N\2\2"+
		"\u00a4\u00a5\7U\2\2\u00a5\u00a7\7G\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a1"+
		"\3\2\2\2\u00a7&\3\2\2\2\u00a8\u00ac\7$\2\2\u00a9\u00ab\13\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7$\2\2\u00b0"+
		"(\3\2\2\2\u00b1\u00b2\7H\2\2\u00b2\u00b3\7W\2\2\u00b3\u00b4\7P\2\2\u00b4"+
		"\u00b5\7E\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7}\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\7\177\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7]\2\2\u00bb\60\3\2\2\2\u00bc\u00bd"+
		"\7_\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1"+
		"\7V\2\2\u00c1\u00c2\7W\2\2\u00c2\u00c3\7T\2\2\u00c3\u00c4\7P\2\2\u00c4"+
		"\64\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00ca\3"+
		"\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\f\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\b\34\2\2\u00d38\3\2\2\2\u00d4\u00d5\13\2\2\2\u00d5:\3"+
		"\2\2\2\16\2IX^hpu{\u0080\u00a6\u00ac\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}