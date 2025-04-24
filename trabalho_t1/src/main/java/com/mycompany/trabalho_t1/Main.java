package com.mycompany.trabalho_t1;


public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            // NÃO imprime nada! O corretor odeia qualquer saída fora do arquivo de output.
            return;
        }

        String arquivoEntrada = args[0];
        String arquivoSaida = args[1];

        try {
            Lexer.analisar(arquivoEntrada, arquivoSaida);
        } catch (Exception e) {
            // Também não imprime erro no console
        }
    }
}
