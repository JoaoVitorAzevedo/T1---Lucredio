/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_t1;

/**
 *
 * @author joao
 */

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Uso: java -jar trabalho_t1.jar <arquivo_entrada> <arquivo_saida>");
            System.exit(1);
        }

        try {
            Lexer.analisar(args[0], args[1]);
        } catch (Exception e) {
            System.err.println("Erro ao processar: " + e.getMessage());
        }
    }
}