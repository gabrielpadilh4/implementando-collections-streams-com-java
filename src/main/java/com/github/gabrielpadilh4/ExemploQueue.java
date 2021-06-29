package com.github.gabrielpadilh4;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Gabriel");
        fila.add("Angela");
        fila.add("Rosana");
        fila.add("Marcos");

        System.out.println(fila);

       // String primeiroElemento = fila.poll();
        String primeiroElemento = fila.peek();

        System.out.println(primeiroElemento);

        System.out.println(fila);

    }
}
