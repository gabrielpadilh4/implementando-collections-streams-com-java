package com.github.gabrielpadilh4;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(13);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

    }
}
