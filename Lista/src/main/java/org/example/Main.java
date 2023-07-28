package org.example;

public class Main {
    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);

        System.out.println(lista);

        lista.excluir(20);
        lista.excluir(30);

        System.out.println(lista.getTamanho());

        System.out.println(lista);

    }
}