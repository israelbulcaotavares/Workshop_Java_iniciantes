package estrutura_de_controle;

public class IF_ELSE {
    public static void main(String[] args) {
        int valor = 0;

        if(valor > 0){
            System.out.println("Positivo");
        } else if (valor < 0) {
            System.out.println("Negativo");
        }else{
            System.out.println("Zero");
        }
    }
}
