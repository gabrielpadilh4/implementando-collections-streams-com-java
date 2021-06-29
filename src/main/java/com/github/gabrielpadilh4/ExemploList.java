package com.github.gabrielpadilh4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Gabriel");
        nomes.add("Pedro");
        nomes.add("Rachel");
        nomes.add("Angela");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        // ordenar
        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(1); // index ou objeto
        nomes.remove("Gabriel");

        System.out.println(nomes);

        String getNome = nomes.get(1);

        System.out.println(getNome);

        System.out.println(nomes.size()); // length da lista

        System.out.println(nomes.contains("Angela"));

        System.out.println(nomes.indexOf("Angela"));

        // iterator
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
