package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double resultadoSoma = calc.somar( 5.5, 3.0);
        int resultadoMultiplicacao = Calculadora.multiplicar( 2, 5);
        int resultadoSomaInt = calc.somar(10,20);
        int resultadoSomaInt2 = calc.somar(5,7,9); // metodo com sobrecarga

        Calculadora.saudacao();
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado da soma de inteiros: " + resultadoSomaInt);
        System.out.println("Resultado da soma de inteiros(SOBRECARGA): " + resultadoSomaInt2);
    }
}
