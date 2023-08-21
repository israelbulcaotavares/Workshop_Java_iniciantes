package tipos_primitivos;

import org.w3c.dom.ls.LSOutput;

public class Exemplo {
    public static void main(String[] args) {
        byte idade = 31; //-128 a 127
        short populacao = 30000; //32.768 a 32.767
        int saldoBancario = 50000;


        float altura = 1.87F;
        double salario = 5500.75;

        char letra = 'A';

        String nome = "Israel Bulcão Farias Luz";
        char umaLetra = nome.charAt(2);

        System.out.println(umaLetra);

        boolean estaChovendo = false;

        System.out.println(estaChovendo);


    }


}
