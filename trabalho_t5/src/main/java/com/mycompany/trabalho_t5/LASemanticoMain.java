package com.mycompany.trabalho_t5;

import com.mycompany.trabalho_t5.ParserLAParser.ProgramaContext;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class LASemanticoMain {

    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            CharStream c_stream = null;

            // Tenta carregar arq. de entrada como um charStream
            try {
                c_stream = CharStreams.fromFileName(args[0]);
            } catch (IOException exp) {
                Logger.getLogger(LASemanticoMain.class.getName()).log(Level.SEVERE, null, exp);

            }
            // Gera os tokens léxicos 

            ParserLALexer lexer = new ParserLALexer(c_stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

// Cria o parser a partir dos tokens gerados
            ParserLAParser parser = new ParserLAParser(tokens);
            LogicaVisitor utilitario = new LogicaVisitor();
            ProgramaContext arvore = parser.programa();

            utilitario.visitPrograma(arvore);

            // Após a análise semântica
            if (!LASemanticoUtils.errosSemanticos.isEmpty()) {
                LASemanticoUtils.errosSemanticos.forEach(pw::println);

                // Finaliza a compilação
                pw.println("Fim da compilacao");
            } else {
                // cria código C se não houver erros
                GeradorCodigo generator = new GeradorCodigo();
                try {
                    generator.visitPrograma(arvore);
                    pw.print(generator.codGerado.toString());
                } catch (Exception ex) {
                    String msg = "Erro ao gerar código C: " + ex.getMessage();
                    pw.println(msg);
                }
            }
        }

    }

}
