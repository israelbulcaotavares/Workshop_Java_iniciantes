package array;

import java.util.Arrays;

public class ExemploArray {
    public static void main(String[] args) {
//        double[] notasAlunoA = new double[4];
//        notasAlunoA[0] = 7.9;
//        notasAlunoA[1] = 8;
//        notasAlunoA[2] = 6.7;
//        notasAlunoA[3] = 9.8;

        double[] notasAlunoA = {7.9, 8 , 6.7, 9.8   };

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;

        for (int i=0; i < notasAlunoA.length; i++){
            totalAlunoA  += notasAlunoA[i];
        }


        double resultado = totalAlunoA / notasAlunoA.length;
        System.out.println(resultado);




    }
}
