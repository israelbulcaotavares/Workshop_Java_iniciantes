package classe;

public class Porta_de_entrada {
    public static void main(String[] args) {
        //criar um objeto da classe "Carro"
        Carro meuCarro = new Carro("Toyota","Corolla", 2023);

        //chamar o método para exibir as informações
        //meuCarro.exibirInformacoes();

        meuCarro.ligar();// método sem retorno
        System.out.println(meuCarro.obterInformacoes()); // método com retorno e sem parrâmetros
        Carro.mensagemDeBoasVindas(); // método estático
        meuCarro.acelerar(90); // método com parametro
        meuCarro.acelerar();


    }
}
