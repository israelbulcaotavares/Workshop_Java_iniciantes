package Conversao_de_tipos;

public class Conversao {
    public static void main(String[] args) {

        double a = 1; // conversao de forma implicita

        System.out.println(a);

        double num1 = 1.0;
        int num2 = (int) num1;
        System.out.println(num2);

        float num3 = (float) 1.213456732;
        System.out.println(num3);

        int num4 = 128;
        byte num5 = (byte) num4;
        System.out.println(num5);

        double g = 1.999999;
        int h = (int) g;
        System.out.println(h);
    }
}
