package com.mycompany.trabalho_t2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class Sintatico {

    // Listener de erro customizado para a análise sintática
    private static class MeuErrorListener extends BaseErrorListener {

        private String mensagem = null;

        public boolean houveErro() {
            return mensagem != null;
        }

        public String getMensagem() {
            return mensagem;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            if (mensagem != null) {
                return;
            }
            Token token = (Token) offendingSymbol;
            String tokenText = token.getText();
            if (tokenText.equals("<EOF>")) {
                tokenText = "EOF";
            }
            mensagem = "Linha " + line + ": erro sintatico proximo a " + tokenText + "\n";
        }
    }

    // Método principal 
    public static void analisar(String arquivoEntrada, String arquivoSaida) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoSaida))) {
            ParserLALexer lexer = new ParserLALexer(CharStreams.fromFileName(arquivoEntrada));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            tokenStream.fill();

            // ANÁLISE LÉXICA 
            for (Token token : tokenStream.getTokens()) {
                // CORREÇÃO: Vamos comparar o TIPO numérico do token, não o nome em string.
                int tokenType = token.getType();

                if (tokenType == ParserLALexer.CADEIA_NAO_FECHADA) {
                    writer.write("Linha " + token.getLine() + ": cadeia literal nao fechada\n");
                    writer.write("Fim da compilacao\n");
                    return;
                } else if (tokenType == ParserLALexer.COMENTARIO_NAO_FECHADO) {
                    writer.write("Linha " + token.getLine() + ": comentario nao fechado\n");
                    writer.write("Fim da compilacao\n");
                    return;
                } else if (tokenType == ParserLALexer.SIMBOLO_NAO_IDENTIFICADO) {
                    writer.write("Linha " + token.getLine() + ": " + token.getText() + " - simbolo nao identificado\n");
                    writer.write("Fim da compilacao\n");
                    return;
                }
            }

            tokenStream.reset();

            // ANÁLISE SINTÁTICA
            ParserLAParser parser = new ParserLAParser(tokenStream);
            MeuErrorListener errorListener = new MeuErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            parser.programa();

            if (errorListener.houveErro()) {
                writer.write(errorListener.getMensagem());
            }

            writer.write("Fim da compilacao\n");

        } catch (IOException e) {
            // Depuração
            // e.printStackTrace();
        }
    }
}
