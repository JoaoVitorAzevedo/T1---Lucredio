/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_t4;

/**
 *
 * @author joao
 */

// Representa um símbolo na tabela de símbolos (variável, constante, etc.)
class Simbolo {

    final String nome;
    final Tipo tipo;
    
    final TipoEntrada tipoEntrada;

    // Construtor atualizado para inicializar todos os campos
    public Simbolo(String nome, Tipo tipo, TipoEntrada tipoEntrada) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoEntrada = tipoEntrada;
    }
}