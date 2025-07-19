package com.mycompany.trabalho_t5;

import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;

import static com.mycompany.trabalho_t5.LASemanticoUtils.verificarTipo;
import static com.mycompany.trabalho_t5.LASemanticoUtils.verificaCompatibilidade;
import static com.mycompany.trabalho_t5.LASemanticoUtils.confereTipo;
import static com.mycompany.trabalho_t5.LASemanticoUtils.addErroSemantico;

public class LogicaVisitor extends ParserLABaseVisitor<Void> {

    // Tabela de símbolos para o escopo atual.
    TabelaSimbolos tabela;

    // Gerenciador de escopos aninhados.
    static GerenciadorEscopos escoposAninhados = new GerenciadorEscopos();

    // Armazena os parâmetros de funções e procedimentos.
    static HashMap<String, ArrayList<Tipo>> dadosFuncaoProcedimento = new HashMap<>();

    // Armazena a definição de tipos de registro.
    HashMap<String, ArrayList<String>> tabelaRegistro = new HashMap<>();

    public TabelaSimbolos getTabelaSimbolos() {
        return escoposAninhados.obterEscopoAtual();
    }

    public HashMap<String, ArrayList<String>> getTabelaRegistro() {
        return tabelaRegistro;
    }

    public static HashMap<String, ArrayList<Tipo>> getDadosFuncaoProcedimento() {
        return dadosFuncaoProcedimento;
    }

    // Adiciona um símbolo à tabela do escopo atual e realiza validações.
    public void addSimboloTabela(String nome, String tipo, Token nomeT, Token tipoT, TipoEntrada tipoE) {
        TabelaSimbolos tabelaLocal = escoposAninhados.obterEscopoAtual();
        Tipo tipoItem;

        // Remove o ponteiro (^) do tipo, se presente.
        if (tipo.charAt(0) == '^') {
            tipo = tipo.substring(1);
        }

        // Converte o tipo textual para o enumerador Tipo.
        switch (tipo) {
            case "literal":
                tipoItem = Tipo.LITERAL;
                break;
            case "inteiro":
                tipoItem = Tipo.INTEIRO;
                break;
            case "real":
                tipoItem = Tipo.REAL;
                break;
            case "logico":
                tipoItem = Tipo.LOGICO;
                break;
            case "void":
                tipoItem = Tipo.VOID;
                break;
            case "registro":
                tipoItem = Tipo.REGISTRO;
                break;
            default:
                tipoItem = Tipo.INVALIDO;
                break;
        }

        // Emite erro se o tipo não for reconhecido.
        if (tipoItem == Tipo.INVALIDO) {
            addErroSemantico(tipoT, "tipo " + tipo + " nao declarado");
        }

        // Adiciona o símbolo ou reporta erro se já declarado.
        if (!tabelaLocal.existeSimbolo(nome)) {
            tabelaLocal.addSimbolo(nome, tipoItem, tipoE);
        } else {
            addErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
        }
    }

