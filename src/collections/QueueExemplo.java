package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExemplo {
    public static void main(String[] args) {
        // FIFO = Primeiro a entrar, primeiro a sair
        // C++

        Queue<String> fila = new LinkedList<>();

        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");

        System.out.println("Fila: " + fila);

        System.out.println("Proximo a ser removido: "  +fila.peek());

        //remove o primeiro elemento da fila
        fila.poll();

        System.out.println(fila);

    }
}
