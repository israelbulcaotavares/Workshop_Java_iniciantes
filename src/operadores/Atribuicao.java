package operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //x = x + y;
        x+=y;
        System.out.println(x);

        x-=y;
        System.out.println(x);

        x*=y;
        System.out.println(x);

        x/=y;
        System.out.println(x);

        x%=y;
        System.out.println(x);
    }
}
