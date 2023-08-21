package operadores;

public class Comparacao {
    public static void main(String[] args) {
        int a = 30;
        int b = 'a';

        System.out.println(a == b );

        System.out.println(30 !=  7);

        System.out.println(3 > 4);
        System.out.println(3 < 4);
        System.out.println(3 >= 4);
        System.out.println(3 <= 4);

        double nota = 8.4;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