    @Override
    public Void visitPrograma(ParserLAParser.ProgramaContext ctx) {
        // Valida se 'retorne' é usado indevidamente no escopo principal.
        for (ParserLAParser.CmdContext c : ctx.corpo().cmd()) {
            if (c.cmdRetorne() != null) {
                addErroSemantico(c.getStart(), "comando retorne nao permitido nesse escopo");
            }
        }

        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(ParserLAParser.Declaracao_localContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();

        String tipoVariavel;
        String nomeVariavel;

        // Trata declarações de variáveis.
        if (ctx.getText().contains("declare")) {
            // Declaração de variável do tipo registro inline.
            if (ctx.variavel().tipo().registro() != null) {
                for (ParserLAParser.IdentificadorContext ic : ctx.variavel().identificador()) {
                    // Adiciona o nome do registro como variável do tipo 'registro'.
                    addSimboloTabela(ic.getText(), "registro", ic.getStart(), null, TipoEntrada.VARIAVEL);

                    // Adiciona os campos internos como variáveis qualificadas (ex: reg.campo).
                    for (ParserLAParser.VariavelContext vc : ctx.variavel().tipo().registro().variavel()) {
                        tipoVariavel = vc.tipo().getText();
                        for (ParserLAParser.IdentificadorContext icr : vc.identificador()) {
                            addSimboloTabela(ic.getText() + "." + icr.getText(), tipoVariavel, icr.getStart(), vc.tipo().getStart(), TipoEntrada.VARIAVEL);
                        }
                    }
                }
            } else {
                // Declaração de variável com tipo existente (básico ou registro).
                tipoVariavel = ctx.variavel().tipo().getText();

                // Se for um tipo registro já definido.
                if (tabelaRegistro.containsKey(tipoVariavel)) {
                    ArrayList<String> variaveisRegistro = tabelaRegistro.get(tipoVariavel);

                    for (ParserLAParser.IdentificadorContext ic : ctx.variavel().identificador()) {
                        nomeVariavel = ic.IDENT().get(0).getText();

                        // Reporta erro se o identificador já existe.
                        if (tabela.existeSimbolo(nomeVariavel) || tabelaRegistro.containsKey(nomeVariavel)) {
                            addErroSemantico(ic.getStart(), "identificador " + nomeVariavel + " ja declarado anteriormente");
                        } else {
                            // Adiciona a variável do tipo registro.
                            addSimboloTabela(nomeVariavel, "registro", ic.getStart(), ctx.variavel().tipo().getStart(), TipoEntrada.VARIAVEL);

                            // Adiciona os campos do registro com nomes qualificados (ex: var.campo).
                            for (int i = 0; i < variaveisRegistro.size(); i += 2) {
                                addSimboloTabela(nomeVariavel + "." + variaveisRegistro.get(i), variaveisRegistro.get(i + 1), ic.getStart(), ctx.variavel().tipo().getStart(), TipoEntrada.VARIAVEL);
                            }
                        }
                    }
                } else {
                    // Declaração de variável com tipo básico.
                    for (ParserLAParser.IdentificadorContext ident : ctx.variavel().identificador()) {
                        nomeVariavel = ident.getText();

                        // Verifica se o identificador colide com uma função ou procedimento.
                        if (dadosFuncaoProcedimento.containsKey(nomeVariavel)) {
                            addErroSemantico(ident.getStart(), "identificador " + nomeVariavel + " ja declarado anteriormente");
                        } else {
                            addSimboloTabela(nomeVariavel, tipoVariavel, ident.getStart(), ctx.variavel().tipo().getStart(), TipoEntrada.VARIAVEL);
                        }
                    }
                }
            }
        } else if (ctx.getText().contains("tipo")) {
            // Declaração de um novo tipo (registro).
            if (ctx.tipo().registro() != null) {
                ArrayList<String> variaveisRegistro = new ArrayList<>();

                // Coleta os campos e tipos do novo registro.
                for (ParserLAParser.VariavelContext vc : ctx.tipo().registro().variavel()) {
                    tipoVariavel = vc.tipo().getText();

                    for (ParserLAParser.IdentificadorContext ic : vc.identificador()) {
                        variaveisRegistro.add(ic.getText());
                        variaveisRegistro.add(tipoVariavel);
                    }
                }
                // Armazena o novo tipo de registro na tabela global de registros.
                tabelaRegistro.put(ctx.IDENT().getText(), variaveisRegistro);
            }
        } else if (ctx.getText().contains("constante")) {
            // Declaração de constante.
            addSimboloTabela(ctx.IDENT().getText(), ctx.tipo_basico().getText(), ctx.IDENT().getSymbol(), ctx.IDENT().getSymbol(), TipoEntrada.VARIAVEL);
        }

        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitDeclaracao_global(ParserLAParser.Declaracao_globalContext ctx) {
        // Cria novo escopo para o corpo da função ou procedimento.
        escoposAninhados.criarNovoEscopo();
        tabela = escoposAninhados.obterEscopoAtual();

        ArrayList<Tipo> tiposVariaveis = new ArrayList<>();
        Tipo tipoAux;
        ArrayList<String> varReg;

        if (ctx.getText().contains("procedimento")) {
            // Processa os parâmetros do procedimento.
            for (ParserLAParser.ParametroContext parametro : ctx.parametros().parametro()) {
                // Parâmetro de tipo básico.
                if (parametro.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                    addSimboloTabela(parametro.identificador().get(0).getText(), parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText(), parametro.getStart(), parametro.getStart(), TipoEntrada.VARIAVEL);
                    tipoAux = confereTipo(tabelaRegistro, parametro.tipo_estendido().getText());
                    tiposVariaveis.add(tipoAux);
                } // Parâmetro de tipo registro definido anteriormente.
                else if (tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())) {
                    varReg = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());
                    tipoAux = confereTipo(tabelaRegistro, parametro.tipo_estendido().getText());
                    tiposVariaveis.add(tipoAux);

                    // Adiciona os campos internos do registro como variáveis locais.
                    for (ParserLAParser.IdentificadorContext ic : parametro.identificador()) {
                        for (int i = 0; i < varReg.size(); i += 2) {
                            addSimboloTabela(ic.getText() + "." + varReg.get(i), varReg.get(i + 1), ic.getStart(), ic.getStart(), TipoEntrada.VARIAVEL);
                        }
                    }
                } else {
                    // Tipo do parâmetro não foi declarado.
                    addErroSemantico(parametro.getStart(), "tipo nao declarado");
                }
            }

            // Verifica presença indevida de 'retorne' em procedimentos.
            for (ParserLAParser.CmdContext c : ctx.cmd()) {
                if (c.cmdRetorne() != null) {
                    addErroSemantico(c.getStart(), "comando retorne nao permitido nesse escopo");
                }
            }

            dadosFuncaoProcedimento.put(ctx.IDENT().getText(), tiposVariaveis);

        } else if (ctx.getText().contains("funcao")) {
            // Processamento similar para funções.
            for (ParserLAParser.ParametroContext parametro : ctx.parametros().parametro()) {
                if (parametro.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                    addSimboloTabela(parametro.identificador().get(0).getText(), parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText(), parametro.getStart(), parametro.getStart(), TipoEntrada.VARIAVEL);
                    tipoAux = confereTipo(tabelaRegistro, parametro.tipo_estendido().getText());
                    tiposVariaveis.add(tipoAux);
                } else if (tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())) {
                    varReg = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());
                    tipoAux = confereTipo(tabelaRegistro, parametro.tipo_estendido().getText());
                    tiposVariaveis.add(tipoAux);

                    for (ParserLAParser.IdentificadorContext ic : parametro.identificador()) {
                        for (int i = 0; i < varReg.size(); i += 2) {
                            addSimboloTabela(ic.getText() + "." + varReg.get(i), varReg.get(i + 1), ic.getStart(), ic.getStart(), TipoEntrada.VARIAVEL);
                        }
                    }
                } else {
                    addErroSemantico(parametro.getStart(), "tipo nao declarado");
                }
            }

