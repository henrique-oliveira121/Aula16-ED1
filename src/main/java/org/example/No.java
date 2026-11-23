package org.example;

public class No {
    char info;
    No anterior;
    No proximo;

    public No(char info) {
        this.info = info;
        this.anterior = this;
        this.proximo = this;
    }
}