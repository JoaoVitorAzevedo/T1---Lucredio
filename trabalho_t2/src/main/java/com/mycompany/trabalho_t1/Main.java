package com.mycompany.trabalho_t1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            // Não imprime nada no console, conforme a especificação.
            return;
        }

        String arquivoEntrada = args[0];
        String arquivoSaida = args[1];

        try {
            // Chama o analisador sintático, que por sua vez, executa o léxico.
            Sintatico.analisar(arquivoEntrada, arquivoSaida);
        } catch (IOException e) {
            // Conforme a especificação, não imprime o erro no console.
        }
    }
}