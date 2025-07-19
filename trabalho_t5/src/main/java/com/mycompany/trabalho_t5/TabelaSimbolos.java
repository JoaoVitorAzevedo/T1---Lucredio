package com.mycompany.trabalho_t5;

import java.util.Map;
import java.util.HashMap;

import static com.mycompany.trabalho_t5.LASemanticoUtils.cortarNoSimbolo;

// Representa uma tabela de simbolos
public class TabelaSimbolos {

    private final Map<String, Simbolo> simbolos;

    public TabelaSimbolos() {
        this.simbolos = new HashMap<>();
    }

    public Tipo getTipo(String nome) {
        nome = cortarNoSimbolo(nome, "[");
        return simbolos.get(nome).tipo;
    }

    public boolean existeSimbolo(String nome) {
        nome = cortarNoSimbolo(nome, "[");
        return simbolos.containsKey(nome);
    }

    
    public void addSimbolo(String nome, Tipo tipo, TipoEntrada tipoEntrada) {
        nome = cortarNoSimbolo(nome, "[");
        simbolos.put(nome, new Simbolo(nome, tipo, tipoEntrada));
    }
}