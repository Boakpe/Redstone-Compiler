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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00f0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\6\5"+
		"\6u\n\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n\3\n\3"+
		"\13\5\13\u0085\n\13\3\13\6\13\u0088\n\13\r\13\16\13\u0089\3\f\3\f\6\f"+
		"\u008e\n\f\r\f\16\f\u008f\3\f\3\f\6\f\u0094\n\f\r\f\16\f\u0095\3\r\6\r"+
		"\u0099\n\r\r\r\16\r\u009a\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c1"+
		"\n\23\3\24\3\24\7\24\u00c5\n\24\f\24\16\24\u00c8\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00e6\n\34"+
		"\f\34\16\34\u00e9\13\34\3\34\3\34\3\34\3\34\3\35\3\35\4\u00c6\u00e7\2"+
		"\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		"\3\2\t\5\2,-//\61\61\4\2>>@@\4\2aac|\5\2\62;aac|\3\2//\3\2\62;\5\2\13"+
		"\f\17\17\"\"\2\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7d\3\2\2\2\tn\3\2\2\2\13t\3\2\2"+
		"\2\rv\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23\u0081\3\2\2\2\25\u0084\3\2\2"+
		"\2\27\u008b\3\2\2\2\31\u0098\3\2\2\2\33\u009e\3\2\2\2\35\u00a3\3\2\2\2"+
		"\37\u00a9\3\2\2\2!\u00ac\3\2\2\2#\u00b1\3\2\2\2%\u00c0\3\2\2\2\'\u00c2"+
		"\3\2\2\2)\u00cb\3\2\2\2+\u00d0\3\2\2\2-\u00d2\3\2\2\2/\u00d4\3\2\2\2\61"+
		"\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00df\3\2\2\2\67\u00e1\3\2\2\29\u00ee"+
		"\3\2\2\2;<\7K\2\2<=\7P\2\2=`\7V\2\2>?\7T\2\2?@\7G\2\2@A\7C\2\2A`\7N\2"+
		"\2BC\7U\2\2CD\7V\2\2D`\7T\2\2EF\7D\2\2FG\7Q\2\2GH\7Q\2\2H`\7N\2\2IJ\7"+
		"K\2\2JK\7P\2\2KL\7V\2\2LM\7]\2\2M`\7_\2\2NO\7T\2\2OP\7G\2\2PQ\7C\2\2Q"+
		"R\7N\2\2RS\7]\2\2S`\7_\2\2TU\7U\2\2UV\7V\2\2VW\7T\2\2WX\7]\2\2X`\7_\2"+
		"\2YZ\7D\2\2Z[\7Q\2\2[\\\7Q\2\2\\]\7N\2\2]^\7]\2\2^`\7_\2\2_;\3\2\2\2_"+
		">\3\2\2\2_B\3\2\2\2_E\3\2\2\2_I\3\2\2\2_N\3\2\2\2_T\3\2\2\2_Y\3\2\2\2"+
		"`\4\3\2\2\2ab\7>\2\2bc\7/\2\2c\6\3\2\2\2de\t\2\2\2e\b\3\2\2\2fo\7?\2\2"+
		"gh\7#\2\2ho\7?\2\2io\t\3\2\2jk\7>\2\2ko\7?\2\2lm\7@\2\2mo\7?\2\2nf\3\2"+
		"\2\2ng\3\2\2\2ni\3\2\2\2nj\3\2\2\2nl\3\2\2\2o\n\3\2\2\2pq\7(\2\2qu\7("+
		"\2\2rs\7~\2\2su\7~\2\2tp\3\2\2\2tr\3\2\2\2u\f\3\2\2\2vw\7*\2\2w\16\3\2"+
		"\2\2xy\7+\2\2y\20\3\2\2\2z~\t\4\2\2{}\t\5\2\2|{\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\22\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7=\2"+
		"\2\u0082\24\3\2\2\2\u0083\u0085\t\6\2\2\u0084\u0083\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\t\7\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\26\3\2\2"+
		"\2\u008b\u008d\t\6\2\2\u008c\u008e\t\7\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\7\60\2\2\u0092\u0094\t\7\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\30\3\2\2\2\u0097"+
		"\u0099\t\b\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\r\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009f\7T\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7C\2\2\u00a1"+
		"\u00a2\7F\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7Y\2\2\u00a4\u00a5\7T\2\2\u00a5"+
		"\u00a6\7K\2\2\u00a6\u00a7\7V\2\2\u00a7\u00a8\7G\2\2\u00a8\36\3\2\2\2\u00a9"+
		"\u00aa\7K\2\2\u00aa\u00ab\7H\2\2\u00ab \3\2\2\2\u00ac\u00ad\7G\2\2\u00ad"+
		"\u00ae\7N\2\2\u00ae\u00af\7U\2\2\u00af\u00b0\7G\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\7Y\2\2\u00b2\u00b3\7J\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7N\2\2"+
		"\u00b5\u00b6\7G\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7T\2"+
		"\2\u00b9\u00ba\7W\2\2\u00ba\u00c1\7G\2\2\u00bb\u00bc\7H\2\2\u00bc\u00bd"+
		"\7C\2\2\u00bd\u00be\7N\2\2\u00be\u00bf\7U\2\2\u00bf\u00c1\7G\2\2\u00c0"+
		"\u00b7\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1&\3\2\2\2\u00c2\u00c6\7$\2\2\u00c3"+
		"\u00c5\13\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7$\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7W\2\2\u00cd"+
		"\u00ce\7P\2\2\u00ce\u00cf\7E\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7}\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7\177\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7]\2\2\u00d5"+
		"\60\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7T\2\2\u00d9"+
		"\u00da\7G\2\2\u00da\u00db\7V\2\2\u00db\u00dc\7W\2\2\u00dc\u00dd\7T\2\2"+
		"\u00dd\u00de\7P\2\2\u00de\64\3\2\2\2\u00df\u00e0\7.\2\2\u00e0\66\3\2\2"+
		"\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4"+
		"\u00e6\13\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\f\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\34\2\2\u00ed8\3\2\2\2"+
		"\u00ee\u00ef\13\2\2\2\u00ef:\3\2\2\2\17\2_nt~\u0084\u0089\u008f\u0095"+
		"\u009a\u00c0\u00c6\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}