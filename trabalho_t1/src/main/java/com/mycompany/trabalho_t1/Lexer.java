package com.mycompany.trabalho_t1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao
 */

import java.io.*;
import java.util.*;

public class Lexer {
    private static final Set<String> PALAVRAS_RESERVADAS = new HashSet<>(Arrays.asList(
        "algoritmo", "declare", "literal", "inteiro", "leia", "escreva", "fim_algoritmo"
    ));

    public static void analisar(String inputPath, String outputPath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        String linha;
        int linhaNum = 1;

        while ((linha = reader.readLine()) != null) {
            int i = 0;
            while (i < linha.length()) {
                char c = linha.charAt(i);

                if (Character.isWhitespace(c)) {
                    i++;
                    continue;
                }

                // Comentário
                if (c == '{') {
                    int fechamento = linha.indexOf('}', i);
                    if (fechamento == -1) {
                        writer.write("Linha " + linhaNum + ": comentário não fechado\n");
                        writer.close();
                        return;
                    }
                    i = fechamento + 1;
                    continue;
                }

               // Cadeia de caracteres
                if (c == '"') {
                    int fechamento = linha.indexOf('"', i + 1);
                    if (fechamento == -1) {
                        writer.write("Linha " + linhaNum + ": cadeia não fechada\n");
                        writer.close();
                        System.err.println("Entrei aqui3");
                        return;
                    }
                    String cadeia = linha.substring(i, fechamento + 1);
                    writer.write("<'" + cadeia + "',CADEIA>\n"); // Corrigido aqui, preservar aspas
                    
                    i = fechamento + 1;
                    continue;
                }

                // Símbolos simples
                if (":(),".indexOf(c) != -1) {
                    writer.write("<'" + c + "','" + c + "'>\n");
                    i++;
                    continue;
                }

                // Identificadores e palavras reservadas
                if (Character.isLetter(c) || c == '_') {
                    int inicio = i;
                    while (i < linha.length() && (Character.isLetterOrDigit(linha.charAt(i)) || linha.charAt(i) == '_')) {
                        i++;
                    }
                    String lexema = linha.substring(inicio, i);
                    if (PALAVRAS_RESERVADAS.contains(lexema)) {
                        writer.write("<'" + lexema + "','" + lexema + "'>\n");
                        System.out.println("Gravando1: " + lexema);
                        System.out.println("Arquivo de saída: " + outputPath);
                        System.err.println("Entrei aqui");

                    } else {
                        writer.write("<'" + lexema + "',IDENT>\n");
                        System.out.println("Gravando2: " + lexema);
                        System.out.println("Arquivo de saída: " + outputPath);
                        System.err.println("Entrei aqui2");
                        PrintWriter log = new PrintWriter(new FileWriter("debug.log", true));
                        log.println("Alguma coisa");
                        log.close();

                    }
                    continue;
                }

                // Erro léxico
                writer.write("Linha " + linhaNum + ": " + c + " - simbolo nao identificado\n");
                writer.close();
                return;
            }
            linhaNum++;
        }

        reader.close();
        writer.close();
    }
}
