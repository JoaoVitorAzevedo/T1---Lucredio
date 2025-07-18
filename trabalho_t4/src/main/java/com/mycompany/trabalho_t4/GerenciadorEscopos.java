package com.mycompany.trabalho_t4;

import java.util.LinkedList;
import java.util.List;

// Classe que gerencia os escopos
public class GerenciadorEscopos {

    private final LinkedList<TabelaSimbolos> pilhaDeTabelas;

    public GerenciadorEscopos() {
        pilhaDeTabelas = new LinkedList<>();
        criarNovoEscopo();
    }

    public void criarNovoEscopo() {
        pilhaDeTabelas.push(new TabelaSimbolos());
    }

    public TabelaSimbolos obterEscopoAtual() {
        return pilhaDeTabelas.peek();
    }

    public void sairEscopo() {
        pilhaDeTabelas.pop();
    }

    public List<TabelaSimbolos> percorrerEscoposAninhados() {
        return pilhaDeTabelas;
    }

}
