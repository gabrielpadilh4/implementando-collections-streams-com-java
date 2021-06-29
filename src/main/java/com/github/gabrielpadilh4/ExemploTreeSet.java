package com.github.gabrielpadilh4;

import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        TreeSet<String> treePaises = new TreeSet<>();

        treePaises.add("Brasil");
        treePaises.add("Colombia");
        treePaises.add("Espanha");
        treePaises.add("Estados Unidos");
        treePaises.add("Portugal");

        System.out.println(treePaises);

        String first = treePaises.pollFirst();

        String last = treePaises.pollLast();

        System.out.println(first);
        System.out.println(last);
        System.out.println(treePaises);
    }
}
