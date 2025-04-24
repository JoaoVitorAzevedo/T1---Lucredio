package com.mycompany.trabalho_t1;

import java.io.*;
import java.util.*;

public class Lexer {

    private static final Set<String> PALAVRAS_RESERVADAS = new HashSet<>(Arrays.asList(
        "algoritmo", "declare", "literal", "inteiro", "real", "leia", "escreva", "fim_algoritmo",
        "se", "entao", "senao", "fim_se", "caso", "seja", "fim_caso", "para", "ate", "faca",
        "fim_para", "enquanto", "fim_enquanto", "registro", "fim_registro", "tipo", "var",
        "constante", "procedimento", "fim_procedimento", "funcao", "fim_funcao", "retorne",
        "logico", "verdadeiro", "falso", "e", "ou", "nao"
    ));

    private static final Set<String> SIMBOLOS = new HashSet<>(Arrays.asList(
        "(", ")", ",", ":", ";", "+", "-", "*", "/", "<-", ".", "..", "&", "%", "^",
        ">", "<", ">=", "<=", "=", "<>"
    ));

    public static void analisar(String arquivoEntrada, String arquivoSaida) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(arquivoEntrada));
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoSaida));

        StringBuilder conteudo = new StringBuilder();
        String linha;
        while ((linha = reader.readLine()) != null) {
            conteudo.append(linha).append('\n');
        }
        reader.close();

        int pos = 0;
        int linhaAtual = 1;
        int colunaAtual = 1;

        while (pos < conteudo.length()) {
            char c = conteudo.charAt(pos);

            if (c == '\n') {
                linhaAtual++;
                colunaAtual = 1;
                pos++;
                continue;
            }

            if (c == ' ' || c == '\t' || c == '\r') {
                pos++;
                colunaAtual++;
                continue;
            }

            // Comentários
            if (c == '{') {
                int inicioLinhaErro = linhaAtual;
                pos++;
                colunaAtual++;
                boolean fechado = false;
                while (pos < conteudo.length()) {
                    c = conteudo.charAt(pos);
                    if (c == '}') {
                        fechado = true;
                        pos++;
                        colunaAtual++;
                        break;
                    }
                    if (c == '\n') {
                        linhaAtual++;
                        colunaAtual = 1;
                    } else {
                        colunaAtual++;
                    }
                    pos++;
                }
                if (!fechado) {
                    writer.write("Linha " + inicioLinhaErro + ": comentario nao fechado\n");
                    writer.close();
                    return;
                }
                continue;
            }

            // Strings
            if (c == '"') {
                int inicio = pos;
                int inicioLinha = linhaAtual;
                pos++;
                colunaAtual++;
                while (pos < conteudo.length() && conteudo.charAt(pos) != '"') {
                    if (conteudo.charAt(pos) == '\n') {
                        writer.write("Linha " + inicioLinha + ": cadeia literal nao fechada\n");
                        writer.close();
                        return;
                    }
                    pos++;
                    colunaAtual++;
                }
                if (pos >= conteudo.length()) {
                    writer.write("Linha " + inicioLinha + ": cadeia literal nao fechada\n");
                    writer.close();
                    return;
                }
                pos++; // pula '"'
                colunaAtual++;
                String lexema = conteudo.substring(inicio, pos);
                writer.write("<'" + lexema + "',CADEIA>\n");
                continue;
            }

            // Identificadores e palavras reservadas
            if (Character.isLetter(c) || c == '_') {
                int inicio = pos;
                while (pos < conteudo.length() && (Character.isLetterOrDigit(conteudo.charAt(pos)) || conteudo.charAt(pos) == '_')) {
                    pos++;
                    colunaAtual++;
                }
                String lexema = conteudo.substring(inicio, pos);
                if (PALAVRAS_RESERVADAS.contains(lexema)) {
                    writer.write("<'" + lexema + "','" + lexema + "'>\n");
                } else {
                    writer.write("<'" + lexema + "',IDENT>\n");
                }
                continue;
            }

            // Números (int e real)
            if (Character.isDigit(c)) {
                int inicio = pos;
                boolean temPonto = false;
                while (pos < conteudo.length() && (Character.isDigit(conteudo.charAt(pos)) || conteudo.charAt(pos) == '.')) {
                    if (conteudo.charAt(pos) == '.') {
                        if (temPonto) break;
                        temPonto = true;
                    }
                    pos++;
                    colunaAtual++;
                }
                String lexema = conteudo.substring(inicio, pos);
                if (temPonto) {
                    writer.write("<'" + lexema + "',NUM_REAL>\n");
                } else {
                    writer.write("<'" + lexema + "',NUM_INT>\n");
                }
                continue;
            }

            // Símbolos compostos
            if (pos + 1 < conteudo.length()) {
                String simb = conteudo.substring(pos, pos + 2);
                if (SIMBOLOS.contains(simb)) {
                    writer.write("<'" + simb + "','" + simb + "'>\n");
                    pos += 2;
                    colunaAtual += 2;
                    continue;
                }
            }

            // Símbolos simples
            String simb = Character.toString(c);
            if (SIMBOLOS.contains(simb)) {
                writer.write("<'" + simb + "','" + simb + "'>\n");
                pos++;
                colunaAtual++;
                continue;
            }

            // Erro léxico
            writer.write("Linha " + linhaAtual + ": " + c + " - simbolo nao identificado\n");
            writer.close();
            return;
        }

        writer.close();
    }

    public static void main(String[] args) {
        if (args.length != 2) return;
        try {
            analisar(args[0], args[1]);
        } catch (IOException e) {
            // Erros ignorados silenciosamente conforme exigência do corretor
        }
    }
}
