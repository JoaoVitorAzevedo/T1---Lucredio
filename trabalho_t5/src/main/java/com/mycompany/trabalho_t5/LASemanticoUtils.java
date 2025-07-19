package com.mycompany.trabalho_t5;

import static com.mycompany.trabalho_t5.LogicaVisitor.dadosFuncaoProcedimento;
import static com.mycompany.trabalho_t5.LogicaVisitor.escoposAninhados;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;

public class LASemanticoUtils {

    // Lista para armazenar os erros semânticos encontrados.
    public static List<String> errosSemanticos = new ArrayList<>();

    // Adiciona uma mensagem de erro semântico à lista, evitando duplicatas.
    public static void addErroSemantico(Token tok, String mensagem) {
        int linha = tok.getLine();
        String erro = String.format("Linha %d: %s", linha, mensagem);

        if (!errosSemanticos.contains(erro)) {
            errosSemanticos.add(erro);
        }
    }

    // Verifica a compatibilidade de tipos para operações aritméticas.
    // Permite a mistura entre inteiro e real.
    public static boolean verificaCompatibilidade(Tipo T1, Tipo T2) {
        return (T1 == Tipo.INTEIRO && T2 == Tipo.REAL)
                || (T1 == Tipo.REAL && T2 == Tipo.INTEIRO)
                || (T1 == Tipo.REAL && T2 == Tipo.REAL);
    }

    // Verifica a compatibilidade de tipos para expressões relacionais (inteiro/real).
    public static boolean verificaCompatibilidadeLogica(Tipo T1, Tipo T2) {
        return (T1 == Tipo.INTEIRO && T2 == Tipo.REAL)
                || (T1 == Tipo.REAL && T2 == Tipo.INTEIRO);
    }

    // Reduz o nome de um identificador removendo a parte após o símbolo
    public static String cortarNoSimbolo(String nome, String simbolo) {
        if (nome.contains(simbolo)) {
            int i = 0;
            while (!nome.substring(i).startsWith(simbolo)) {
                i++;
            }
            nome = nome.substring(0, i);
        }
        return nome;
    }

