package com.mycompany.trabalho_t3;

import com.mycompany.trabalho_t3.ParserLAParser.ProgramaContext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class LASemanticoMain {

    public static void main(String[] args) throws IOException {

        try (PrintWriter pw = new PrintWriter(new File(args[1]))) {
            CharStream c_stream = null;

            // Tenta carregar arq. de entrada como um charStream
            try {
                c_stream = CharStreams.fromFileName(args[0]);
            } catch (IOException ex) {
                Logger.getLogger(LASemanticoMain.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Gera os tokens léxicos 
            ParserLALexer lexer = new ParserLALexer(c_stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Cria o parser a partir dos tokens gerados
            ParserLAParser parser = new ParserLAParser(tokens);
            LASemanticoUtils utilitario = new LASemanticoUtils();
            ProgramaContext arvore = parser.programa();

            //Chama o visitor
            utilitario.visitPrograma(arvore);

            // troca listeners de erro
            LASemanticoUtils.errosSemanticos.forEach((erro) -> pw.println(erro));
            pw.println("Fim da compilacao");
            pw.close();

        } catch (RuntimeException e) {
            // evitar mensagens que estraguem a correção automática
        }
    }
}
