// Generated from /home/breno/Documentos/ANTLR4/src/Redstone.g4 by ANTLR 4.9.2
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
		TIPO=1, ATR=2, OPAR=3, OPREL=4, OPLOG=5, PAR=6, ID=7, FF=8, NUMINT=9, 
		NUMREAL=10, WS=11, READ=12, WRITE=13, IF=14, ELSE=15, WHILE=16, BOOLEAN=17, 
		STR=18, FUNCTION=19, BRACES=20, BRACKETS=21, RETURN=22, COMMA=23, COMMENT=24, 
		ERROR=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "ATR", "OPAR", "OPREL", "OPLOG", "PAR", "ID", "FF", "NUMINT", 
			"NUMREAL", "WS", "READ", "WRITE", "IF", "ELSE", "WHILE", "BOOLEAN", "STR", 
			"FUNCTION", "BRACES", "BRACKETS", "RETURN", "COMMA", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<-'", null, null, null, null, null, "';'", null, null, 
			null, "'READ'", "'WRITE'", "'IF'", "'ELSE'", "'WHILE'", null, null, "'FUNC'", 
			null, null, "'RETURN'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATR", "OPAR", "OPREL", "OPLOG", "PAR", "ID", "FF", "NUMINT", 
			"NUMREAL", "WS", "READ", "WRITE", "IF", "ELSE", "WHILE", "BOOLEAN", "STR", 
			"FUNCTION", "BRACES", "BRACKETS", "RETURN", "COMMA", "COMMENT", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2D\n\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n"+
		"\5\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\3"+
		"\t\3\t\3\n\6\ng\n\n\r\n\16\nh\3\13\6\13l\n\13\r\13\16\13m\3\13\3\13\6"+
		"\13r\n\13\r\13\16\13s\3\f\6\fw\n\f\r\f\16\fx\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u009f\n\22\3\23\3\23\7\23\u00a3\n\23\f\23\16\23\u00a6\13"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00c0\n\31"+
		"\f\31\16\31\u00c3\13\31\3\31\3\31\3\31\3\31\3\32\3\32\4\u00a4\u00c1\2"+
		"\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\n\5\2,-//\61"+
		"\61\4\2>>@@\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4\2}"+
		"}\177\177\4\2]]__\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3C\3\2\2\2\5E\3\2"+
		"\2\2\7H\3\2\2\2\tR\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21c\3\2"+
		"\2\2\23f\3\2\2\2\25k\3\2\2\2\27v\3\2\2\2\31|\3\2\2\2\33\u0081\3\2\2\2"+
		"\35\u0087\3\2\2\2\37\u008a\3\2\2\2!\u008f\3\2\2\2#\u009e\3\2\2\2%\u00a0"+
		"\3\2\2\2\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2"+
		"/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00c8\3\2\2\2\65\66\7K\2\2\66\67\7"+
		"P\2\2\67D\7V\2\289\7T\2\29:\7G\2\2:;\7C\2\2;D\7N\2\2<=\7U\2\2=>\7V\2\2"+
		">D\7T\2\2?@\7D\2\2@A\7Q\2\2AB\7Q\2\2BD\7N\2\2C\65\3\2\2\2C8\3\2\2\2C<"+
		"\3\2\2\2C?\3\2\2\2D\4\3\2\2\2EF\7>\2\2FG\7/\2\2G\6\3\2\2\2HI\t\2\2\2I"+
		"\b\3\2\2\2JS\7?\2\2KL\7#\2\2LS\7?\2\2MS\t\3\2\2NO\7>\2\2OS\7?\2\2PQ\7"+
		"@\2\2QS\7?\2\2RJ\3\2\2\2RK\3\2\2\2RM\3\2\2\2RN\3\2\2\2RP\3\2\2\2S\n\3"+
		"\2\2\2TU\7(\2\2UY\7(\2\2VW\7~\2\2WY\7~\2\2XT\3\2\2\2XV\3\2\2\2Y\f\3\2"+
		"\2\2Z[\4*+\2[\16\3\2\2\2\\`\t\4\2\2]_\t\5\2\2^]\3\2\2\2_b\3\2\2\2`^\3"+
		"\2\2\2`a\3\2\2\2a\20\3\2\2\2b`\3\2\2\2cd\7=\2\2d\22\3\2\2\2eg\t\6\2\2"+
		"fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\24\3\2\2\2jl\t\6\2\2kj\3\2\2"+
		"\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\7\60\2\2pr\t\6\2\2qp\3\2"+
		"\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\26\3\2\2\2uw\t\7\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\f\2\2{\30\3\2\2\2|}\7T\2\2}~"+
		"\7G\2\2~\177\7C\2\2\177\u0080\7F\2\2\u0080\32\3\2\2\2\u0081\u0082\7Y\2"+
		"\2\u0082\u0083\7T\2\2\u0083\u0084\7K\2\2\u0084\u0085\7V\2\2\u0085\u0086"+
		"\7G\2\2\u0086\34\3\2\2\2\u0087\u0088\7K\2\2\u0088\u0089\7H\2\2\u0089\36"+
		"\3\2\2\2\u008a\u008b\7G\2\2\u008b\u008c\7N\2\2\u008c\u008d\7U\2\2\u008d"+
		"\u008e\7G\2\2\u008e \3\2\2\2\u008f\u0090\7Y\2\2\u0090\u0091\7J\2\2\u0091"+
		"\u0092\7K\2\2\u0092\u0093\7N\2\2\u0093\u0094\7G\2\2\u0094\"\3\2\2\2\u0095"+
		"\u0096\7V\2\2\u0096\u0097\7T\2\2\u0097\u0098\7W\2\2\u0098\u009f\7G\2\2"+
		"\u0099\u009a\7H\2\2\u009a\u009b\7C\2\2\u009b\u009c\7N\2\2\u009c\u009d"+
		"\7U\2\2\u009d\u009f\7G\2\2\u009e\u0095\3\2\2\2\u009e\u0099\3\2\2\2\u009f"+
		"$\3\2\2\2\u00a0\u00a4\7$\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7H\2\2\u00aa\u00ab\7W\2\2\u00ab\u00ac\7P\2\2\u00ac\u00ad\7E\2\2\u00ad"+
		"(\3\2\2\2\u00ae\u00af\t\b\2\2\u00af*\3\2\2\2\u00b0\u00b1\t\t\2\2\u00b1"+
		",\3\2\2\2\u00b2\u00b3\7T\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5\7V\2\2\u00b5"+
		"\u00b6\7W\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7P\2\2\u00b8.\3\2\2\2\u00b9"+
		"\u00ba\7.\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7\61\2"+
		"\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\13\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\b\31\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\13\2\2\2\u00c9\64\3\2\2\2"+
		"\16\2CRX`hmsx\u009e\u00a4\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}