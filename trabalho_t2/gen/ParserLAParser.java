// Generated from grammar/ParserLA.g4 by ANTLR 4.13.2
package com.mycompany.trabalho_t2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserLAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DECLARE=2, LITERAL=3, INTEIRO=4, REAL=5, LOGICO=6, LEIA=7, 
		ESCREVA=8, FIM_ALGORITMO=9, SE=10, ENTAO=11, SENAO=12, FIM_SE=13, CASO=14, 
		SEJA=15, FIM_CASO=16, PARA=17, ATE=18, FACA=19, FIM_PARA=20, ENQUANTO=21, 
		FIM_ENQUANTO=22, REGISTRO=23, FIM_REGISTRO=24, TIPO=25, VAR=26, CONSTANTE=27, 
		PROCEDIMENTO=28, FIM_PROCEDIMENTO=29, FUNCAO=30, FIM_FUNCAO=31, RETORNE=32, 
		VERDADEIRO=33, FALSO=34, E=35, OU=36, NAO=37, ATRIBUICAO=38, OP_REL_DIF=39, 
		OP_REL_MAIOR_IGUAL=40, OP_REL_MENOR_IGUAL=41, INTERVALO=42, PONTO=43, 
		VIRGULA=44, DOIS_PONTOS=45, PONTO_E_VIRGULA=46, SOMA=47, SUBTRACAO=48, 
		MULTIPLICACAO=49, DIVISAO=50, ENDERECO=51, MODULO=52, PONTEIRO=53, ABRE_PARENTESES=54, 
		FECHA_PARENTESES=55, ABRE_COLCHETES=56, FECHA_COLCHETES=57, OP_REL_IGUAL=58, 
		OP_REL_MAIOR=59, OP_REL_MENOR=60, CADEIA=61, NUM_INT=62, NUM_REAL=63, 
		IDENT=64, COMENTARIO=65, WS=66, COMENTARIO_NAO_FECHADO=67, CADEIA_NAO_FECHADA=68, 
		SIMBOLO_NAO_IDENTIFICADO=69;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_estendido = 9, RULE_tipo_basico_ident = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametros = 14, RULE_parametro = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdLeia = 18, RULE_cmdEscreva = 19, RULE_cmdSe = 20, RULE_cmdCaso = 21, 
		RULE_selecao = 22, RULE_item_selecao = 23, RULE_constantes = 24, RULE_numero_intervalo = 25, 
		RULE_cmdPara = 26, RULE_cmdEnquanto = 27, RULE_cmdFaca = 28, RULE_cmdAtribuicao = 29, 
		RULE_cmdChamada = 30, RULE_cmdRetorne = 31, RULE_expressao = 32, RULE_termo_logico = 33, 
		RULE_fator_logico = 34, RULE_parcela_logica = 35, RULE_exp_relacional = 36, 
		RULE_op_relacional = 37, RULE_exp_aritmetica = 38, RULE_termo = 39, RULE_fator = 40, 
		RULE_parcela = 41, RULE_parcela_unario = 42, RULE_parcela_nao_unario = 43, 
		RULE_op1 = 44, RULE_op2 = 45, RULE_op3 = 46, RULE_op_unario = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_estendido", 
			"tipo_basico_ident", "valor_constante", "registro", "declaracao_global", 
			"parametros", "parametro", "corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", 
			"cmdCaso", "selecao", "item_selecao", "constantes", "numero_intervalo", 
			"cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", "cmdRetorne", 
			"expressao", "termo_logico", "fator_logico", "parcela_logica", "exp_relacional", 
			"op_relacional", "exp_aritmetica", "termo", "fator", "parcela", "parcela_unario", 
			"parcela_nao_unario", "op1", "op2", "op3", "op_unario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'declare'", "'literal'", "'inteiro'", "'real'", 
			"'logico'", "'leia'", "'escreva'", "'fim_algoritmo'", "'se'", "'entao'", 
			"'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'ate'", 
			"'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'registro'", 
			"'fim_registro'", "'tipo'", "'var'", "'constante'", "'procedimento'", 
			"'fim_procedimento'", "'funcao'", "'fim_funcao'", "'retorne'", "'verdadeiro'", 
			"'falso'", "'e'", "'ou'", "'nao'", "'<-'", "'<>'", "'>='", "'<='", "'..'", 
			"'.'", "','", "':'", "';'", "'+'", "'-'", "'*'", "'/'", "'&'", "'%'", 
			"'^'", "'('", "')'", "'['", "']'", "'='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DECLARE", "LITERAL", "INTEIRO", "REAL", "LOGICO", 
			"LEIA", "ESCREVA", "FIM_ALGORITMO", "SE", "ENTAO", "SENAO", "FIM_SE", 
			"CASO", "SEJA", "FIM_CASO", "PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", 
			"FIM_ENQUANTO", "REGISTRO", "FIM_REGISTRO", "TIPO", "VAR", "CONSTANTE", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "FIM_FUNCAO", "RETORNE", 
			"VERDADEIRO", "FALSO", "E", "OU", "NAO", "ATRIBUICAO", "OP_REL_DIF", 
			"OP_REL_MAIOR_IGUAL", "OP_REL_MENOR_IGUAL", "INTERVALO", "PONTO", "VIRGULA", 
			"DOIS_PONTOS", "PONTO_E_VIRGULA", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"DIVISAO", "ENDERECO", "MODULO", "PONTEIRO", "ABRE_PARENTESES", "FECHA_PARENTESES", 
			"ABRE_COLCHETES", "FECHA_COLCHETES", "OP_REL_IGUAL", "OP_REL_MAIOR", 
			"OP_REL_MENOR", "CADEIA", "NUM_INT", "NUM_REAL", "IDENT", "COMENTARIO", 
			"WS", "COMENTARIO_NAO_FECHADO", "CADEIA_NAO_FECHADA", "SIMBOLO_NAO_IDENTIFICADO"
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
	public String getGrammarFileName() { return "ParserLA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserLAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(ParserLAParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(ParserLAParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			declaracoes();
			setState(97);
			match(ALGORITMO);
			setState(98);
			corpo();
			setState(99);
			match(FIM_ALGORITMO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1509949444L) != 0)) {
				{
				{
				setState(101);
				decl_local_global();
				}
				}
				setState(106);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case TIPO:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				declaracao_global();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(ParserLAParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(ParserLAParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(ParserLAParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(ParserLAParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode OP_REL_IGUAL() { return getToken(ParserLAParser.OP_REL_IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(ParserLAParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(DECLARE);
				setState(112);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(CONSTANTE);
				setState(114);
				match(IDENT);
				setState(115);
				match(DOIS_PONTOS);
				setState(116);
				tipo_basico();
				setState(117);
				match(OP_REL_IGUAL);
				setState(118);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(TIPO);
				setState(121);
				match(IDENT);
				setState(122);
				match(DOIS_PONTOS);
				setState(123);
				tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(ParserLAParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			identificador();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(127);
				match(VIRGULA);
				setState(128);
				identificador();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(DOIS_PONTOS);
			setState(135);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ParserLAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ParserLAParser.IDENT, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(ParserLAParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(ParserLAParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IDENT);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(138);
				match(PONTO);
				setState(139);
				match(IDENT);
				}
				}
				setState(144);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(ParserLAParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(ParserLAParser.ABRE_COLCHETES, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(ParserLAParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(ParserLAParser.FECHA_COLCHETES, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETES) {
				{
				{
				setState(145);
				match(ABRE_COLCHETES);
				setState(146);
				exp_aritmetica();
				setState(147);
				match(FECHA_COLCHETES);
				}
				}
				setState(153);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				registro();
				}
				break;
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case PONTEIRO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ParserLAParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(ParserLAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(ParserLAParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(ParserLAParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(ParserLAParser.PONTEIRO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(160);
				match(PONTEIRO);
				}
			}

			setState(163);
			tipo_basico_ident();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(ParserLAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_basico_ident);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(ParserLAParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(ParserLAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(ParserLAParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(ParserLAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(ParserLAParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305842983443890176L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(ParserLAParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(ParserLAParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(REGISTRO);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(172);
				variavel();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(FIM_REGISTRO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(ParserLAParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(ParserLAParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(ParserLAParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(ParserLAParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(ParserLAParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(ParserLAParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(ParserLAParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(ParserLAParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(PROCEDIMENTO);
				setState(181);
				match(IDENT);
				setState(182);
				match(ABRE_PARENTESES);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(183);
					parametros();
					}
				}

				setState(186);
				match(FECHA_PARENTESES);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167772164L) != 0)) {
					{
					{
					setState(187);
					declaracao_local();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
					{
					{
					setState(193);
					cmd();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(FUNCAO);
				setState(201);
				match(IDENT);
				setState(202);
				match(ABRE_PARENTESES);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(203);
					parametros();
					}
				}

				setState(206);
				match(FECHA_PARENTESES);
				setState(207);
				match(DOIS_PONTOS);
				setState(208);
				tipo_estendido();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167772164L) != 0)) {
					{
					{
					setState(209);
					declaracao_local();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
					{
					{
					setState(215);
					cmd();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(FIM_FUNCAO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			parametro();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(226);
				match(VIRGULA);
				setState(227);
				parametro();
				}
				}
				setState(232);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(ParserLAParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ParserLAParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(233);
				match(VAR);
				}
			}

			setState(236);
			identificador();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(237);
				match(VIRGULA);
				setState(238);
				identificador();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(DOIS_PONTOS);
			setState(245);
			tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167772164L) != 0)) {
				{
				{
				setState(247);
				declaracao_local();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
				{
				{
				setState(253);
				cmd();
				}
				}
				setState(258);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(268);
				cmdRetorne();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(ParserLAParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(ParserLAParser.ABRE_PARENTESES, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(ParserLAParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> PONTEIRO() { return getTokens(ParserLAParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(ParserLAParser.PONTEIRO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdLeia(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LEIA);
			setState(272);
			match(ABRE_PARENTESES);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(273);
				match(PONTEIRO);
				}
			}

			setState(276);
			identificador();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(277);
				match(VIRGULA);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(278);
					match(PONTEIRO);
					}
				}

				setState(281);
				identificador();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(FECHA_PARENTESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(ParserLAParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(ParserLAParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(ParserLAParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdEscreva(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ESCREVA);
			setState(290);
			match(ABRE_PARENTESES);
			setState(291);
			expressao();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(292);
				match(VIRGULA);
				setState(293);
				expressao();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(FECHA_PARENTESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(ParserLAParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(ParserLAParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(ParserLAParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(ParserLAParser.SENAO, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(SE);
			setState(302);
			expressao();
			setState(303);
			match(ENTAO);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
				{
				{
				setState(304);
				cmd();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(310);
				match(SENAO);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
					{
					{
					setState(311);
					cmd();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(319);
			match(FIM_SE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(ParserLAParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(ParserLAParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(ParserLAParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(ParserLAParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdCaso(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CASO);
			setState(322);
			exp_aritmetica();
			setState(323);
			match(SEJA);
			setState(324);
			selecao();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(325);
				match(SENAO);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
					{
					{
					setState(326);
					cmd();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(334);
			match(FIM_CASO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				item_selecao();
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SUBTRACAO || _la==NUM_INT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(ParserLAParser.DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitItem_selecao(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			constantes();
			setState(342);
			match(DOIS_PONTOS);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
				{
				{
				setState(343);
				cmd();
				}
				}
				setState(348);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			numero_intervalo();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(350);
				match(VIRGULA);
				setState(351);
				numero_intervalo();
				}
				}
				setState(356);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(ParserLAParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(ParserLAParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode INTERVALO() { return getToken(ParserLAParser.INTERVALO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(357);
				op_unario();
				}
			}

			setState(360);
			match(NUM_INT);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERVALO) {
				{
				setState(361);
				match(INTERVALO);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(362);
					op_unario();
					}
				}

				setState(365);
				match(NUM_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(ParserLAParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(ParserLAParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(ParserLAParser.ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(ParserLAParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(ParserLAParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(ParserLAParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdPara(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(PARA);
			setState(369);
			match(IDENT);
			setState(370);
			match(ATRIBUICAO);
			setState(371);
			exp_aritmetica();
			setState(372);
			match(ATE);
			setState(373);
			exp_aritmetica();
			setState(374);
			match(FACA);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
				{
				{
				setState(375);
				cmd();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(FIM_PARA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(ParserLAParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(ParserLAParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(ParserLAParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ENQUANTO);
			setState(384);
			expressao();
			setState(385);
			match(FACA);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
				{
				{
				setState(386);
				cmd();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(FIM_ENQUANTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(ParserLAParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(ParserLAParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdFaca(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(FACA);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 144185556853609611L) != 0)) {
				{
				{
				setState(395);
				cmd();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(ATE);
			setState(402);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(ParserLAParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(ParserLAParser.PONTEIRO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdAtribuicao(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(404);
				match(PONTEIRO);
				}
			}

			setState(407);
			identificador();
			setState(408);
			match(ATRIBUICAO);
			setState(409);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ParserLAParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(ParserLAParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(ParserLAParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdChamada(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(IDENT);
			setState(412);
			match(ABRE_PARENTESES);
			setState(413);
			expressao();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(414);
				match(VIRGULA);
				setState(415);
				expressao();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			match(FECHA_PARENTESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(ParserLAParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitCmdRetorne(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(RETORNE);
			setState(424);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<TerminalNode> OU() { return getTokens(ParserLAParser.OU); }
		public TerminalNode OU(int i) {
			return getToken(ParserLAParser.OU, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			termo_logico();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(427);
				match(OU);
				setState(428);
				termo_logico();
				}
				}
				setState(433);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<TerminalNode> E() { return getTokens(ParserLAParser.E); }
		public TerminalNode E(int i) {
			return getToken(ParserLAParser.E, i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			fator_logico();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(435);
				match(E);
				setState(436);
				fator_logico();
				}
				}
				setState(441);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NAO() { return getToken(ParserLAParser.NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(442);
				match(NAO);
				}
			}

			setState(445);
			parcela_logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(ParserLAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(ParserLAParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parcela_logica);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(VERDADEIRO);
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(FALSO);
				}
				break;
			case SUBTRACAO:
			case ENDERECO:
			case PONTEIRO:
			case ABRE_PARENTESES:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				exp_relacional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			exp_aritmetica();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2017616481352679424L) != 0)) {
				{
				setState(453);
				op_relacional();
				setState(454);
				exp_aritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode OP_REL_IGUAL() { return getToken(ParserLAParser.OP_REL_IGUAL, 0); }
		public TerminalNode OP_REL_DIF() { return getToken(ParserLAParser.OP_REL_DIF, 0); }
		public TerminalNode OP_REL_MAIOR_IGUAL() { return getToken(ParserLAParser.OP_REL_MAIOR_IGUAL, 0); }
		public TerminalNode OP_REL_MENOR_IGUAL() { return getToken(ParserLAParser.OP_REL_MENOR_IGUAL, 0); }
		public TerminalNode OP_REL_MAIOR() { return getToken(ParserLAParser.OP_REL_MAIOR, 0); }
		public TerminalNode OP_REL_MENOR() { return getToken(ParserLAParser.OP_REL_MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2017616481352679424L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			termo();
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					op1();
					setState(462);
					termo();
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			fator();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(470);
				op2();
				setState(471);
				fator();
				}
				}
				setState(477);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			parcela();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULO) {
				{
				{
				setState(479);
				op3();
				setState(480);
				parcela();
				}
				}
				setState(486);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBTRACAO:
			case PONTEIRO:
			case ABRE_PARENTESES:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBTRACAO) {
					{
					setState(487);
					op_unario();
					}
				}

				setState(490);
				parcela_unario();
				}
				break;
			case ENDERECO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				parcela_nao_unario();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(ParserLAParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(ParserLAParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(ParserLAParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(ParserLAParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(ParserLAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(ParserLAParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(ParserLAParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(ParserLAParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_parcela_unario);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(494);
					match(PONTEIRO);
					}
				}

				setState(497);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(IDENT);
				setState(499);
				match(ABRE_PARENTESES);
				setState(500);
				expressao();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(501);
					match(VIRGULA);
					setState(502);
					expressao();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
				match(ABRE_PARENTESES);
				setState(513);
				expressao();
				setState(514);
				match(FECHA_PARENTESES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ENDERECO() { return getToken(ParserLAParser.ENDERECO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(ParserLAParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parcela_nao_unario);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(ENDERECO);
				setState(519);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(ParserLAParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(ParserLAParser.SUBTRACAO, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(ParserLAParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(ParserLAParser.DIVISAO, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(ParserLAParser.MODULO, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(MODULO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(ParserLAParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserLAListener ) ((ParserLAListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(SUBTRACAO);
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
		"\u0004\u0001E\u0214\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001g\b\u0001\n\u0001\f\u0001"+
		"j\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003}\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0082"+
		"\b\u0004\n\u0004\f\u0004\u0085\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008d\b\u0005\n\u0005"+
		"\f\u0005\u0090\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0096\b\u0006\n\u0006\f\u0006\u0099\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u009d\b\u0007\u0001\b\u0001\b\u0001\t\u0003\t\u00a2"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u00a8\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0005\f\u00ae\b\f\n\f\f\f\u00b1\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0001\r\u0001\r\u0005"+
		"\r\u00bd\b\r\n\r\f\r\u00c0\t\r\u0001\r\u0005\r\u00c3\b\r\n\r\f\r\u00c6"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00cd\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u00d3\b\r\n\r\f\r\u00d6\t\r\u0001\r\u0005"+
		"\r\u00d9\b\r\n\r\f\r\u00dc\t\r\u0001\r\u0001\r\u0003\r\u00e0\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e5\b\u000e\n\u000e\f\u000e"+
		"\u00e8\t\u000e\u0001\u000f\u0003\u000f\u00eb\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00f0\b\u000f\n\u000f\f\u000f\u00f3\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010\u00f9\b\u0010"+
		"\n\u0010\f\u0010\u00fc\t\u0010\u0001\u0010\u0005\u0010\u00ff\b\u0010\n"+
		"\u0010\f\u0010\u0102\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u010e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0113\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0118"+
		"\b\u0012\u0001\u0012\u0005\u0012\u011b\b\u0012\n\u0012\f\u0012\u011e\t"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0127\b\u0013\n\u0013\f\u0013\u012a\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0132\b\u0014\n\u0014\f\u0014\u0135\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0139\b\u0014\n\u0014\f\u0014\u013c\t\u0014\u0003\u0014"+
		"\u013e\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0148\b\u0015\n\u0015"+
		"\f\u0015\u014b\t\u0015\u0003\u0015\u014d\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0004\u0016\u0152\b\u0016\u000b\u0016\f\u0016\u0153\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0159\b\u0017\n\u0017\f\u0017"+
		"\u015c\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0161\b"+
		"\u0018\n\u0018\f\u0018\u0164\t\u0018\u0001\u0019\u0003\u0019\u0167\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u016c\b\u0019\u0001\u0019"+
		"\u0003\u0019\u016f\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0179\b\u001a"+
		"\n\u001a\f\u001a\u017c\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0184\b\u001b\n\u001b\f\u001b"+
		"\u0187\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u018d\b\u001c\n\u001c\f\u001c\u0190\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0003\u001d\u0196\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u01a1\b\u001e\n\u001e\f\u001e\u01a4\t\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0005 \u01ae\b \n \f \u01b1\t \u0001!\u0001!\u0001!\u0005!\u01b6\b!\n"+
		"!\f!\u01b9\t!\u0001\"\u0003\"\u01bc\b\"\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0003#\u01c3\b#\u0001$\u0001$\u0001$\u0001$\u0003$\u01c9\b$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u01d1\b&\n&\f&\u01d4\t&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0005\'\u01da\b\'\n\'\f\'\u01dd\t\'\u0001("+
		"\u0001(\u0001(\u0001(\u0005(\u01e3\b(\n(\f(\u01e6\t(\u0001)\u0003)\u01e9"+
		"\b)\u0001)\u0001)\u0003)\u01ed\b)\u0001*\u0003*\u01f0\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0005*\u01f8\b*\n*\f*\u01fb\t*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0205\b*\u0001+\u0001"+
		"+\u0001+\u0003+\u020a\b+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0000\u00000\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^\u0000\u0005\u0001\u0000\u0003\u0006\u0002\u0000!\"=?\u0002\u0000"+
		"\'):<\u0001\u0000/0\u0001\u000012\u0229\u0000`\u0001\u0000\u0000\u0000"+
		"\u0002h\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006|"+
		"\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u0089\u0001\u0000"+
		"\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000"+
		"\u0000\u0010\u009e\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000"+
		"\u0000\u0014\u00a7\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000"+
		"\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a\u00df\u0001\u0000\u0000"+
		"\u0000\u001c\u00e1\u0001\u0000\u0000\u0000\u001e\u00ea\u0001\u0000\u0000"+
		"\u0000 \u00fa\u0001\u0000\u0000\u0000\"\u010d\u0001\u0000\u0000\u0000"+
		"$\u010f\u0001\u0000\u0000\u0000&\u0121\u0001\u0000\u0000\u0000(\u012d"+
		"\u0001\u0000\u0000\u0000*\u0141\u0001\u0000\u0000\u0000,\u0151\u0001\u0000"+
		"\u0000\u0000.\u0155\u0001\u0000\u0000\u00000\u015d\u0001\u0000\u0000\u0000"+
		"2\u0166\u0001\u0000\u0000\u00004\u0170\u0001\u0000\u0000\u00006\u017f"+
		"\u0001\u0000\u0000\u00008\u018a\u0001\u0000\u0000\u0000:\u0195\u0001\u0000"+
		"\u0000\u0000<\u019b\u0001\u0000\u0000\u0000>\u01a7\u0001\u0000\u0000\u0000"+
		"@\u01aa\u0001\u0000\u0000\u0000B\u01b2\u0001\u0000\u0000\u0000D\u01bb"+
		"\u0001\u0000\u0000\u0000F\u01c2\u0001\u0000\u0000\u0000H\u01c4\u0001\u0000"+
		"\u0000\u0000J\u01ca\u0001\u0000\u0000\u0000L\u01cc\u0001\u0000\u0000\u0000"+
		"N\u01d5\u0001\u0000\u0000\u0000P\u01de\u0001\u0000\u0000\u0000R\u01ec"+
		"\u0001\u0000\u0000\u0000T\u0204\u0001\u0000\u0000\u0000V\u0209\u0001\u0000"+
		"\u0000\u0000X\u020b\u0001\u0000\u0000\u0000Z\u020d\u0001\u0000\u0000\u0000"+
		"\\\u020f\u0001\u0000\u0000\u0000^\u0211\u0001\u0000\u0000\u0000`a\u0003"+
		"\u0002\u0001\u0000ab\u0005\u0001\u0000\u0000bc\u0003 \u0010\u0000cd\u0005"+
		"\t\u0000\u0000d\u0001\u0001\u0000\u0000\u0000eg\u0003\u0004\u0002\u0000"+
		"fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000i\u0003\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000kn\u0003\u0006\u0003\u0000ln\u0003\u001a\r\u0000mk\u0001"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000"+
		"\u0000op\u0005\u0002\u0000\u0000p}\u0003\b\u0004\u0000qr\u0005\u001b\u0000"+
		"\u0000rs\u0005@\u0000\u0000st\u0005-\u0000\u0000tu\u0003\u0010\b\u0000"+
		"uv\u0005:\u0000\u0000vw\u0003\u0016\u000b\u0000w}\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0019\u0000\u0000yz\u0005@\u0000\u0000z{\u0005-\u0000\u0000{"+
		"}\u0003\u000e\u0007\u0000|o\u0001\u0000\u0000\u0000|q\u0001\u0000\u0000"+
		"\u0000|x\u0001\u0000\u0000\u0000}\u0007\u0001\u0000\u0000\u0000~\u0083"+
		"\u0003\n\u0005\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\u0082\u0003"+
		"\n\u0005\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005-\u0000\u0000\u0087\u0088\u0003\u000e\u0007"+
		"\u0000\u0088\t\u0001\u0000\u0000\u0000\u0089\u008e\u0005@\u0000\u0000"+
		"\u008a\u008b\u0005+\u0000\u0000\u008b\u008d\u0005@\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u000b"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u00058\u0000\u0000\u0092\u0093\u0003L&\u0000\u0093\u0094\u00059\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\r\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0003\u0018\f\u0000\u009b"+
		"\u009d\u0003\u0012\t\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u000f\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0007\u0000\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u00055\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003"+
		"\u0014\n\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a8\u0003\u0010"+
		"\b\u0000\u00a6\u00a8\u0005@\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u0015\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0007\u0001\u0000\u0000\u00aa\u0017\u0001\u0000\u0000"+
		"\u0000\u00ab\u00af\u0005\u0017\u0000\u0000\u00ac\u00ae\u0003\b\u0004\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0018\u0000\u0000\u00b3\u0019\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001c\u0000\u0000\u00b5\u00b6\u0005@\u0000\u0000\u00b6"+
		"\u00b8\u00056\u0000\u0000\u00b7\u00b9\u0003\u001c\u000e\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00be\u00057\u0000\u0000\u00bb\u00bd\u0003"+
		"\u0006\u0003\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c4\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c3\u0003\"\u0011\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00e0\u0005\u001d"+
		"\u0000\u0000\u00c8\u00c9\u0005\u001e\u0000\u0000\u00c9\u00ca\u0005@\u0000"+
		"\u0000\u00ca\u00cc\u00056\u0000\u0000\u00cb\u00cd\u0003\u001c\u000e\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u00057\u0000\u0000\u00cf"+
		"\u00d0\u0005-\u0000\u0000\u00d0\u00d4\u0003\u0012\t\u0000\u00d1\u00d3"+
		"\u0003\u0006\u0003\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00da\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003\"\u0011\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u001f\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00b4\u0001"+
		"\u0000\u0000\u0000\u00df\u00c8\u0001\u0000\u0000\u0000\u00e0\u001b\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e6\u0003\u001e\u000f\u0000\u00e2\u00e3\u0005"+
		",\u0000\u0000\u00e3\u00e5\u0003\u001e\u000f\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u001d\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005\u001a"+
		"\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00f1\u0003\n\u0005"+
		"\u0000\u00ed\u00ee\u0005,\u0000\u0000\u00ee\u00f0\u0003\n\u0005\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0005-\u0000\u0000\u00f5\u00f6\u0003\u0012\t\u0000\u00f6"+
		"\u001f\u0001\u0000\u0000\u0000\u00f7\u00f9\u0003\u0006\u0003\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u0100\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u0003\"\u0011\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101!\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u010e\u0003$\u0012\u0000\u0104\u010e\u0003&\u0013"+
		"\u0000\u0105\u010e\u0003(\u0014\u0000\u0106\u010e\u0003*\u0015\u0000\u0107"+
		"\u010e\u00034\u001a\u0000\u0108\u010e\u00036\u001b\u0000\u0109\u010e\u0003"+
		"8\u001c\u0000\u010a\u010e\u0003:\u001d\u0000\u010b\u010e\u0003<\u001e"+
		"\u0000\u010c\u010e\u0003>\u001f\u0000\u010d\u0103\u0001\u0000\u0000\u0000"+
		"\u010d\u0104\u0001\u0000\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000"+
		"\u010d\u0106\u0001\u0000\u0000\u0000\u010d\u0107\u0001\u0000\u0000\u0000"+
		"\u010d\u0108\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000"+
		"\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e#\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\u0007\u0000\u0000\u0110\u0112\u00056\u0000\u0000\u0111\u0113"+
		"\u00055\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u011c\u0003"+
		"\n\u0005\u0000\u0115\u0117\u0005,\u0000\u0000\u0116\u0118\u00055\u0000"+
		"\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0003\n\u0005\u0000"+
		"\u011a\u0115\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000"+
		"\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u00057\u0000\u0000\u0120%\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\b\u0000\u0000\u0122\u0123\u00056\u0000\u0000\u0123\u0128\u0003"+
		"@ \u0000\u0124\u0125\u0005,\u0000\u0000\u0125\u0127\u0003@ \u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u00057\u0000\u0000\u012c\'\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\n\u0000\u0000\u012e\u012f\u0003@ \u0000\u012f\u0133\u0005\u000b"+
		"\u0000\u0000\u0130\u0132\u0003\"\u0011\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u013d\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u013a\u0005\f\u0000\u0000"+
		"\u0137\u0139\u0003\"\u0011\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013d\u0136\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\r\u0000\u0000\u0140)\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0005\u000e\u0000\u0000\u0142\u0143\u0003L&\u0000\u0143\u0144\u0005\u000f"+
		"\u0000\u0000\u0144\u014c\u0003,\u0016\u0000\u0145\u0149\u0005\f\u0000"+
		"\u0000\u0146\u0148\u0003\"\u0011\u0000\u0147\u0146\u0001\u0000\u0000\u0000"+
		"\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u0145\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0005\u0010\u0000\u0000\u014f+\u0001\u0000\u0000\u0000\u0150"+
		"\u0152\u0003.\u0017\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154-\u0001\u0000\u0000\u0000\u0155\u0156\u0003"+
		"0\u0018\u0000\u0156\u015a\u0005-\u0000\u0000\u0157\u0159\u0003\"\u0011"+
		"\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b/\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u0162\u00032\u0019\u0000\u015e\u015f\u0005,\u0000\u0000\u015f\u0161"+
		"\u00032\u0019\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u01631\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0167\u0003^/\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\u016e\u0005>\u0000\u0000\u0169\u016b\u0005*\u0000\u0000\u016a\u016c"+
		"\u0003^/\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0005>\u0000"+
		"\u0000\u016e\u0169\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f3\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0011\u0000\u0000"+
		"\u0171\u0172\u0005@\u0000\u0000\u0172\u0173\u0005&\u0000\u0000\u0173\u0174"+
		"\u0003L&\u0000\u0174\u0175\u0005\u0012\u0000\u0000\u0175\u0176\u0003L"+
		"&\u0000\u0176\u017a\u0005\u0013\u0000\u0000\u0177\u0179\u0003\"\u0011"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005\u0014\u0000\u0000\u017e5\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\u0015\u0000\u0000\u0180\u0181\u0003@ \u0000\u0181\u0185"+
		"\u0005\u0013\u0000\u0000\u0182\u0184\u0003\"\u0011\u0000\u0183\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"\u0016\u0000\u0000\u01897\u0001\u0000\u0000\u0000\u018a\u018e\u0005\u0013"+
		"\u0000\u0000\u018b\u018d\u0003\"\u0011\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0012\u0000"+
		"\u0000\u0192\u0193\u0003@ \u0000\u01939\u0001\u0000\u0000\u0000\u0194"+
		"\u0196\u00055\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0003\n\u0005\u0000\u0198\u0199\u0005&\u0000\u0000\u0199\u019a\u0003"+
		"@ \u0000\u019a;\u0001\u0000\u0000\u0000\u019b\u019c\u0005@\u0000\u0000"+
		"\u019c\u019d\u00056\u0000\u0000\u019d\u01a2\u0003@ \u0000\u019e\u019f"+
		"\u0005,\u0000\u0000\u019f\u01a1\u0003@ \u0000\u01a0\u019e\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6\u00057\u0000"+
		"\u0000\u01a6=\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005 \u0000\u0000\u01a8"+
		"\u01a9\u0003@ \u0000\u01a9?\u0001\u0000\u0000\u0000\u01aa\u01af\u0003"+
		"B!\u0000\u01ab\u01ac\u0005$\u0000\u0000\u01ac\u01ae\u0003B!\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af"+
		"\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0"+
		"A\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b7"+
		"\u0003D\"\u0000\u01b3\u01b4\u0005#\u0000\u0000\u01b4\u01b6\u0003D\"\u0000"+
		"\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b8C\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0005%\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0003F#\u0000\u01beE\u0001\u0000\u0000\u0000\u01bf\u01c3\u0005!\u0000"+
		"\u0000\u01c0\u01c3\u0005\"\u0000\u0000\u01c1\u01c3\u0003H$\u0000\u01c2"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3G\u0001\u0000\u0000\u0000\u01c4\u01c8"+
		"\u0003L&\u0000\u01c5\u01c6\u0003J%\u0000\u01c6\u01c7\u0003L&\u0000\u01c7"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c9I\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0007\u0002\u0000\u0000\u01cbK\u0001\u0000\u0000\u0000\u01cc\u01d2\u0003"+
		"N\'\u0000\u01cd\u01ce\u0003X,\u0000\u01ce\u01cf\u0003N\'\u0000\u01cf\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d1\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3M\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d5\u01db\u0003P(\u0000\u01d6\u01d7\u0003Z-\u0000"+
		"\u01d7\u01d8\u0003P(\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d6"+
		"\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dcO\u0001"+
		"\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e4\u0003"+
		"R)\u0000\u01df\u01e0\u0003\\.\u0000\u01e0\u01e1\u0003R)\u0000\u01e1\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e3\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5Q\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e9\u0003^/\u0000\u01e8\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ed\u0003T*\u0000\u01eb\u01ed\u0003V+\u0000\u01ec\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01edS\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u00055\u0000\u0000\u01ef\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u0205\u0003\n\u0005\u0000\u01f2\u01f3\u0005@\u0000"+
		"\u0000\u01f3\u01f4\u00056\u0000\u0000\u01f4\u01f9\u0003@ \u0000\u01f5"+
		"\u01f6\u0005,\u0000\u0000\u01f6\u01f8\u0003@ \u0000\u01f7\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		"7\u0000\u0000\u01fd\u0205\u0001\u0000\u0000\u0000\u01fe\u0205\u0005>\u0000"+
		"\u0000\u01ff\u0205\u0005?\u0000\u0000\u0200\u0201\u00056\u0000\u0000\u0201"+
		"\u0202\u0003@ \u0000\u0202\u0203\u00057\u0000\u0000\u0203\u0205\u0001"+
		"\u0000\u0000\u0000\u0204\u01ef\u0001\u0000\u0000\u0000\u0204\u01f2\u0001"+
		"\u0000\u0000\u0000\u0204\u01fe\u0001\u0000\u0000\u0000\u0204\u01ff\u0001"+
		"\u0000\u0000\u0000\u0204\u0200\u0001\u0000\u0000\u0000\u0205U\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u00053\u0000\u0000\u0207\u020a\u0003\n\u0005"+
		"\u0000\u0208\u020a\u0005=\u0000\u0000\u0209\u0206\u0001\u0000\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u020aW\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0007\u0003\u0000\u0000\u020cY\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0007\u0004\u0000\u0000\u020e[\u0001\u0000\u0000\u0000\u020f\u0210\u0005"+
		"4\u0000\u0000\u0210]\u0001\u0000\u0000\u0000\u0211\u0212\u00050\u0000"+
		"\u0000\u0212_\u0001\u0000\u0000\u00009hm|\u0083\u008e\u0097\u009c\u00a1"+
		"\u00a7\u00af\u00b8\u00be\u00c4\u00cc\u00d4\u00da\u00df\u00e6\u00ea\u00f1"+
		"\u00fa\u0100\u010d\u0112\u0117\u011c\u0128\u0133\u013a\u013d\u0149\u014c"+
		"\u0153\u015a\u0162\u0166\u016b\u016e\u017a\u0185\u018e\u0195\u01a2\u01af"+
		"\u01b7\u01bb\u01c2\u01c8\u01d2\u01db\u01e4\u01e8\u01ec\u01ef\u01f9\u0204"+
		"\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}