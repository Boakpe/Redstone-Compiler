// Generated from /home/breno/Documentos/Redstone-Compiler/src/Redstone.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RedstoneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATR=2, OPAR=3, OPREL=4, OPLOG=5, OPENPAR=6, CLOSEPAR=7, ID=8, 
		FF=9, NUMINT=10, NUMREAL=11, WS=12, READ=13, WRITE=14, IF=15, ELSE=16, 
		WHILE=17, BOOLEAN=18, STR=19, FUNCTION=20, OPENBRACES=21, CLOSEBRACES=22, 
		OPENBRACKETS=23, CLOSEBRACKETS=24, RETURN=25, COMMA=26, COMMENT=27, ERROR=28;
	public static final int
		RULE_declaração = 0, RULE_valor = 1, RULE_expressão_aritmética = 2, RULE_expressão_relacional = 3, 
		RULE_expressão_genérica = 4, RULE_atribuição = 5, RULE_corpo_função = 6, 
		RULE_assinatura_função = 7, RULE_condição = 8, RULE_loop = 9, RULE_escrita = 10, 
		RULE_leitura = 11, RULE_comentário = 12, RULE_comando = 13, RULE_programa = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaração", "valor", "expressão_aritmética", "expressão_relacional", 
			"expressão_genérica", "atribuição", "corpo_função", "assinatura_função", 
			"condição", "loop", "escrita", "leitura", "comentário", "comando", "programa"
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

	@Override
	public String getGrammarFileName() { return "Redstone.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RedstoneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DeclaraçãoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(RedstoneParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(RedstoneParser.ID, 0); }
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(RedstoneParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(RedstoneParser.CLOSEBRACKETS, 0); }
		public DeclaraçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaração; }
	}

	public final DeclaraçãoContext declaração() throws RecognitionException {
		DeclaraçãoContext _localctx = new DeclaraçãoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaração);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(TIPO);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENBRACKETS) {
				{
				setState(31);
				match(OPENBRACKETS);
				setState(32);
				match(CLOSEBRACKETS);
				}
			}

			setState(35);
			match(ID);
			setState(36);
			match(FF);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(RedstoneParser.NUMINT, 0); }
		public List<TerminalNode> ID() { return getTokens(RedstoneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RedstoneParser.ID, i);
		}
		public TerminalNode NUMREAL() { return getToken(RedstoneParser.NUMREAL, 0); }
		public TerminalNode STR() { return getToken(RedstoneParser.STR, 0); }
		public TerminalNode BOOLEAN() { return getToken(RedstoneParser.BOOLEAN, 0); }
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RedstoneParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RedstoneParser.COMMA, i);
		}
		public TerminalNode OPENBRACES() { return getToken(RedstoneParser.OPENBRACES, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(RedstoneParser.CLOSEBRACES, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(NUMINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(NUMREAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				match(STR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				match(ID);
				setState(44);
				match(OPENPAR);
				setState(45);
				match(ID);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(46);
					match(COMMA);
					setState(47);
					match(ID);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(CLOSEPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(OPENBRACES);
				setState(55);
				match(ID);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(56);
					match(COMMA);
					setState(57);
					match(ID);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(CLOSEBRACES);
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

	public static class Expressão_aritméticaContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> OPAR() { return getTokens(RedstoneParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(RedstoneParser.OPAR, i);
		}
		public Expressão_aritméticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_aritmética; }
	}

	public final Expressão_aritméticaContext expressão_aritmética() throws RecognitionException {
		Expressão_aritméticaContext _localctx = new Expressão_aritméticaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressão_aritmética);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			valor();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAR) {
				{
				{
				setState(67);
				match(OPAR);
				setState(68);
				valor();
				}
				}
				setState(73);
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

	public static class Expressão_relacionalContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(RedstoneParser.OPREL, 0); }
		public Expressão_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_relacional; }
	}

	public final Expressão_relacionalContext expressão_relacional() throws RecognitionException {
		Expressão_relacionalContext _localctx = new Expressão_relacionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressão_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			valor();
			setState(75);
			match(OPREL);
			setState(76);
			valor();
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

	public static class Expressão_genéricaContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<Expressão_aritméticaContext> expressão_aritmética() {
			return getRuleContexts(Expressão_aritméticaContext.class);
		}
		public Expressão_aritméticaContext expressão_aritmética(int i) {
			return getRuleContext(Expressão_aritméticaContext.class,i);
		}
		public List<Expressão_relacionalContext> expressão_relacional() {
			return getRuleContexts(Expressão_relacionalContext.class);
		}
		public Expressão_relacionalContext expressão_relacional(int i) {
			return getRuleContext(Expressão_relacionalContext.class,i);
		}
		public List<TerminalNode> OPLOG() { return getTokens(RedstoneParser.OPLOG); }
		public TerminalNode OPLOG(int i) {
			return getToken(RedstoneParser.OPLOG, i);
		}
		public Expressão_genéricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_genérica; }
	}

	public final Expressão_genéricaContext expressão_genérica() throws RecognitionException {
		Expressão_genéricaContext _localctx = new Expressão_genéricaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressão_genérica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(78);
				valor();
				}
				break;
			case 2:
				{
				setState(79);
				expressão_aritmética();
				}
				break;
			case 3:
				{
				setState(80);
				expressão_relacional();
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPLOG) {
				{
				{
				setState(83);
				match(OPLOG);
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(84);
					valor();
					}
					break;
				case 2:
					{
					setState(85);
					expressão_aritmética();
					}
					break;
				case 3:
					{
					setState(86);
					expressão_relacional();
					}
					break;
				}
				}
				}
				setState(93);
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

	public static class AtribuiçãoContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(RedstoneParser.ATR, 0); }
		public Expressão_genéricaContext expressão_genérica() {
			return getRuleContext(Expressão_genéricaContext.class,0);
		}
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public DeclaraçãoContext declaração() {
			return getRuleContext(DeclaraçãoContext.class,0);
		}
		public TerminalNode ID() { return getToken(RedstoneParser.ID, 0); }
		public AtribuiçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuição; }
	}

	public final AtribuiçãoContext atribuição() throws RecognitionException {
		AtribuiçãoContext _localctx = new AtribuiçãoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuição);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(94);
				declaração();
				}
				break;
			case ID:
				{
				setState(95);
				match(ID);
				}
				break;
			case ATR:
				break;
			default:
				break;
			}
			setState(98);
			match(ATR);
			setState(99);
			expressão_genérica();
			setState(100);
			match(FF);
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

	public static class Corpo_funçãoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(RedstoneParser.RETURN, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public List<DeclaraçãoContext> declaração() {
			return getRuleContexts(DeclaraçãoContext.class);
		}
		public DeclaraçãoContext declaração(int i) {
			return getRuleContext(DeclaraçãoContext.class,i);
		}
		public List<AtribuiçãoContext> atribuição() {
			return getRuleContexts(AtribuiçãoContext.class);
		}
		public AtribuiçãoContext atribuição(int i) {
			return getRuleContext(AtribuiçãoContext.class,i);
		}
		public Corpo_funçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_função; }
	}

	public final Corpo_funçãoContext corpo_função() throws RecognitionException {
		Corpo_funçãoContext _localctx = new Corpo_funçãoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_corpo_função);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					declaração();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					atribuição();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMINT) | (1L << NUMREAL) | (1L << BOOLEAN) | (1L << STR) | (1L << OPENBRACES))) != 0)) {
				{
				{
				setState(114);
				valor();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RETURN);
			setState(121);
			valor();
			setState(122);
			match(FF);
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

	public static class Assinatura_funçãoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(RedstoneParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(RedstoneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RedstoneParser.ID, i);
		}
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public List<TerminalNode> TIPO() { return getTokens(RedstoneParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(RedstoneParser.TIPO, i);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACES() { return getToken(RedstoneParser.OPENBRACES, 0); }
		public Corpo_funçãoContext corpo_função() {
			return getRuleContext(Corpo_funçãoContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(RedstoneParser.CLOSEBRACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RedstoneParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RedstoneParser.COMMA, i);
		}
		public Assinatura_funçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assinatura_função; }
	}

	public final Assinatura_funçãoContext assinatura_função() throws RecognitionException {
		Assinatura_funçãoContext _localctx = new Assinatura_funçãoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assinatura_função);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(FUNCTION);
			setState(125);
			match(ID);
			setState(126);
			match(OPENPAR);
			setState(127);
			match(TIPO);
			setState(128);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(129);
				match(COMMA);
				setState(130);
				match(TIPO);
				setState(131);
				match(ID);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(CLOSEPAR);
			setState(138);
			match(OPENBRACES);
			setState(139);
			corpo_função();
			setState(140);
			match(CLOSEBRACES);
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

	public static class CondiçãoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RedstoneParser.IF, 0); }
		public List<TerminalNode> OPENPAR() { return getTokens(RedstoneParser.OPENPAR); }
		public TerminalNode OPENPAR(int i) {
			return getToken(RedstoneParser.OPENPAR, i);
		}
		public Expressão_relacionalContext expressão_relacional() {
			return getRuleContext(Expressão_relacionalContext.class,0);
		}
		public List<Corpo_funçãoContext> corpo_função() {
			return getRuleContexts(Corpo_funçãoContext.class);
		}
		public Corpo_funçãoContext corpo_função(int i) {
			return getRuleContext(Corpo_funçãoContext.class,i);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode ELSE() { return getToken(RedstoneParser.ELSE, 0); }
		public TerminalNode OPENBRACES() { return getToken(RedstoneParser.OPENBRACES, 0); }
		public TerminalNode CLOSEBRACES() { return getToken(RedstoneParser.CLOSEBRACES, 0); }
		public CondiçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condição; }
	}

	public final CondiçãoContext condição() throws RecognitionException {
		CondiçãoContext _localctx = new CondiçãoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condição);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IF);
			setState(143);
			match(OPENPAR);
			setState(144);
			expressão_relacional();
			setState(145);
			match(OPENPAR);
			setState(146);
			corpo_função();
			setState(147);
			match(CLOSEPAR);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(148);
				match(ELSE);
				setState(149);
				match(OPENBRACES);
				setState(150);
				corpo_função();
				setState(151);
				match(CLOSEBRACES);
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RedstoneParser.WHILE, 0); }
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public Expressão_relacionalContext expressão_relacional() {
			return getRuleContext(Expressão_relacionalContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACES() { return getToken(RedstoneParser.OPENBRACES, 0); }
		public Corpo_funçãoContext corpo_função() {
			return getRuleContext(Corpo_funçãoContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(RedstoneParser.CLOSEBRACES, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WHILE);
			setState(156);
			match(OPENPAR);
			setState(157);
			expressão_relacional();
			setState(158);
			match(CLOSEPAR);
			setState(159);
			match(OPENBRACES);
			setState(160);
			corpo_função();
			setState(161);
			match(CLOSEBRACES);
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

	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(RedstoneParser.WRITE, 0); }
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public Expressão_genéricaContext expressão_genérica() {
			return getRuleContext(Expressão_genéricaContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(WRITE);
			setState(164);
			match(OPENPAR);
			setState(165);
			expressão_genérica();
			setState(166);
			match(CLOSEPAR);
			setState(167);
			match(FF);
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

	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(RedstoneParser.READ, 0); }
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public TerminalNode ID() { return getToken(RedstoneParser.ID, 0); }
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(READ);
			setState(170);
			match(OPENPAR);
			setState(171);
			match(ID);
			setState(172);
			match(CLOSEPAR);
			setState(173);
			match(FF);
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

	public static class ComentárioContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(RedstoneParser.COMMENT, 0); }
		public ComentárioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentário; }
	}

	public final ComentárioContext comentário() throws RecognitionException {
		ComentárioContext _localctx = new ComentárioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comentário);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(COMMENT);
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

	public static class ComandoContext extends ParserRuleContext {
		public DeclaraçãoContext declaração() {
			return getRuleContext(DeclaraçãoContext.class,0);
		}
		public AtribuiçãoContext atribuição() {
			return getRuleContext(AtribuiçãoContext.class,0);
		}
		public Assinatura_funçãoContext assinatura_função() {
			return getRuleContext(Assinatura_funçãoContext.class,0);
		}
		public CondiçãoContext condição() {
			return getRuleContext(CondiçãoContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public ComentárioContext comentário() {
			return getRuleContext(ComentárioContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(177);
				declaração();
				}
				break;
			case 2:
				{
				setState(178);
				atribuição();
				}
				break;
			case 3:
				{
				setState(179);
				assinatura_função();
				}
				break;
			case 4:
				{
				setState(180);
				condição();
				}
				break;
			case 5:
				{
				setState(181);
				loop();
				}
				break;
			case 6:
				{
				setState(182);
				escrita();
				}
				break;
			case 7:
				{
				setState(183);
				leitura();
				}
				break;
			case 8:
				{
				setState(184);
				comentário();
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

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RedstoneParser.EOF, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << ATR) | (1L << ID) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << FUNCTION) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(187);
				comando();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f\3"+
		"\16\3\66\13\3\3\3\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\5\3C\n\3"+
		"\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6T"+
		"\n\6\3\6\3\6\3\6\3\6\5\6Z\n\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\5\7c\n"+
		"\7\3\7\3\7\3\7\3\7\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\7\bp\n\b\f\b\16\bs"+
		"\13\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bc\n\17"+
		"\3\20\7\20\u00bf\n\20\f\20\16\20\u00c2\13\20\3\20\3\20\3\20\2\2\21\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00d4\2 \3\2\2\2\4B\3\2\2\2"+
		"\6D\3\2\2\2\bL\3\2\2\2\nS\3\2\2\2\fb\3\2\2\2\16k\3\2\2\2\20~\3\2\2\2\22"+
		"\u0090\3\2\2\2\24\u009d\3\2\2\2\26\u00a5\3\2\2\2\30\u00ab\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00bb\3\2\2\2\36\u00c0\3\2\2\2 #\7\3\2\2!\"\7\31\2\2\"$\7"+
		"\32\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\n\2\2&\'\7\13\2\2\'\3\3\2\2"+
		"\2(C\7\f\2\2)C\7\n\2\2*C\7\r\2\2+C\7\25\2\2,C\7\24\2\2-.\7\n\2\2./\7\b"+
		"\2\2/\64\7\n\2\2\60\61\7\34\2\2\61\63\7\n\2\2\62\60\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67C\7\t\2"+
		"\289\7\27\2\29>\7\n\2\2:;\7\34\2\2;=\7\n\2\2<:\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AC\7\30\2\2B(\3\2\2\2B)\3\2\2\2B*\3"+
		"\2\2\2B+\3\2\2\2B,\3\2\2\2B-\3\2\2\2B8\3\2\2\2C\5\3\2\2\2DI\5\4\3\2EF"+
		"\7\5\2\2FH\5\4\3\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2"+
		"KI\3\2\2\2LM\5\4\3\2MN\7\6\2\2NO\5\4\3\2O\t\3\2\2\2PT\5\4\3\2QT\5\6\4"+
		"\2RT\5\b\5\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T]\3\2\2\2UY\7\7\2\2VZ\5\4\3"+
		"\2WZ\5\6\4\2XZ\5\b\5\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\\\3\2\2\2[U\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_]\3\2\2\2`c\5\2\2\2ac"+
		"\7\n\2\2b`\3\2\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\4\2\2ef\5\n\6\2f"+
		"g\7\13\2\2g\r\3\2\2\2hj\5\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2"+
		"\2lq\3\2\2\2mk\3\2\2\2np\5\f\7\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2rw\3\2\2\2sq\3\2\2\2tv\5\4\3\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2xz\3\2\2\2yw\3\2\2\2z{\7\33\2\2{|\5\4\3\2|}\7\13\2\2}\17\3\2\2\2~\177"+
		"\7\26\2\2\177\u0080\7\n\2\2\u0080\u0081\7\b\2\2\u0081\u0082\7\3\2\2\u0082"+
		"\u0088\7\n\2\2\u0083\u0084\7\34\2\2\u0084\u0085\7\3\2\2\u0085\u0087\7"+
		"\n\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\t"+
		"\2\2\u008c\u008d\7\27\2\2\u008d\u008e\5\16\b\2\u008e\u008f\7\30\2\2\u008f"+
		"\21\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5\b\5"+
		"\2\u0093\u0094\7\b\2\2\u0094\u0095\5\16\b\2\u0095\u009b\7\t\2\2\u0096"+
		"\u0097\7\22\2\2\u0097\u0098\7\27\2\2\u0098\u0099\5\16\b\2\u0099\u009a"+
		"\7\30\2\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\23\3\2\2\2\u009d\u009e\7\23\2\2\u009e\u009f\7\b\2\2\u009f\u00a0"+
		"\5\b\5\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3\5\16\b\2"+
		"\u00a3\u00a4\7\30\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a7"+
		"\7\b\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\7\13\2\2"+
		"\u00aa\27\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae"+
		"\7\n\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\7\13\2\2\u00b0\31\3\2\2\2\u00b1"+
		"\u00b2\7\35\2\2\u00b2\33\3\2\2\2\u00b3\u00bc\5\2\2\2\u00b4\u00bc\5\f\7"+
		"\2\u00b5\u00bc\5\20\t\2\u00b6\u00bc\5\22\n\2\u00b7\u00bc\5\24\13\2\u00b8"+
		"\u00bc\5\26\f\2\u00b9\u00bc\5\30\r\2\u00ba\u00bc\5\32\16\2\u00bb\u00b3"+
		"\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\35\3\2\2\2\u00bd\u00bf\5\34\17\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\2\2\3\u00c4\37\3\2\2\2\22#\64>"+
		"BISY]bkqw\u0088\u009b\u00bb\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}