package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExemplo {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Sandra");
        nomes.add("Israel");
        nomes.add("Bob");
        nomes.add("Alice");
        nomes.add("Alice");
        nomes.add("Charlie Brown");
        nomes.add("Charlie Brown");

        System.out.println("Nomes: " + nomes);

        System.out.println("Primeiro Nome: " + nomes.get(0));

        System.out.println("Tamanho da lista: " + nomes.size());

        Collections.sort(nomes);

        System.out.println("Lista após a ordenação " +nomes);




    }
}
