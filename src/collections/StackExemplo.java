package collections;

import java.util.Stack;

public class StackExemplo {
    public static void main(String[] args) {
        // LIFO = Ultimo a entrar, primeiro a sair

        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha: " + pilha);

        System.out.println("Topo da pilha: " + pilha.peek());

        pilha.pop();

        //Pilha após a remoção
        System.out.println("Pilha: " + pilha);
    }
}
