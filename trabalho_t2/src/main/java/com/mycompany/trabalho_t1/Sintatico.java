package com.mycompany.trabalho_t1;

import com.mycompany.trabalho1.ParserLALexer;
import com.mycompany.trabalho1.ParserLAParser;
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

    public static void analisar(String arquivoEntrada, String arquivoSaida) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoSaida))) {
            
            // Cria o lexer a partir do arquivo de entrada
            ParserLALexer lexer = new ParserLALexer(CharStreams.fromFileName(arquivoEntrada));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            
            // Verifica erros léxicos primeiro
            for (Token token : tokenStream.getTokens()) {
                String displayName = ParserLALexer.VOCABULARY.getDisplayName(token.getType());
                if ("SIMBOLO_NAO_IDENTIFICADO".equals(displayName)) {
                    writer.write("Linha " + token.getLine() + ": " + token.getText() + " - simbolo nao identificado\n");
                    writer.write("Fim da compilacao\n");
                    return;
                } else if ("CADEIA_NAO_FECHADA".equals(displayName)) {
                    writer.write("Linha " + token.getLine() + ": cadeia literal nao fechada\n");
                    writer.write("Fim da compilacao\n");
                    return;
                } else if ("COMENTARIO_NAO_FECHADO".equals(displayName)) {
                    writer.write("Linha " + token.getLine() + ": comentario nao fechado\n");
                    writer.write("Fim da compilacao\n");
                    return;
                }
            }
            
            tokenStream.reset(); // Reinicia o stream para o parser

            // Cria o parser
            ParserLAParser parser = new ParserLAParser(tokenStream);
            
            // Adiciona o listener de erro customizado
            MeuErrorListener errorListener = new MeuErrorListener();
            parser.removeErrorListeners(); // Remove o listener padrão do console
            parser.addErrorListener(errorListener);
            
            // Inicia a análise sintática
            parser.programa();
            
            // Se houver erro sintático, escreve no arquivo
            if (errorListener.houveErro()) {
                writer.write(errorListener.getMensagem());
            }

            writer.write("Fim da compilacao\n");

        } catch (IOException e) {
            // Conforme especificação, não imprimir no console
        }
    }

    // Listener customizado para capturar erros sintáticos no formato desejado
    private static class MeuErrorListener extends BaseErrorListener {
        private String mensagem = null;

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            // Pega o primeiro erro e ignora os seguintes
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
        
        public boolean houveErro() {
            return mensagem != null;
        }
        
        public String getMensagem() {
            return mensagem;
        }
    }
}