            dadosFuncaoProcedimento.put(ctx.IDENT().getText(), tiposVariaveis);
        }

        // Processa o corpo da função ou procedimento.
        super.visitDeclaracao_global(ctx);
        escoposAninhados.sairEscopo();

        // Adiciona o identificador global da função/procedimento.
        if (ctx.getText().contains("procedimento")) {
            addSimboloTabela(ctx.IDENT().getText(), "void", ctx.getStart(), ctx.getStart(), TipoEntrada.PROCEDIMENTO);
        } else if (ctx.getText().contains("funcao")) {
            addSimboloTabela(ctx.IDENT().getText(), ctx.tipo_estendido().tipo_basico_ident().tipo_basico().getText(), ctx.getStart(), ctx.getStart(), TipoEntrada.FUNCAO);
        }

        return null;
    }

    @Override
    public Void visitCmdEscreva(ParserLAParser.CmdEscrevaContext ctx) {
        // Verifica os tipos das expressões no 'escreva'.
        tabela = escoposAninhados.obterEscopoAtual();
        for (ParserLAParser.ExpressaoContext expressao : ctx.expressao()) {
            verificarTipo(tabela, expressao);
        }
        return super.visitCmdEscreva(ctx);
    }

    @Override
    public Void visitCmdLeia(ParserLAParser.CmdLeiaContext ctx) {
        // Verifica se os identificadores no 'leia' foram declarados.
        tabela = escoposAninhados.obterEscopoAtual();
        for (ParserLAParser.IdentificadorContext id : ctx.identificador()) {
            if (!tabela.existeSimbolo(id.getText())) {
                addErroSemantico(id.getStart(), "identificador " + id.getText() + " nao declarado");
            }
        }
        return super.visitCmdLeia(ctx);
    }

    @Override
    public Void visitCmdSe(ParserLAParser.CmdSeContext ctx) {
        // Verifica o tipo da expressão no 'se'.
        tabela = escoposAninhados.obterEscopoAtual();
        verificarTipo(tabela, ctx.expressao());
        return super.visitCmdSe(ctx);
    }

    @Override
    public Void visitCmdEnquanto(ParserLAParser.CmdEnquantoContext ctx) {
        // Verifica o tipo da expressão no 'enquanto'.
        tabela = escoposAninhados.obterEscopoAtual();
        verificarTipo(tabela, ctx.expressao());
        return super.visitCmdEnquanto(ctx);
    }

    @Override
    public Void visitCmdAtribuicao(ParserLAParser.CmdAtribuicaoContext ctx) {
        // Verifica a atribuição.
        tabela = escoposAninhados.obterEscopoAtual();
        Tipo tipoExpressao = verificarTipo(tabela, ctx.expressao());
        String varNome = ctx.identificador().getText();

        if (tipoExpressao != Tipo.INVALIDO) {
            if (!tabela.existeSimbolo(varNome)) {
                addErroSemantico(ctx.identificador().getStart(), "identificador " + varNome + " nao declarado");
            } else {
                Tipo varTipo = verificarTipo(tabela, varNome);

                if (varTipo == Tipo.INTEIRO || varTipo == Tipo.REAL) {
                    if (ctx.getText().contains("ponteiro")) {
                        if (!verificaCompatibilidade(varTipo, tipoExpressao) && tipoExpressao != Tipo.INTEIRO) {
                            addErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para ^" + varNome);
                        }
                    } else if (!verificaCompatibilidade(varTipo, tipoExpressao) && tipoExpressao != Tipo.INTEIRO) {
                        addErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + varNome);
                    }
                } else if (varTipo != tipoExpressao) {
                    addErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + varNome);
                }
            }
        }
        return super.visitCmdAtribuicao(ctx);
    }
}
