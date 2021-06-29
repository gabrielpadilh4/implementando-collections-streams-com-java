package com.github.gabrielpadilh4;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(9.1);
        notasAlunos.add(8.5);
        notasAlunos.add(8.0);
        notasAlunos.add(10.0);
        notasAlunos.add(5.1);

        System.out.println(notasAlunos);



    }
}
