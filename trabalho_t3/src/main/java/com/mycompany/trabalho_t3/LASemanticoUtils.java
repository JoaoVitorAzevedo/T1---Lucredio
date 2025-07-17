/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_t3;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class LASemanticoUtils extends ParserLABaseVisitor<Void> {

    TabelaSimbolos tabela;

    static GerenciadorEscopos escopos = new GerenciadorEscopos();

    static List<String> errosSemanticos = new ArrayList<>();

    TabelaSimbolos tabelaEscopo;

    // Adiciona uma variável à tabela de símbolos, verificando a validade do tipo e declarações duplicadas
    public void adicionaVariavelTabela(String nome, String tipo, Token nomeT, Token tipoT) {
        tabelaEscopo = escopos.obterEscopoAtual();

        Tipo tipoItem;

        // Mapeia o tipo em string para o tipo enum para análise semântica
        switch (tipo) {
            case "inteiro":
                tipoItem = Tipo.INTEIRO;
                break;
            case "real":
                tipoItem = Tipo.REAL;
                break;
            case "logico":
                tipoItem = Tipo.LOGICO;
                break;
            case "literal":
                tipoItem = Tipo.LITERAL;
                break;
            default:
                tipoItem = Tipo.INVALIDO;
                break;
        }

        // Erro se tipo for inválido
        if (tipoItem == Tipo.INVALIDO) {
            addErroSemantico(tipoT, "tipo " + tipo + " nao declarado");
        }

        // Verifica declarações anteriores
        if (!tabelaEscopo.existeSimbolo(nome)) {
            tabelaEscopo.addSimbolo(nome, tipoItem);
        } else {
            addErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
        }
    }

    // Inicializa tabela de símbolos
    @Override
    public Void visitPrograma(ParserLAParser.ProgramaContext ctx) {
        tabela = new TabelaSimbolos();
        return super.visitPrograma(ctx);
    }

    // Processa as declarações do programa
    @Override
    public Void visitDeclaracoes(ParserLAParser.DeclaracoesContext ctx) {
        tabela = escopos.obterEscopoAtual();

        // Visita todas as declarações no contexto
        for (ParserLAParser.Decl_local_globalContext declaracao : ctx.decl_local_global()) {
            visitDecl_local_global(declaracao);
        }

        return super.visitDeclaracoes(ctx);
    }

    // Decide se a declaração é local ou global e processa
    @Override
    public Void visitDecl_local_global(ParserLAParser.Decl_local_globalContext ctx) {
        tabela = escopos.obterEscopoAtual();

        if (ctx.declaracao_local() != null) {
            visitDeclaracao_local(ctx.declaracao_local());
        } else if (ctx.declaracao_global() != null) {
            visitDeclaracao_global(ctx.declaracao_global());
        }

        return super.visitDecl_local_global(ctx);
    }

    // Processa declarações locais e adiciona na TabelaSimbolos
    @Override
    public Void visitDeclaracao_local(ParserLAParser.Declaracao_localContext ctx) {
        tabela = escopos.obterEscopoAtual();

        String tipoVariavel, nomeVariavel;

        // Verifica se a declaração contém a palavra-chave "declare"
        if (ctx.getText().contains("declare")) {
            tipoVariavel = ctx.variavel().tipo().getText();

            // Adiciona cada identificador à tabela de símbolos
            for (ParserLAParser.IdentificadorContext ident : ctx.variavel().identificador()) {
                nomeVariavel = ident.getText();
                adicionaVariavelTabela(nomeVariavel, tipoVariavel, ident.getStart(), ctx.variavel().tipo().getStart());
            }
        }

        return super.visitDeclaracao_local(ctx);
    }

    // Verifica se os identificadores no comando de leitura estão declarados
    @Override
    public Void visitCmdLeia(ParserLAParser.CmdLeiaContext ctx) {
        tabela = escopos.obterEscopoAtual();

        // Reporta erro se algum identificador não estiver na tabela de símbolos
        for (ParserLAParser.IdentificadorContext id : ctx.identificador()) {
            if (!tabela.existeSimbolo(id.getText())) {
                addErroSemantico(id.getStart(), "identificador " + id.getText() + " nao declarado");
            }
        }

        return super.visitCmdLeia(ctx);
    }

    // Verifica o tipo das expressões no comando de escrita
    @Override
    public Void visitCmdEscreva(ParserLAParser.CmdEscrevaContext ctx) {
        tabela = escopos.obterEscopoAtual();

        // Analisa o tipo de cada expressão no comando
        for (ParserLAParser.ExpressaoContext expressao : ctx.expressao()) {
            verificarTipo(tabela, expressao);
        }

        return super.visitCmdEscreva(ctx);
    }

    // Verifica o tipo da expressão no comando enquanto (loop)
    @Override
    public Void visitCmdEnquanto(ParserLAParser.CmdEnquantoContext ctx) {
        tabela = escopos.obterEscopoAtual();

        // Verifica se a expressão do loop é válida
        Tipo tipo = verificarTipo(tabela, ctx.expressao());

        return super.visitCmdEnquanto(ctx);
    }

    // Verifica a compatibilidade de tipos em uma atribuição
    @Override
    public Void visitCmdAtribuicao(ParserLAParser.CmdAtribuicaoContext ctx) {
        tabela = escopos.obterEscopoAtual();

        // Verifica o tipo da expressão à direita da atribuição
        Tipo tipoExpressao = verificarTipo(tabela, ctx.expressao());

        String varNome = ctx.identificador().getText();

        if (tipoExpressao != Tipo.INVALIDO) {
            // Reporta erro se a variável não estiver declarada
            if (!tabela.existeSimbolo(varNome)) {
                addErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
            } else {
                Tipo varTipo = verificarTipo(tabela, varNome);

                // Verifica compatibilidade de tipos para números
                if (varTipo == Tipo.INTEIRO || varTipo == Tipo.REAL) {
                    if (!verificaCompatibilidade(varTipo, tipoExpressao)) {
                        if (tipoExpressao != Tipo.INTEIRO) {
                            addErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
                        }
                    }
                } else if (varTipo != tipoExpressao) // Reporta erro se os tipos não forem iguais para outros casos
                {
                    addErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
                }
            }
        }

        return super.visitCmdAtribuicao(ctx);
    }

    // Adiciona um erro semântico à lista, incluindo a linha do token
    public static void addErroSemantico(Token tok, String mensagem) {
        int linha = tok.getLine();

        // Evita duplicação de erros na mesma linha
        if (!errosSemanticos.contains("Linha " + linha + ": " + mensagem)) {
            errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
        }
    }

    // Verifica compatibilidade entre tipos numéricos (inteiro e real)
    public static boolean verificaCompatibilidade(Tipo T1, Tipo T2) {
        boolean flag = false;

        // Define regras de compatibilidade entre inteiro e real
        if (T1 == Tipo.INTEIRO && T2 == Tipo.REAL) {
            flag = true;
        } else if (T1 == Tipo.REAL && T2 == Tipo.INTEIRO) {
            flag = true;
        } else if (T1 == Tipo.REAL && T2 == Tipo.REAL) {
            flag = true;
        }

        return flag;
    }

    // Verifica compatibilidade para operações lógicas entre tipos numéricos
    public static boolean verificaCompatibilidadeLogica(Tipo T1, Tipo T2) {
        boolean flag = false;

        // Define compatibilidade para operações lógicas entre inteiro e real
        if (T1 == Tipo.INTEIRO && T2 == Tipo.REAL) {
            flag = true;
        } else if (T1 == Tipo.REAL && T2 == Tipo.INTEIRO) {
            flag = true;
        }

        return flag;
    }

    // Determina o tipo de uma expressão aritmética
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Exp_aritmeticaContext ctx) {
        // Começa verificando o tipo do primeiro termo
        Tipo tipoRetorno = verificarTipo(tabela, ctx.termo().get(0));

        // Analisa cada termo para determinar o tipo resultante
        for (var termoArit : ctx.termo()) {
            Tipo tipoAtual = verificarTipo(tabela, termoArit);

            // Promove para real se os tipos forem compatíveis
            if ((verificaCompatibilidade(tipoAtual, tipoRetorno)) && (tipoAtual != Tipo.INVALIDO)) {
                tipoRetorno = Tipo.REAL;
            } else {
                tipoRetorno = tipoAtual;
            }
        }

        return tipoRetorno;
    }

    // Determina o tipo de um termo em uma expressão aritmética
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.TermoContext ctx) {
        // Começa verificando o tipo do primeiro fator
        Tipo tipoRetorno = verificarTipo(tabela, ctx.fator().get(0));

        // Analisa cada fator para determinar o tipo resultante
        for (ParserLAParser.FatorContext fatorArit : ctx.fator()) {
            Tipo tipoAtual = verificarTipo(tabela, fatorArit);

            // Promove para real se os tipos forem compatíveis
            if ((verificaCompatibilidade(tipoAtual, tipoRetorno)) && (tipoAtual != Tipo.INVALIDO)) {
                tipoRetorno = Tipo.REAL;
            } else {
                tipoRetorno = tipoAtual;
            }
        }

        return tipoRetorno;
    }

    // Determina o tipo de um fator em uma expressão aritmética
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.FatorContext ctx) {
        Tipo tipoRetorno = null;

        // Propaga o tipo da parcela
        for (ParserLAParser.ParcelaContext parcela : ctx.parcela()) {
            tipoRetorno = verificarTipo(tabela, parcela);
        }

        return tipoRetorno;
    }

    // Determina o tipo de uma parcela, que pode ser unária ou não unária
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        } else {
            return verificarTipo(tabela, ctx.parcela_nao_unario());
        }
    }

    // Determina o tipo de uma parcela unária (identificador, número ou expressão)
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Parcela_unarioContext ctx) {
        Tipo tipoRetorno;
        String nome;

        if (ctx.identificador() != null) {
            nome = ctx.identificador().getText();

            // Verifica se o identificador existe no escopo atual
            if (tabela.existeSimbolo(nome)) {
                tipoRetorno = tabela.getTipo(nome);
            } else {
                // Busca em escopos aninhados se necessário
                TabelaSimbolos tabelaAux = LASemanticoUtils.escopos.percorrerEscoposAninhados().get(LASemanticoUtils.escopos.percorrerEscoposAninhados().size() - 1);
                if (!tabelaAux.existeSimbolo(nome)) {
                    addErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                    tipoRetorno = Tipo.INVALIDO;
                } else {
                    tipoRetorno = tabelaAux.getTipo(nome);
                }
            }
        } else if (ctx.NUM_INT() != null) {
            tipoRetorno = Tipo.INTEIRO;
        } else if (ctx.NUM_REAL() != null) {
            tipoRetorno = Tipo.REAL;
        } else {
            tipoRetorno = verificarTipo(tabela, ctx.expressao().get(0));
        }

        return tipoRetorno;
    }

    // Determina o tipo de uma parcela não unária (identificador ou literal)
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Parcela_nao_unarioContext ctx) {
        Tipo tipoRetorno;
        String nome;

        if (ctx.identificador() != null) {
            nome = ctx.identificador().getText();

            // Verifica se o identificador existe no escopo atual
            if (!tabela.existeSimbolo(nome)) {
                addErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                tipoRetorno = Tipo.INVALIDO;
            } else {
                tipoRetorno = tabela.getTipo(ctx.identificador().getText());
            }
        } else {
            tipoRetorno = Tipo.LITERAL;
        }

        return tipoRetorno;
    }

    // Determina o tipo de uma expressão lógica
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.ExpressaoContext ctx) {
        // Começa verificando o tipo do primeiro termo lógico
        Tipo tipoRetorno = verificarTipo(tabela, ctx.termo_logico(0));

        // Verifica consistência entre os termos lógicos
        for (ParserLAParser.Termo_logicoContext termoLogico : ctx.termo_logico()) {
            Tipo tipoAtual = verificarTipo(tabela, termoLogico);
            if (tipoRetorno != tipoAtual && tipoAtual != Tipo.INVALIDO) {
                tipoRetorno = Tipo.INVALIDO;
            }
        }

        return tipoRetorno;
    }

    // Determina o tipo de um termo lógico
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Termo_logicoContext ctx) {
        // Começa verificando o tipo do primeiro fator lógico
        Tipo tipoRetorno = verificarTipo(tabela, ctx.fator_logico(0));

        // Verifica consistência entre os fatores lógicos
        for (ParserLAParser.Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            Tipo tipoAtual = verificarTipo(tabela, fatorLogico);
            if (tipoRetorno != tipoAtual && tipoAtual != Tipo.INVALIDO) {
                tipoRetorno = Tipo.INVALIDO;
            }
        }
        return tipoRetorno;
    }

    // Determina o tipo de um fator lógico
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Fator_logicoContext ctx) {
        // Propaga o tipo da parcela lógica
        Tipo tipoRetorno = verificarTipo(tabela, ctx.parcela_logica());
        return tipoRetorno;
    }

    // Determina o tipo de uma parcela lógica
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Parcela_logicaContext ctx) {
        Tipo tipoRetorno;

        if (ctx.exp_relacional() != null) {
            tipoRetorno = verificarTipo(tabela, ctx.exp_relacional());
        } else {
            tipoRetorno = Tipo.LOGICO;
        }

        return tipoRetorno;
    }

    // Determina o tipo de uma expressão relacional
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Exp_relacionalContext ctx) {
        // Começa verificando o tipo da primeira expressão aritmética
        Tipo tipoRetorno = verificarTipo(tabela, ctx.exp_aritmetica().get(0));

        // Verifica compatibilidade entre as expressões relacionais
        if (ctx.exp_aritmetica().size() > 1) {
            Tipo tipoAtual = verificarTipo(tabela, ctx.exp_aritmetica().get(1));

            if (tipoRetorno == tipoAtual || verificaCompatibilidadeLogica(tipoRetorno, tipoAtual)) {
                tipoRetorno = Tipo.LOGICO;
            } else {
                tipoRetorno = Tipo.INVALIDO;
            }
        }

        return tipoRetorno;
    }

    // Obtém o tipo de uma variável da tabela de símbolos
    public static Tipo verificarTipo(TabelaSimbolos tabela, String nomeVar) {
        return tabela.getTipo(nomeVar);
    }
}
