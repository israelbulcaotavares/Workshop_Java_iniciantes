package estrutura_de_controle;

public class For_Somar_numeros_Pares {
    public static void main(String[] args) {
        int soma = 0 ;

        for(int i=0; i<= 10; i++){
            if(i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("Soma dos numeros pares: " + soma);
    }
}
