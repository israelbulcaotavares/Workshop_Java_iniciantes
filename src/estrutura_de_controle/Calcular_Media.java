package estrutura_de_controle;

import java.util.Scanner;

public class Calcular_Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNotas = 0;
        int contador = 0;

        while (contador < 5){
            System.out.println("Digite uma nota: ");
            int nota = scanner.nextInt();
            totalNotas += nota;
            contador++;
        }
        double media = (double) totalNotas/5;
        System.out.println("Média das notas: " + media);
    }
}
