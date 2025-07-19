package com.mycompany.trabalho_t5;

import static com.mycompany.trabalho_t5.LASemanticoUtils.verificarTipo;

public class GeradorCodigo extends ParserLABaseVisitor<Void> {

    // Armazena o código C que está sendo gerado.
    StringBuilder codGerado = new StringBuilder();

    // Tabela de símbolos para consulta de tipos.
    TabelaSimbolos tabelaDeSimbolos = new TabelaSimbolos();

    // Gerencia os escopos do código sendo gerado.
    GerenciadorEscopos gerenciadorDeEscopos = new GerenciadorEscopos();

    // Gerencia escopos para a análise semântica.
    static GerenciadorEscopos escoposAninhadosParaSemantica = new GerenciadorEscopos();

    // Controla o nível de identação do código gerado.
    private int ident = 0;

    // Retorna os espaços para a identação atual.
    private String ident() {
        return "    ".repeat(ident);
    }

    public GeradorCodigo() {

    }
    
    // Converte um tipo do enum para sua representação em C.
    public String converterTipoParaString(Tipo tipoEnum) {
        if (tipoEnum == null) {
            return null;
        }
        return switch (tipoEnum) {
            case INTEIRO ->
                "int";
            case LITERAL ->
                "char";
            case REAL ->
                "float";
            default ->
                null;
        };
    }
    
