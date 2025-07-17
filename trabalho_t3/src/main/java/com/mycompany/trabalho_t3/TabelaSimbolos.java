package com.mycompany.trabalho_t3;

import java.util.Map;
import java.util.HashMap;

// Representa uma tabela de simbolos
public class TabelaSimbolos {

    private final Map<String, Simbolo> simbolos;

    public TabelaSimbolos() {
        this.simbolos = new HashMap<>();
    }

    public Tipo getTipo(String nome) {
        return simbolos.get(nome).tipo;
    }
    
     public boolean existeSimbolo(String nome) {
        return simbolos.containsKey(nome);
    }

    public void addSimbolo(String nome, Tipo tipo) {
        simbolos.put(nome, new Simbolo(nome, tipo));
    }

   
}
