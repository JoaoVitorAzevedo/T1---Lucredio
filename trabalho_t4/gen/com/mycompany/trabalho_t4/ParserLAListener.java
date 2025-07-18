// Generated from grammar/ParserLA.g4 by ANTLR 4.13.2
package com.mycompany.trabalho_t4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserLAParser}.
 */
public interface ParserLAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ParserLAParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ParserLAParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(ParserLAParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(ParserLAParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(ParserLAParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(ParserLAParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(ParserLAParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(ParserLAParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(ParserLAParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(ParserLAParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(ParserLAParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(ParserLAParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(ParserLAParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(ParserLAParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ParserLAParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ParserLAParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(ParserLAParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(ParserLAParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(ParserLAParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(ParserLAParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(ParserLAParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(ParserLAParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(ParserLAParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(ParserLAParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(ParserLAParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(ParserLAParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(ParserLAParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(ParserLAParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(ParserLAParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(ParserLAParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(ParserLAParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(ParserLAParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(ParserLAParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(ParserLAParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(ParserLAParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(ParserLAParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(ParserLAParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(ParserLAParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(ParserLAParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(ParserLAParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(ParserLAParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(ParserLAParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(ParserLAParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(ParserLAParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(ParserLAParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(ParserLAParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(ParserLAParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(ParserLAParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(ParserLAParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(ParserLAParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(ParserLAParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(ParserLAParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(ParserLAParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(ParserLAParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(ParserLAParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(ParserLAParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(ParserLAParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(ParserLAParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(ParserLAParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(ParserLAParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(ParserLAParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(ParserLAParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(ParserLAParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(ParserLAParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ParserLAParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ParserLAParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(ParserLAParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(ParserLAParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(ParserLAParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(ParserLAParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(ParserLAParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(ParserLAParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(ParserLAParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(ParserLAParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(ParserLAParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(ParserLAParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(ParserLAParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(ParserLAParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ParserLAParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ParserLAParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(ParserLAParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(ParserLAParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(ParserLAParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(ParserLAParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(ParserLAParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(ParserLAParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(ParserLAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(ParserLAParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(ParserLAParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(ParserLAParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(ParserLAParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(ParserLAParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(ParserLAParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(ParserLAParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParserLAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(ParserLAParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserLAParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(ParserLAParser.Op_unarioContext ctx);
}