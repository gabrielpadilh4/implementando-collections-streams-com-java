package com.github.gabrielpadilh4.exercico;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("Joao");

        for (String nome: fila) {
            System.out.println(nome);
        }

        System.out.println(fila.peek());

        System.out.println(fila.poll());

        fila.add("Daniel");

        int posicaoDaniel = fila.size() - 1;

        System.out.println(posicaoDaniel);

        System.out.println(fila);

    }
}
