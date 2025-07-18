// Generated from grammar/ParserLA.g4 by ANTLR 4.13.2
package com.mycompany.trabalho_t4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserLAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserLAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ParserLAParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(ParserLAParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(ParserLAParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(ParserLAParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(ParserLAParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(ParserLAParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(ParserLAParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(ParserLAParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(ParserLAParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(ParserLAParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(ParserLAParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(ParserLAParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(ParserLAParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(ParserLAParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(ParserLAParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(ParserLAParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(ParserLAParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(ParserLAParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(ParserLAParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(ParserLAParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(ParserLAParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(ParserLAParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(ParserLAParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(ParserLAParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(ParserLAParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(ParserLAParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(ParserLAParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(ParserLAParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(ParserLAParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(ParserLAParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(ParserLAParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(ParserLAParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ParserLAParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(ParserLAParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(ParserLAParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(ParserLAParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(ParserLAParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(ParserLAParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(ParserLAParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ParserLAParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(ParserLAParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(ParserLAParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(ParserLAParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(ParserLAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(ParserLAParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(ParserLAParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(ParserLAParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserLAParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(ParserLAParser.Op_unarioContext ctx);
}