    // Converte o nome de um tipo da linguagem LA para o enum.
    public Tipo converterStringParaEnumTipo(String nomeTipo) {
        return switch (nomeTipo) {
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
    
    // Converte o nome de um tipo da linguagem LA para C.
    public String obterTipoEmC(String nomeTipo) {
        return switch (nomeTipo) {
            case "inteiro" ->
                "int";
            case "literal" ->
                "char";
            case "real" ->
                "float";
            default ->
                null;
        };
    }

    // Obtém o especificador de formato para printf/scanf (ex: %d, %f).
    public String obterEspecificadorFormato(String nomeTipoC) {
        return switch (nomeTipoC) {
            case "int" ->
                "d";
            case "float" ->
                "f";
            case "char" ->
                "s";
            default ->
                null;
        };
    }

    // Sobrecarga do método para receber o tipo via enum.
    public String obterEspecificadorFormato(Tipo tipoEnum) {
        if (tipoEnum == null) {
            return null;
        }
        return switch (tipoEnum) {
            case INTEIRO ->
                "d";
            case REAL ->
                "f";
            case LITERAL ->
                "s";
            default ->
                null;
        };
    }
    
    // Verifica se um tipo (ex: registro) foi declarado na tabela.
    public boolean tipoExisteNaTabela(TabelaSimbolos tabela, String nomeTipo) {
        return tabela.existeSimbolo(nomeTipo);
    }
    
    // Extrai o limite inicial ou final de uma string de intervalo (ex: "1..5").
    public String obterLimiteDeIntervalo(String intervaloStr, boolean obterInicio) {
        String strAux;

        if (intervaloStr.contains(".")) {
            int i = 0;
            boolean continua = true;

            while (continua) {
                strAux = intervaloStr.substring(i);
                if (strAux.startsWith(".")) {
                    continua = false;
                } else {
                    i++;
                }
            }

            strAux = obterInicio ? intervaloStr.substring(0, i) : intervaloStr.substring(i + 2);
        } else {
            strAux = intervaloStr;
        }

        return strAux;
    }

    // Isola os operandos de uma expressão relacional.
    public String extrairOperandoRelacional(String expressao, int indice) {
        String argAux;
        boolean continuar = true;
        int i = 0;

        expressao = expressao.substring(1);

        while (continuar) {
            argAux = expressao.substring(i);
            if (argAux.startsWith("=") || argAux.startsWith("<>")) {
                continuar = false;
            } else {
                i++;
            }
        }

        if (indice == 0) {
            argAux = expressao.substring(0, i);
        } else {
            expressao = expressao.substring(i + 1);
            i = 0;
            continuar = true;
            while (continuar) {
                argAux = expressao.substring(i);
                if (argAux.startsWith(")")) {
                    continuar = false;
                } else {
                    i++;
                }
            }
            argAux = expressao.substring(0, i);
        }

        return argAux;
    }

    // Isola os operandos de uma expressão aritmética.
    public String extrairOperandoAritmetico(String expressao, int indice) {
        String argAux;
        boolean continuar = true;
        int i = 0;

        while (continuar) {
            argAux = expressao.substring(i);
            if (argAux.startsWith("+") || argAux.startsWith("-")
                    || argAux.startsWith("*") || argAux.startsWith("/")) {
                continuar = false;
            } else {
                i++;
            }
        }

        return indice == 0 ? expressao.substring(0, i) : expressao.substring(i + 1);
    }

    // Encontra o operador em uma expressão aritmética simples.
    public String obterOperadorAritmetico(String expressao) {
        if (expressao.contains("+")) {
            return "+";
        }
        if (expressao.contains("-")) {
            return "-";
        }
        if (expressao.contains("*")) {
            return "*";
        }
        if (expressao.contains("/")) {
            return "/";
        }
        return null;
    }

    // Ponto de entrada, gera a estrutura principal do arquivo C.
    @Override
    public Void visitPrograma(ParserLAParser.ProgramaContext ctx) {
        codGerado.append("#include <stdio.h>\n");
        codGerado.append("#include <stdlib.h>\n");
        codGerado.append("#include <string.h>\n"); 
        codGerado.append("#include <stdbool.h>\n\n");

        visitDeclaracoes(ctx.declaracoes());
        codGerado.append("\n");
        codGerado.append("int main() {\n");
        ident++;
        visitCorpo(ctx.corpo());
        codGerado.append(ident()).append("return 0;\n");
        ident--;
        codGerado.append("}\n");
        return null;
    }

    // Trata declarações locais de constantes, tipos ou variáveis.
    @Override
    public Void visitDeclaracao_local(ParserLAParser.Declaracao_localContext ctx) {
        if (ctx.valor_constante() != null) {
            String str = "#define " + ctx.IDENT().getText() + " " + ctx.valor_constante().getText() + "\n";
            codGerado.append(ident()).append(str);
        } else if (ctx.tipo() != null) {
            TabelaSimbolos escopoAtual = gerenciadorDeEscopos.obterEscopoAtual();
            gerenciadorDeEscopos.criarNovoEscopo();
            codGerado.append(ident()).append("typedef struct {\n");
            ident++;
            
            super.visitRegistro(ctx.tipo().registro());
            ident--;
            gerenciadorDeEscopos.sairEscopo();
            escopoAtual.addSimbolo(ctx.IDENT().getText(), Tipo.REGISTRO, TipoEntrada.VARIAVEL);
            String str = "} " + ctx.IDENT().getText() + ";\n";
            codGerado.append(ident()).append(str);
        } else if (ctx.variavel() != null) {
            visitVariavel(ctx.variavel());
        }
        return null;
    }

   
    // Gera a declaração de uma ou mais variáveis.
    @Override
    public Void visitVariavel(ParserLAParser.VariavelContext ctx) {
        TabelaSimbolos escopoAtual = gerenciadorDeEscopos.obterEscopoAtual();
        boolean tipoEstendido = false;
        String str;
        if (ctx.tipo().tipo_estendido() != null) {
            String nomeVar;
            String tipoVariavel = ctx.tipo().getText();
            Tipo Type;
            boolean ehPonteiro = false;

            if (tipoVariavel.contains("^")) {
                ehPonteiro = true;
                tipoVariavel = tipoVariavel.substring(1);
            }

            if (tipoExisteNaTabela(escopoAtual, tipoVariavel)) {
                tipoEstendido = true;
                Type = Tipo.ESTENDIDO;
            } else {
                Type = converterStringParaEnumTipo(tipoVariavel);
                tipoVariavel = converterTipoParaString(Type);
            }

            if (ehPonteiro) {
                tipoVariavel += "*";
            }

            for (ParserLAParser.IdentificadorContext ictx : ctx.identificador()) {
                nomeVar = ictx.getText();
                if (tipoEstendido) {
                    escopoAtual.addSimbolo(nomeVar, Tipo.REGISTRO, TipoEntrada.VARIAVEL);
                } else {
                    escopoAtual.addSimbolo(nomeVar, Type, TipoEntrada.VARIAVEL);
                }

                if (Type == Tipo.LITERAL) {
                    str = tipoVariavel + " " + nomeVar + "[80];\n";
                } else {
                    str = tipoVariavel + " " + nomeVar + ";\n";
                }
                codGerado.append(ident()).append(str);
            }
        } else {
            gerenciadorDeEscopos.criarNovoEscopo();
            codGerado.append(ident()).append("struct {\n");
            ident++;
            for (ParserLAParser.VariavelContext vctx : ctx.tipo().registro().variavel()) {
                visitVariavel(vctx);
            }
            ident--;
            str = "} " + ctx.identificador(0).getText() + ";\n";
            codGerado.append(ident()).append(str);
            gerenciadorDeEscopos.sairEscopo();
            escopoAtual.addSimbolo(ctx.identificador(0).getText(), Tipo.REGISTRO, TipoEntrada.VARIAVEL);
        }
        return null;
    }

    // Gera a declaração de uma função ou procedimento.
    @Override
    public Void visitDeclaracao_global(ParserLAParser.Declaracao_globalContext ctx) {
        TabelaSimbolos escopoAtual = gerenciadorDeEscopos.obterEscopoAtual();
        gerenciadorDeEscopos.criarNovoEscopo();
        TabelaSimbolos escopoParametros = gerenciadorDeEscopos.obterEscopoAtual();
        String tipo, nomeVariaveis;

        if (ctx.tipo_estendido() != null) {
            codGerado.append(ident()).append(obterTipoEmC(ctx.tipo_estendido().getText()));
        } else {
            codGerado.append(ident()).append("void");
        }

        String str = " " + ctx.IDENT().getText() + "(";
        codGerado.append(str);

        if (ctx.parametros() != null) {
            int paramCount = 0;
            for (ParserLAParser.ParametroContext pctx : ctx.parametros().parametro()) {
                if (paramCount > 0) {
                    codGerado.append(", ");
                }
                tipo = obterTipoEmC(pctx.tipo_estendido().getText());
                nomeVariaveis = "";

                for (ParserLAParser.IdentificadorContext ictx : pctx.identificador()) {
                    nomeVariaveis += ictx.getText();
                    escopoParametros.addSimbolo(ictx.getText(), converterStringParaEnumTipo(pctx.tipo_estendido().getText()), TipoEntrada.VARIAVEL);
                }

                if (tipo.equals("char")) {
                    tipo = "char*";
                }

                str = tipo + " " + nomeVariaveis;
                codGerado.append(str);
                paramCount++;
            }
        }

        codGerado.append(") {\n");
        ident++;

        if (ctx.tipo_estendido() != null) {
            escopoAtual.addSimbolo(ctx.IDENT().getText(), converterStringParaEnumTipo(ctx.tipo_estendido().getText()), TipoEntrada.FUNCAO);
        } else {
            escopoAtual.addSimbolo(ctx.IDENT().getText(), Tipo.VOID, TipoEntrada.PROCEDIMENTO);
        }

        for (ParserLAParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }

        ident--;
        codGerado.append(ident()).append("}\n");
        gerenciadorDeEscopos.sairEscopo();
        return null;
    }

    // Trata uma parcela não unária em uma expressão.
    @Override
    public Void visitParcela_nao_unario(ParserLAParser.Parcela_nao_unarioContext ctx) {
        if (ctx.identificador() != null) {
            codGerado.append(ctx.identificador().getText());
        }
        super.visitParcela_nao_unario(ctx);
        return null;
    }

    // Trata uma parcela unária, como uma expressão entre parênteses.
    @Override
    public Void visitParcela_unario(ParserLAParser.Parcela_unarioContext ctx) {
        if (!ctx.expressao().isEmpty() && ctx.expressao().get(0).getText().contains("(")) {
            codGerado.append("(");
            super.visitParcela_unario(ctx);
            codGerado.append(")");
        } else {
            codGerado.append(ctx.getText());
        }
        return null;
    }
    
    // Converte o operador relacional de LA para C (ex: "=" para "==").
    @Override
    public Void visitOp_relacional(ParserLAParser.Op_relacionalContext ctx) {
        String strRetorno = ctx.getText().equals("=") ? "==" : ctx.getText();
        codGerado.append(strRetorno);
        super.visitOp_relacional(ctx);
        return null;
    }
    
    // Gera o comando de retorno de uma função.
    @Override
    public Void visitCmdRetorne(ParserLAParser.CmdRetorneContext ctx) {
        codGerado.append(ident()).append("return ");
        super.visitExpressao(ctx.expressao());
        codGerado.append(";\n");
        return null;
    }
    
    // Gera um comando de atribuição para variáveis.
    @Override
    public Void visitCmdAtribuicao(ParserLAParser.CmdAtribuicaoContext ctx) {
        String str;
        tabelaDeSimbolos = escoposAninhadosParaSemantica.obterEscopoAtual();

        if (ctx.getText().contains("^")) {
            str = "*" + ctx.identificador().getText() + " = " + ctx.expressao().getText() + ";\n";
        } else if (ctx.identificador().getText().contains(".") && ctx.getText().contains("\"")) {
            str = "strcpy(" + ctx.identificador().getText() + "," + ctx.expressao().getText() + ");\n";
        } else {
            str = ctx.identificador().getText() + " = " + ctx.expressao().getText() + ";\n";
        }
        codGerado.append(ident()).append(str);
        return null;
    }

    // Trata a lógica de expressões com operadores "ou".
    @Override
    public Void visitExpressao(ParserLAParser.ExpressaoContext ctx) {
        if (ctx.termo_logico().size() > 1) {
            for (int i = 0; i < ctx.termo_logico().size(); i++) {
                if (i > 0) {
                    codGerado.append(" || ");
                }
                visitTermo_logico(ctx.termo_logico(i));
            }
        } else {
            visitTermo_logico(ctx.termo_logico(0));
        }
        return null;
    }

    
    // Trata a lógica de expressões com operadores "e".
    @Override
    public Void visitTermo_logico(ParserLAParser.Termo_logicoContext ctx) {
        if (ctx.fator_logico().size() > 1) {
            for (int i = 0; i < ctx.fator_logico().size(); i++) {
                if (i > 0) {
                    codGerado.append(" && ");
                }
                visitFator_logico(ctx.fator_logico(i));
            }
        } else {
            visitFator_logico(ctx.fator_logico(0));
        }
        return null;
    }

    // Trata a negação lógica ("nao").
    @Override
    public Void visitFator_logico(ParserLAParser.Fator_logicoContext ctx) {
        if (ctx.getText().contains("nao")) {
            codGerado.append("!");
        }
        visitParcela_logica(ctx.parcela_logica());
        return null;
    }

    // Adiciona um operador aritmético ao código gerado.
    @Override
    public Void visitOp2(ParserLAParser.Op2Context ctx) {
        codGerado.append(ctx.getText());
        super.visitOp2(ctx);
        return null;
    }

    // Converte os valores lógicos "verdadeiro" e "falso".
    @Override
    public Void visitParcela_logica(ParserLAParser.Parcela_logicaContext ctx) {
        if (ctx.getText().contains("falso")) {
            codGerado.append("false");
        } else if (ctx.getText().contains("verdadeiro")) {
            codGerado.append("true");
        } else {
            visitExp_relacional(ctx.exp_relacional());
        }
        return null;
    }
    
    // Gera uma expressão relacional com operadores como ==, <>, etc.
    @Override
    public Void visitExp_relacional(ParserLAParser.Exp_relacionalContext ctx) {
        if (ctx.op_relacional() != null) {
            visitExp_aritmetica(ctx.exp_aritmetica(0));
            String op = ctx.op_relacional().getText().equals("=") ? "==" : ctx.op_relacional().getText();
            codGerado.append(op);
            visitExp_aritmetica(ctx.exp_aritmetica(1));
        } else {
            String expAtual = ctx.exp_aritmetica(0).getText();
            if (expAtual.contains("=") && !expAtual.contains("<=") && !expAtual.contains(">=")) {
                String arg1 = extrairOperandoRelacional(expAtual, 0);
                String arg2 = extrairOperandoRelacional(expAtual, 1);
                codGerado.append("(" + arg1 + "==" + arg2 + ")");
            } else if (expAtual.contains("<>")) {
                codGerado.append("!=");
            } else {
                String arg1 = extrairOperandoAritmetico(expAtual, 0);
                String arg2 = extrairOperandoAritmetico(expAtual, 1);
                codGerado.append(arg1);
                codGerado.append(obterOperadorAritmetico(expAtual));
                codGerado.append(arg2);
            }
        }
        return null;
    }
    
    // Gera a estrutura condicional if-else.
    @Override
    public Void visitCmdSe(ParserLAParser.CmdSeContext ctx) {
        String textoExpressao = ctx.expressao().getText()
                .replace("e", "&&")
                .replace("=", "==");
        codGerado.append(ident()).append("if (" + textoExpressao + ") {\n");
        ident++;

        for (ParserLAParser.CmdContext cctx : ctx.cmdEntao) {
            visitCmd(cctx);
        }
        ident--;
        codGerado.append(ident()).append("}\n");

        if (!ctx.cmdSenao.isEmpty()) {
            codGerado.append(ident()).append("else {\n");
            ident++;
            for (ParserLAParser.CmdContext cctx : ctx.cmdSenao) {
                visitCmd(cctx);
            }
            ident--;
            codGerado.append(ident()).append("}\n");
        }
        return null;
    }

   
    // Gera o comando de leitura de dados (scanf).
    @Override
    public Void visitCmdLeia(ParserLAParser.CmdLeiaContext ctx) {
        TabelaSimbolos escopoAtual = gerenciadorDeEscopos.obterEscopoAtual();
        for (ParserLAParser.IdentificadorContext ictx : ctx.identificador()) {
            String nomeVar = ictx.getText();
            Tipo Type = escopoAtual.getTipo(nomeVar);
            String codigoTipo = obterEspecificadorFormato(Type);
            String str;
            if (Type == Tipo.LITERAL) {
                str = "gets(" + nomeVar + ");\n";
            } else {
                str = "scanf(\"%" + codigoTipo + "\",&" + nomeVar + ");\n";
            }
            codGerado.append(ident()).append(str);
        }
        return null;
    }

    
    // Gera o laço de repetição "enquanto" (while).
    @Override
    public Void visitCmdEnquanto(ParserLAParser.CmdEnquantoContext ctx) {
        codGerado.append(ident()).append("while(");
        super.visitExpressao(ctx.expressao());
        codGerado.append(") {\n");
        ident++;

        for (ParserLAParser.CmdContext cctx : ctx.cmd()) {
            super.visitCmd(cctx);
        }
        ident--;
        codGerado.append(ident()).append("}\n");
        return null;
    }

   
    // Gera o laço de repetição "para" (for).
    @Override
    public Void visitCmdPara(ParserLAParser.CmdParaContext ctx) {
        String nomeVariavel = ctx.IDENT().getText();
        String limiteEsq = ctx.exp_aritmetica(0).getText();
        String limiteDir = ctx.exp_aritmetica(1).getText();

        String str = "for(" + nomeVariavel + " = " + limiteEsq + "; "
                + nomeVariavel + " <= " + limiteDir + "; " + nomeVariavel + "++) {\n";
        codGerado.append(ident()).append(str);
        ident++;

        for (ParserLAParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }
        ident--;
        codGerado.append(ident()).append("}\n");
        return null;
    }

   
    // Gera o laço de repetição "faca-enquanto" (do-while).
    @Override
    public Void visitCmdFaca(ParserLAParser.CmdFacaContext ctx) {
        codGerado.append(ident()).append("do {\n");
        ident++;
        for (ParserLAParser.CmdContext cctx : ctx.cmd()) {
            super.visitCmd(cctx);
        }
        ident--;
        codGerado.append(ident()).append("} while(");
        super.visitExpressao(ctx.expressao());
        codGerado.append(");\n");
        return null;
    }

   
    // Gera o comando de escrita (printf).
    @Override
    public Void visitCmdEscreva(ParserLAParser.CmdEscrevaContext ctx) {
        TabelaSimbolos escopoAtual = gerenciadorDeEscopos.obterEscopoAtual();

        StringBuilder formatString = new StringBuilder("\"");
        StringBuilder arguments = new StringBuilder();

        for (int i = 0; i < ctx.expressao().size(); i++) {
            ParserLAParser.ExpressaoContext ectx = ctx.expressao().get(i);

            if (ectx.getText().contains("\"")) {
                formatString.append(ectx.getText().replace("\"", ""));
            } else {
                Tipo type = verificarTipo(escopoAtual, ectx);
                String codTipoExp = obterEspecificadorFormato(type);
                formatString.append("%").append(codTipoExp);

                if (arguments.length() > 0) {
                    arguments.append(", ");
                }
                arguments.append(ectx.getText());
            }
        }

        formatString.append("\"");

        String str;
        if (arguments.length() > 0) {
            str = "printf(" + formatString.toString() + ", " + arguments.toString() + ");\n";
        } else {
            str = "printf(" + formatString.toString() + ");\n";
        }

        codGerado.append(ident()).append(str);
        return null;
    }

    // Gera a estrutura de seleção "caso" (switch-case).
    @Override
    public Void visitCmdCaso(ParserLAParser.CmdCasoContext ctx) {
        String str = "switch (" + ctx.exp_aritmetica().getText() + ") {\n";
        codGerado.append(ident()).append(str);
        ident++;

        for (ParserLAParser.Item_selecaoContext sctx : ctx.selecao().item_selecao()) {
            String strOriginal = sctx.constantes().numero_intervalo(0).getText();
            String limiteEsq, limiteDir;

            if (strOriginal.contains(".")) {
                limiteEsq = obterLimiteDeIntervalo(strOriginal, true);
                limiteDir = obterLimiteDeIntervalo(strOriginal, false);
            } else {
                limiteEsq = limiteDir = obterLimiteDeIntervalo(strOriginal, true);
            }

            if (!sctx.constantes().isEmpty()) {
                for (int i = Integer.parseInt(limiteEsq); i <= Integer.parseInt(limiteDir); i++) {
                    str = "case " + i + ":\n";
                    codGerado.append(ident()).append(str);
                }
            } else {
                str = "case " + limiteEsq + ":\n";
                codGerado.append(ident()).append(str);
            }

            ident++;
            for (ParserLAParser.CmdContext cctx : sctx.cmd()) {
                visitCmd(cctx);
            }
            codGerado.append(ident()).append("break;\n");
            ident--;
        }

        codGerado.append(ident()).append("default:\n");
        ident++;
        for (ParserLAParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }
        ident--;
        codGerado.append(ident()).append("}\n");
        return null;
    }

    // Gera uma chamada de função ou procedimento.
    @Override
    public Void visitCmdChamada(ParserLAParser.CmdChamadaContext ctx) {
        String str = ctx.IDENT().getText() + "(";
        codGerado.append(ident()).append(str);

        int i = 0;
        for (ParserLAParser.ExpressaoContext ectx : ctx.expressao()) {
            if (i >= 1) {
                codGerado.append(", ");
            }
            codGerado.append(ectx.getText());
            i++;
        }
        codGerado.append(");\n");
        return null;
    }
}