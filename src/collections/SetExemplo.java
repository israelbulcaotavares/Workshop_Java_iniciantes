package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(5);

        System.out.println("Números: " + numeros);

        System.out.println("Contém o numero ?" + numeros.contains(10));

    }
}
