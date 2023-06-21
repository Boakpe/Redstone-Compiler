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
		RULE_declaração = 0, RULE_variavel = 1, RULE_valor = 2, RULE_expressão_aritmética = 3, 
		RULE_expressão_arimética_mais_genérica = 4, RULE_expressão_relacional = 5, 
		RULE_expressão_relacional_mais_genérica = 6, RULE_expressão_genérica = 7, 
		RULE_expressão_mais_genérica = 8, RULE_atribuição = 9, RULE_corpo_função = 10, 
		RULE_assinatura_função = 11, RULE_condição = 12, RULE_loop = 13, RULE_escrita = 14, 
		RULE_leitura = 15, RULE_comentário = 16, RULE_comando = 17, RULE_programa = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaração", "variavel", "valor", "expressão_aritmética", "expressão_arimética_mais_genérica", 
			"expressão_relacional", "expressão_relacional_mais_genérica", "expressão_genérica", 
			"expressão_mais_genérica", "atribuição", "corpo_função", "assinatura_função", 
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
		public DeclaraçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaração; }
	}

	public final DeclaraçãoContext declaração() throws RecognitionException {
		DeclaraçãoContext _localctx = new DeclaraçãoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaração);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(TIPO);
			setState(39);
			match(ID);
			setState(40);
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RedstoneParser.ID, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(RedstoneParser.OPENBRACKETS, 0); }
		public Expressão_mais_genéricaContext expressão_mais_genérica() {
			return getRuleContext(Expressão_mais_genéricaContext.class,0);
		}
		public TerminalNode CLOSEBRACKETS() { return getToken(RedstoneParser.CLOSEBRACKETS, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variavel);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ID);
				setState(44);
				match(OPENBRACKETS);
				setState(45);
				expressão_mais_genérica();
				setState(46);
				match(CLOSEBRACKETS);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(RedstoneParser.NUMINT, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode NUMREAL() { return getToken(RedstoneParser.NUMREAL, 0); }
		public TerminalNode STR() { return getToken(RedstoneParser.STR, 0); }
		public TerminalNode BOOLEAN() { return getToken(RedstoneParser.BOOLEAN, 0); }
		public List<TerminalNode> ID() { return getTokens(RedstoneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RedstoneParser.ID, i);
		}
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public List<Expressão_mais_genéricaContext> expressão_mais_genérica() {
			return getRuleContexts(Expressão_mais_genéricaContext.class);
		}
		public Expressão_mais_genéricaContext expressão_mais_genérica(int i) {
			return getRuleContext(Expressão_mais_genéricaContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_valor);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(NUMINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				variavel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(NUMREAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(STR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(ID);
				setState(56);
				match(OPENPAR);
				setState(57);
				expressão_mais_genérica();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58);
					match(COMMA);
					setState(59);
					expressão_mais_genérica();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				match(CLOSEPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(OPENBRACES);
				setState(68);
				match(ID);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(69);
					match(COMMA);
					setState(70);
					match(ID);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
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
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public List<TerminalNode> OPAR() { return getTokens(RedstoneParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(RedstoneParser.OPAR, i);
		}
		public List<Expressão_aritméticaContext> expressão_aritmética() {
			return getRuleContexts(Expressão_aritméticaContext.class);
		}
		public Expressão_aritméticaContext expressão_aritmética(int i) {
			return getRuleContext(Expressão_aritméticaContext.class,i);
		}
		public Expressão_aritméticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_aritmética; }
	}

	public final Expressão_aritméticaContext expressão_aritmética() throws RecognitionException {
		Expressão_aritméticaContext _localctx = new Expressão_aritméticaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressão_aritmética);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			valor();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(OPAR);
					setState(81);
					expressão_aritmética();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Expressão_arimética_mais_genéricaContext extends ParserRuleContext {
		public List<Expressão_aritméticaContext> expressão_aritmética() {
			return getRuleContexts(Expressão_aritméticaContext.class);
		}
		public Expressão_aritméticaContext expressão_aritmética(int i) {
			return getRuleContext(Expressão_aritméticaContext.class,i);
		}
		public List<TerminalNode> OPAR() { return getTokens(RedstoneParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(RedstoneParser.OPAR, i);
		}
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public List<Expressão_arimética_mais_genéricaContext> expressão_arimética_mais_genérica() {
			return getRuleContexts(Expressão_arimética_mais_genéricaContext.class);
		}
		public Expressão_arimética_mais_genéricaContext expressão_arimética_mais_genérica(int i) {
			return getRuleContext(Expressão_arimética_mais_genéricaContext.class,i);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public Expressão_arimética_mais_genéricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_arimética_mais_genérica; }
	}

	public final Expressão_arimética_mais_genéricaContext expressão_arimética_mais_genérica() throws RecognitionException {
		Expressão_arimética_mais_genéricaContext _localctx = new Expressão_arimética_mais_genéricaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressão_arimética_mais_genérica);
		try {
			int _alt;
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMINT:
			case NUMREAL:
			case BOOLEAN:
			case STR:
			case OPENBRACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				expressão_aritmética();
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						match(OPAR);
						setState(89);
						expressão_aritmética();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(OPENPAR);
				setState(96);
				expressão_arimética_mais_genérica();
				setState(97);
				match(CLOSEPAR);
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						match(OPAR);
						setState(99);
						expressão_arimética_mais_genérica();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode OPREL() { return getToken(RedstoneParser.OPREL, 0); }
		public Expressão_mais_genéricaContext expressão_mais_genérica() {
			return getRuleContext(Expressão_mais_genéricaContext.class,0);
		}
		public Expressão_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_relacional; }
	}

	public final Expressão_relacionalContext expressão_relacional() throws RecognitionException {
		Expressão_relacionalContext _localctx = new Expressão_relacionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressão_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			valor();
			setState(108);
			match(OPREL);
			setState(109);
			expressão_mais_genérica();
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

	public static class Expressão_relacional_mais_genéricaContext extends ParserRuleContext {
		public Expressão_relacionalContext expressão_relacional() {
			return getRuleContext(Expressão_relacionalContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public Expressão_relacional_mais_genéricaContext expressão_relacional_mais_genérica() {
			return getRuleContext(Expressão_relacional_mais_genéricaContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public Expressão_relacional_mais_genéricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_relacional_mais_genérica; }
	}

	public final Expressão_relacional_mais_genéricaContext expressão_relacional_mais_genérica() throws RecognitionException {
		Expressão_relacional_mais_genéricaContext _localctx = new Expressão_relacional_mais_genéricaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressão_relacional_mais_genérica);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMINT:
			case NUMREAL:
			case BOOLEAN:
			case STR:
			case OPENBRACES:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				expressão_relacional();
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(OPENPAR);
				setState(113);
				expressão_relacional_mais_genérica();
				setState(114);
				match(CLOSEPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<Expressão_arimética_mais_genéricaContext> expressão_arimética_mais_genérica() {
			return getRuleContexts(Expressão_arimética_mais_genéricaContext.class);
		}
		public Expressão_arimética_mais_genéricaContext expressão_arimética_mais_genérica(int i) {
			return getRuleContext(Expressão_arimética_mais_genéricaContext.class,i);
		}
		public List<Expressão_relacional_mais_genéricaContext> expressão_relacional_mais_genérica() {
			return getRuleContexts(Expressão_relacional_mais_genéricaContext.class);
		}
		public Expressão_relacional_mais_genéricaContext expressão_relacional_mais_genérica(int i) {
			return getRuleContext(Expressão_relacional_mais_genéricaContext.class,i);
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
		enterRule(_localctx, 14, RULE_expressão_genérica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
				valor();
				}
				break;
			case 2:
				{
				setState(119);
				expressão_arimética_mais_genérica();
				}
				break;
			case 3:
				{
				setState(120);
				expressão_relacional_mais_genérica();
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(OPLOG);
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(124);
						valor();
						}
						break;
					case 2:
						{
						setState(125);
						expressão_arimética_mais_genérica();
						}
						break;
					case 3:
						{
						setState(126);
						expressão_relacional_mais_genérica();
						}
						break;
					}
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Expressão_mais_genéricaContext extends ParserRuleContext {
		public Expressão_genéricaContext expressão_genérica() {
			return getRuleContext(Expressão_genéricaContext.class,0);
		}
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public Expressão_mais_genéricaContext expressão_mais_genérica() {
			return getRuleContext(Expressão_mais_genéricaContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public Expressão_mais_genéricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressão_mais_genérica; }
	}

	public final Expressão_mais_genéricaContext expressão_mais_genérica() throws RecognitionException {
		Expressão_mais_genéricaContext _localctx = new Expressão_mais_genéricaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressão_mais_genérica);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				expressão_genérica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(OPENPAR);
				setState(136);
				expressão_mais_genérica();
				setState(137);
				match(CLOSEPAR);
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

	public static class AtribuiçãoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode ATR() { return getToken(RedstoneParser.ATR, 0); }
		public Expressão_mais_genéricaContext expressão_mais_genérica() {
			return getRuleContext(Expressão_mais_genéricaContext.class,0);
		}
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public AtribuiçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuição; }
	}

	public final AtribuiçãoContext atribuição() throws RecognitionException {
		AtribuiçãoContext _localctx = new AtribuiçãoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuição);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			variavel();
			setState(142);
			match(ATR);
			setState(143);
			expressão_mais_genérica();
			setState(144);
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
		public List<CondiçãoContext> condição() {
			return getRuleContexts(CondiçãoContext.class);
		}
		public CondiçãoContext condição(int i) {
			return getRuleContext(CondiçãoContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<EscritaContext> escrita() {
			return getRuleContexts(EscritaContext.class);
		}
		public EscritaContext escrita(int i) {
			return getRuleContext(EscritaContext.class,i);
		}
		public List<LeituraContext> leitura() {
			return getRuleContexts(LeituraContext.class);
		}
		public LeituraContext leitura(int i) {
			return getRuleContext(LeituraContext.class,i);
		}
		public List<ComentárioContext> comentário() {
			return getRuleContexts(ComentárioContext.class);
		}
		public ComentárioContext comentário(int i) {
			return getRuleContext(ComentárioContext.class,i);
		}
		public List<TerminalNode> RETURN() { return getTokens(RedstoneParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(RedstoneParser.RETURN, i);
		}
		public List<Expressão_mais_genéricaContext> expressão_mais_genérica() {
			return getRuleContexts(Expressão_mais_genéricaContext.class);
		}
		public Expressão_mais_genéricaContext expressão_mais_genérica(int i) {
			return getRuleContext(Expressão_mais_genéricaContext.class,i);
		}
		public List<TerminalNode> FF() { return getTokens(RedstoneParser.FF); }
		public TerminalNode FF(int i) {
			return getToken(RedstoneParser.FF, i);
		}
		public Corpo_funçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_função; }
	}

	public final Corpo_funçãoContext corpo_função() throws RecognitionException {
		Corpo_funçãoContext _localctx = new Corpo_funçãoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_corpo_função);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << ID) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << COMMENT))) != 0)) {
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIPO:
					{
					{
					setState(146);
					declaração();
					}
					}
					break;
				case ID:
					{
					{
					setState(147);
					atribuição();
					}
					}
					break;
				case IF:
					{
					{
					setState(148);
					condição();
					}
					}
					break;
				case WHILE:
					{
					{
					setState(149);
					loop();
					}
					}
					break;
				case WRITE:
					{
					{
					setState(150);
					escrita();
					}
					}
					break;
				case READ:
					{
					{
					setState(151);
					leitura();
					}
					}
					break;
				case COMMENT:
					{
					{
					setState(152);
					comentário();
					}
					}
					break;
				case RETURN:
					{
					{
					setState(153);
					match(RETURN);
					setState(154);
					expressão_mais_genérica();
					setState(155);
					match(FF);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(161);
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

	public static class Assinatura_funçãoContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(RedstoneParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(RedstoneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RedstoneParser.ID, i);
		}
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode OPENBRACES() { return getToken(RedstoneParser.OPENBRACES, 0); }
		public Corpo_funçãoContext corpo_função() {
			return getRuleContext(Corpo_funçãoContext.class,0);
		}
		public TerminalNode CLOSEBRACES() { return getToken(RedstoneParser.CLOSEBRACES, 0); }
		public List<TerminalNode> TIPO() { return getTokens(RedstoneParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(RedstoneParser.TIPO, i);
		}
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
		enterRule(_localctx, 22, RULE_assinatura_função);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(FUNCTION);
			setState(163);
			match(ID);
			setState(164);
			match(OPENPAR);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(165);
				match(TIPO);
				setState(166);
				match(ID);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(167);
					match(COMMA);
					setState(168);
					match(TIPO);
					setState(169);
					match(ID);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(177);
			match(CLOSEPAR);
			setState(178);
			match(OPENBRACES);
			setState(179);
			corpo_função();
			setState(180);
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
		public TerminalNode OPENPAR() { return getToken(RedstoneParser.OPENPAR, 0); }
		public Expressão_relacional_mais_genéricaContext expressão_relacional_mais_genérica() {
			return getRuleContext(Expressão_relacional_mais_genéricaContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public List<TerminalNode> OPENBRACES() { return getTokens(RedstoneParser.OPENBRACES); }
		public TerminalNode OPENBRACES(int i) {
			return getToken(RedstoneParser.OPENBRACES, i);
		}
		public List<Corpo_funçãoContext> corpo_função() {
			return getRuleContexts(Corpo_funçãoContext.class);
		}
		public Corpo_funçãoContext corpo_função(int i) {
			return getRuleContext(Corpo_funçãoContext.class,i);
		}
		public List<TerminalNode> CLOSEBRACES() { return getTokens(RedstoneParser.CLOSEBRACES); }
		public TerminalNode CLOSEBRACES(int i) {
			return getToken(RedstoneParser.CLOSEBRACES, i);
		}
		public TerminalNode ELSE() { return getToken(RedstoneParser.ELSE, 0); }
		public CondiçãoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condição; }
	}

	public final CondiçãoContext condição() throws RecognitionException {
		CondiçãoContext _localctx = new CondiçãoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condição);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(IF);
			setState(183);
			match(OPENPAR);
			setState(184);
			expressão_relacional_mais_genérica();
			setState(185);
			match(CLOSEPAR);
			setState(186);
			match(OPENBRACES);
			setState(187);
			corpo_função();
			setState(188);
			match(CLOSEBRACES);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(189);
				match(ELSE);
				setState(190);
				match(OPENBRACES);
				setState(191);
				corpo_função();
				setState(192);
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
		public Expressão_relacional_mais_genéricaContext expressão_relacional_mais_genérica() {
			return getRuleContext(Expressão_relacional_mais_genéricaContext.class,0);
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
		enterRule(_localctx, 26, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(WHILE);
			setState(197);
			match(OPENPAR);
			setState(198);
			expressão_relacional_mais_genérica();
			setState(199);
			match(CLOSEPAR);
			setState(200);
			match(OPENBRACES);
			setState(201);
			corpo_função();
			setState(202);
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
		public Expressão_mais_genéricaContext expressão_mais_genérica() {
			return getRuleContext(Expressão_mais_genéricaContext.class,0);
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
		enterRule(_localctx, 28, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(WRITE);
			setState(205);
			match(OPENPAR);
			setState(206);
			expressão_mais_genérica();
			setState(207);
			match(CLOSEPAR);
			setState(208);
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
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(RedstoneParser.CLOSEPAR, 0); }
		public TerminalNode FF() { return getToken(RedstoneParser.FF, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(READ);
			setState(211);
			match(OPENPAR);
			setState(212);
			variavel();
			setState(213);
			match(CLOSEPAR);
			setState(214);
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
		enterRule(_localctx, 32, RULE_comentário);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 34, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(218);
				declaração();
				}
				break;
			case ID:
				{
				setState(219);
				atribuição();
				}
				break;
			case FUNCTION:
				{
				setState(220);
				assinatura_função();
				}
				break;
			case IF:
				{
				setState(221);
				condição();
				}
				break;
			case WHILE:
				{
				setState(222);
				loop();
				}
				break;
			case WRITE:
				{
				setState(223);
				escrita();
				}
				break;
			case READ:
				{
				setState(224);
				leitura();
				}
				break;
			case COMMENT:
				{
				setState(225);
				comentário();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 36, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << ID) | (1L << READ) | (1L << WRITE) | (1L << IF) | (1L << WHILE) | (1L << FUNCTION) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(228);
				comando();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00ef\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\5\4P\n\4\3\5\3\5\3\5"+
		"\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\5\bw\n\b\3\t\3\t\3\t\5\t|\n\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t"+
		"\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00a0\n\f\f\f\16\f\u00a3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ad"+
		"\n\r\f\r\16\r\u00b0\13\r\5\r\u00b2\n\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c5\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00e5\n\23\3\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24\3\24"+
		"\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u0102"+
		"\2(\3\2\2\2\4\62\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\nk\3\2\2\2\fm\3\2\2\2\16"+
		"v\3\2\2\2\20{\3\2\2\2\22\u008d\3\2\2\2\24\u008f\3\2\2\2\26\u00a1\3\2\2"+
		"\2\30\u00a4\3\2\2\2\32\u00b8\3\2\2\2\34\u00c6\3\2\2\2\36\u00ce\3\2\2\2"+
		" \u00d4\3\2\2\2\"\u00da\3\2\2\2$\u00e4\3\2\2\2&\u00e9\3\2\2\2()\7\3\2"+
		"\2)*\7\n\2\2*+\7\13\2\2+\3\3\2\2\2,\63\7\n\2\2-.\7\n\2\2./\7\31\2\2/\60"+
		"\5\22\n\2\60\61\7\32\2\2\61\63\3\2\2\2\62,\3\2\2\2\62-\3\2\2\2\63\5\3"+
		"\2\2\2\64P\7\f\2\2\65P\5\4\3\2\66P\7\r\2\2\67P\7\25\2\28P\7\24\2\29:\7"+
		"\n\2\2:;\7\b\2\2;@\5\22\n\2<=\7\34\2\2=?\5\22\n\2><\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\t\2\2DP\3\2\2\2EF\7\27\2"+
		"\2FK\7\n\2\2GH\7\34\2\2HJ\7\n\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2LN\3\2\2\2MK\3\2\2\2NP\7\30\2\2O\64\3\2\2\2O\65\3\2\2\2O\66\3\2\2"+
		"\2O\67\3\2\2\2O8\3\2\2\2O9\3\2\2\2OE\3\2\2\2P\7\3\2\2\2QV\5\6\4\2RS\7"+
		"\5\2\2SU\5\b\5\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XV"+
		"\3\2\2\2Y^\5\b\5\2Z[\7\5\2\2[]\5\b\5\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_l\3\2\2\2`^\3\2\2\2ab\7\b\2\2bc\5\n\6\2ch\7\t\2\2de\7\5\2\2"+
		"eg\5\n\6\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"kY\3\2\2\2ka\3\2\2\2l\13\3\2\2\2mn\5\6\4\2no\7\6\2\2op\5\22\n\2p\r\3\2"+
		"\2\2qw\5\f\7\2rs\7\b\2\2st\5\16\b\2tu\7\t\2\2uw\3\2\2\2vq\3\2\2\2vr\3"+
		"\2\2\2w\17\3\2\2\2x|\5\6\4\2y|\5\n\6\2z|\5\16\b\2{x\3\2\2\2{y\3\2\2\2"+
		"{z\3\2\2\2|\u0085\3\2\2\2}\u0081\7\7\2\2~\u0082\5\6\4\2\177\u0082\5\n"+
		"\6\2\u0080\u0082\5\16\b\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083}\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u008e\5\20\t\2\u0089\u008a\7\b\2\2\u008a\u008b\5\22\n\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2"+
		"\2\2\u008e\23\3\2\2\2\u008f\u0090\5\4\3\2\u0090\u0091\7\4\2\2\u0091\u0092"+
		"\5\22\n\2\u0092\u0093\7\13\2\2\u0093\25\3\2\2\2\u0094\u00a0\5\2\2\2\u0095"+
		"\u00a0\5\24\13\2\u0096\u00a0\5\32\16\2\u0097\u00a0\5\34\17\2\u0098\u00a0"+
		"\5\36\20\2\u0099\u00a0\5 \21\2\u009a\u00a0\5\"\22\2\u009b\u009c\7\33\2"+
		"\2\u009c\u009d\5\22\n\2\u009d\u009e\7\13\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u0094\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0097\3\2"+
		"\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\27\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6"+
		"\7\n\2\2\u00a6\u00b1\7\b\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00ae\7\n\2\2\u00a9"+
		"\u00aa\7\34\2\2\u00aa\u00ab\7\3\2\2\u00ab\u00ad\7\n\2\2\u00ac\u00a9\3"+
		"\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\t\2\2\u00b4\u00b5\7\27\2\2\u00b5"+
		"\u00b6\5\26\f\2\u00b6\u00b7\7\30\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\7\21"+
		"\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\7\t\2\2\u00bc"+
		"\u00bd\7\27\2\2\u00bd\u00be\5\26\f\2\u00be\u00c4\7\30\2\2\u00bf\u00c0"+
		"\7\22\2\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3\7\30\2"+
		"\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\33"+
		"\3\2\2\2\u00c6\u00c7\7\23\2\2\u00c7\u00c8\7\b\2\2\u00c8\u00c9\5\16\b\2"+
		"\u00c9\u00ca\7\t\2\2\u00ca\u00cb\7\27\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd"+
		"\7\30\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\7\b\2\2\u00d0"+
		"\u00d1\5\22\n\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\7\13\2\2\u00d3\37\3\2"+
		"\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\5\4\3\2\u00d7"+
		"\u00d8\7\t\2\2\u00d8\u00d9\7\13\2\2\u00d9!\3\2\2\2\u00da\u00db\7\35\2"+
		"\2\u00db#\3\2\2\2\u00dc\u00e5\5\2\2\2\u00dd\u00e5\5\24\13\2\u00de\u00e5"+
		"\5\30\r\2\u00df\u00e5\5\32\16\2\u00e0\u00e5\5\34\17\2\u00e1\u00e5\5\36"+
		"\20\2\u00e2\u00e5\5 \21\2\u00e3\u00e5\5\"\22\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00dd\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2"+
		"\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"%\3\2\2\2\u00e6\u00e8\5$\23\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\7\2\2\3\u00ed\'\3\2\2\2\26\62@KOV^hkv{\u0081\u0085"+
		"\u008d\u009f\u00a1\u00ae\u00b1\u00c4\u00e4\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}