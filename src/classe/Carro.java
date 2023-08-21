package classe;

public class Carro {
    // atributos (caracteristicas)
    String marca;
    String modelo;
    int ano;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //Método com retorno e sem parametros
    String obterInformacoes(){
        return "Marca: "+ marca + ", Modelo: "+ modelo + ", Ano: "+ ano;
    }
    //Método sem retorno e sem parametros
    void ligar(){
        System.out.println("O carro está ligando.");
    }

    //Método estático
    static void mensagemDeBoasVindas(){
        System.out.println("Bem-vindo á classe Carro");
    }

    //Método COM parâmetros
    void acelerar(int velocidade){
        System.out.println("O carro está acelerando a  " + velocidade +"km/h");
    }

    //Método com sobrecarga
    void acelerar(){
        System.out.println("O carro está acelerando");
    }



    //Método sem retorno e parametro
    void exibirInformacoes(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
    }
}
