/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_t3;

/**
 *
 * @author joao
 */



// Representa um símbolo na tabela de símbolos (variável, constante, etc.)
class Simbolo {

    final String nome;
    final Tipo tipo;

    public Simbolo(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
