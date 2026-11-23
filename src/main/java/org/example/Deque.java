package org.example;

public class Deque {
    private No cabeca;
    private int quantidade;

    public Deque() {
        inicializar();
    }

    public void inicializar() {
        this.cabeca = null;
        this.quantidade = 0;
    }

    public boolean estaVazio() {
        return this.cabeca == null;
    }

    public int tamanho() {
        return this.quantidade;
    }

    public void inserirInicio(char valor) {
        No novoNo = new No(valor);
        if (estaVazio()) {
            this.cabeca = novoNo;
        } else {
            No cauda = this.cabeca.anterior;
            novoNo.proximo = this.cabeca;
            novoNo.anterior = cauda;
            cauda.proximo = novoNo;
            this.cabeca.anterior = novoNo;
            this.cabeca = novoNo;
        }
        this.quantidade++;
    }

    public void inserirFim(char valor) {
        No novoNo = new No(valor);
        if (estaVazio()) {
            this.cabeca = novoNo;
        } else {
            No cauda = this.cabeca.anterior;
            novoNo.proximo = this.cabeca;
            novoNo.anterior = cauda;
            cauda.proximo = novoNo;
            this.cabeca.anterior = novoNo;
        }
        this.quantidade++;
    }

    public Character removerInicio() {
        if (estaVazio()) {
            return null;
        }
        char valorRemovido = this.cabeca.info;
        if (this.cabeca.proximo == this.cabeca) {
            this.cabeca = null;
        } else {
            No cauda = this.cabeca.anterior;
            No novaCabeca = this.cabeca.proximo;
            cauda.proximo = novaCabeca;
            novaCabeca.anterior = cauda;
            this.cabeca = novaCabeca;
        }
        this.quantidade--;
        return valorRemovido;
    }

    public Character removerFim() {
        if (estaVazio()) {
            return null;
        }
        No cauda = this.cabeca.anterior;
        char valorRemovido = cauda.info;
        if (cauda == this.cabeca) {
            this.cabeca = null;
        } else {
            No novaCauda = cauda.anterior;
            novaCauda.proximo = this.cabeca;
            this.cabeca.anterior = novaCauda;
        }
        this.quantidade--;
        return valorRemovido;
    }

    public void reinicializar() {
        this.cabeca = null;
        this.quantidade = 0;
    }
}