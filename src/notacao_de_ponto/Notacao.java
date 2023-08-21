package notacao_de_ponto;

public class Notacao {
    public static void main(String[] args) {
        String nome1 = "Bom dia";
        System.out.println(nome1);

        System.out.println("\n");
        nome1 = "Bom dia, X";
        nome1 = nome1.replace("X", "Israel");
        nome1 = nome1.toUpperCase();
        nome1 = nome1.concat("!!!");

        System.out.println(nome1);

        //exemplo 3
        String nome2 = "Bom dia, X".toUpperCase().replace("X", "Israel").concat("!!!");

        System.out.println(nome2);
    }

}