    // Métodos recursivos para verificação de tipos em estruturas da linguagem.
    // Verifica o tipo de uma expressão aritmética.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Exp_aritmeticaContext ctx) {
        Tipo tipoRetorno = verificarTipo(tabela, ctx.termo().get(0));
        for (var termo : ctx.termo()) {
            Tipo tipoAtual = verificarTipo(tabela, termo);
            // Se houver mistura de tipos compatíveis, o resultado é REAL.
            if (verificaCompatibilidade(tipoAtual, tipoRetorno) && tipoAtual != Tipo.INVALIDO) {
                tipoRetorno = Tipo.REAL;
            } else {
                tipoRetorno = tipoAtual;
            }
        }
        return tipoRetorno;
    }

    // Verifica o tipo de um termo.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.TermoContext ctx) {
        Tipo tipoRetorno = verificarTipo(tabela, ctx.fator().get(0));
        for (var fator : ctx.fator()) {
            Tipo tipoAtual = verificarTipo(tabela, fator);
            if (verificaCompatibilidade(tipoAtual, tipoRetorno) && tipoAtual != Tipo.INVALIDO) {
                tipoRetorno = Tipo.REAL;
            } else {
                tipoRetorno = tipoAtual;
            }
        }
        return tipoRetorno;
    }

    // Verifica o tipo de um fator.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.FatorContext ctx) {
        Tipo tipoRetorno = null;
        for (var parcela : ctx.parcela()) {
            tipoRetorno = verificarTipo(tabela, parcela);
            // Para registros, resolve o nome base e verifica o tipo.
            if (tipoRetorno == Tipo.REGISTRO) {
                String nome = cortarNoSimbolo(parcela.getText(), "(");
                tipoRetorno = verificarTipo(tabela, nome);
            }
        }
        return tipoRetorno;
    }

    // Converte um String nome para o Tipo correspondente.
    // Trata ponteiros e verifica se o tipo é um registro definido.
    public static Tipo confereTipo(HashMap<String, ArrayList<String>> tabela, String tipoRetorno) {
        if (tipoRetorno.startsWith("^")) {
            tipoRetorno = tipoRetorno.substring(1);
        }

        if (tabela.containsKey(tipoRetorno)) {
            return Tipo.REGISTRO;
        }
        return switch (tipoRetorno) {
            case "literal" ->
                Tipo.LITERAL;
            case "inteiro" ->
                Tipo.INTEIRO;
            case "real" ->
                Tipo.REAL;
            case "logico" ->
                Tipo.LOGICO;
            default ->
                Tipo.INVALIDO;
        };
    }

    // Verifica o tipo de uma parcela (unária ou não unária).
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            return verificarTipo(tabela, ctx.parcela_unario());
        }
        return verificarTipo(tabela, ctx.parcela_nao_unario());
    }

    // Verifica o tipo de uma parcela unária.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Parcela_unarioContext ctx) {
        Tipo retorno = null;
        String nome;

        if (ctx.identificador() != null) {
            nome = ctx.identificador().getText();
            // Verifica se há uso de vetor (dimensão).
            if (ctx.identificador().dimensao() != null
                    && !ctx.identificador().dimensao().exp_aritmetica().isEmpty()) {
                nome = ctx.identificador().IDENT().get(0).getText();
            }

            // Verificando se o id existe.
            if (tabela.existeSimbolo(nome)) {
                retorno = tabela.getTipo(nome);
            } else {
                TabelaSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();
                if (!escopoAtual.existeSimbolo(nome)) {
                    addErroSemantico(ctx.identificador().getStart(), "identificador " + nome + " nao declarado");
                    retorno = Tipo.INVALIDO;
                } else {
                    retorno = escopoAtual.getTipo(nome);
                }
            }
        } else if (ctx.IDENT() != null) { // Chamada de função.
            String func = ctx.IDENT().getText();
            if (dadosFuncaoProcedimento.containsKey(func)) {
                List<Tipo> parametros = dadosFuncaoProcedimento.get(func);
                // Verificação da compatibilidade 
                if (parametros.size() == ctx.expressao().size()) {
                    for (int i = 0; i < ctx.expressao().size(); i++) {
                        if (parametros.get(i) != verificarTipo(tabela, ctx.expressao().get(i))) {
                            addErroSemantico(ctx.expressao().get(i).getStart(), "incompatibilidade de parametros na chamada de " + func);
                        }
                    }
                    // O tipo da expressão é o tipo de retorno da função.
                    retorno = parametros.get(parametros.size() - 1);
                } else {
                    addErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + func);
                    retorno = Tipo.INVALIDO;
                }
            } else {
                retorno = Tipo.INVALIDO;
            }
        } else if (ctx.NUM_INT() != null) {
            retorno = Tipo.INTEIRO;
        } else if (ctx.NUM_REAL() != null) {
            retorno = Tipo.REAL;
        } else // Expressão entre parênteses.
        {
            retorno = verificarTipo(tabela, ctx.expressao().get(0));
        }

        return retorno;
    }

    // Verifica o tipo de uma parcela não unária.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Parcela_nao_unarioContext ctx) {
        if (ctx.identificador() != null) {
            String nome = ctx.identificador().getText();
            if (!tabela.existeSimbolo(nome)) {
                addErroSemantico(ctx.identificador().getStart(), "identificador " + nome + " nao declarado");
                return Tipo.INVALIDO;
            }
            return tabela.getTipo(nome);
        }
        // Cadeia de caracteres.
        return Tipo.LITERAL;
    }

    // Verifica o tipo de uma expressão lógica.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.ExpressaoContext ctx) {
        Tipo tipoRetorno = verificarTipo(tabela, ctx.termo_logico(0));
        for (var termo : ctx.termo_logico()) {
            Tipo tipoAtual = verificarTipo(tabela, termo);
            if (tipoRetorno != tipoAtual && tipoAtual != Tipo.INVALIDO) {
                tipoRetorno = Tipo.INVALIDO;
            }
        }
        return tipoRetorno;
    }

    // Verifica o tipo de um termo lógico.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Termo_logicoContext ctx) {
        Tipo tipoRetorno = verificarTipo(tabela, ctx.fator_logico(0));
        for (var fator : ctx.fator_logico()) {
            Tipo tipoAtual = verificarTipo(tabela, fator);
            if (tipoRetorno != tipoAtual && tipoAtual != Tipo.INVALIDO) {
                tipoRetorno = Tipo.INVALIDO;
            }
        }
        return tipoRetorno;
    }

    // Verifica o tipo de um fator lógico.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Fator_logicoContext ctx) {
        return verificarTipo(tabela, ctx.parcela_logica());
    }

    // Verifica o tipo de uma parcela lógica.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Parcela_logicaContext ctx) {
        if (ctx.exp_relacional() != null) {
            return verificarTipo(tabela, ctx.exp_relacional());
        }
        return Tipo.LOGICO;
    }

    // Verifica o tipo de uma expressão relacional.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.Exp_relacionalContext ctx) {
        Tipo tipo1 = verificarTipo(tabela, ctx.exp_aritmetica().get(0));
        if (ctx.exp_aritmetica().size() > 1) {
            Tipo tipo2 = verificarTipo(tabela, ctx.exp_aritmetica().get(1));
            if (tipo1 == tipo2 || verificaCompatibilidadeLogica(tipo1, tipo2)) {
                return Tipo.LOGICO;
            } else {
                return Tipo.INVALIDO;
            }
        }
        return tipo1;
    }

    // Verifica o tipo de um identificador simples.
    public static Tipo verificarTipo(TabelaSimbolos tabela, ParserLAParser.IdentificadorContext ctx) {
        return tabela.getTipo(ctx.IDENT().get(0).getText());
    }

    // Verifica tipo dado apenas o nome da variável.
    public static Tipo verificarTipo(TabelaSimbolos tabela, String nomeVar) {
        return tabela.getTipo(nomeVar);
    }
}
