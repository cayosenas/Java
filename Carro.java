public class Carro {
    // Atributos da classe
    private final String marca;
    private final String modelo;
    private final int ano;

    // Construtor que inicializa todos os atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir as informações do carro
    public void exibirInformacoes() {
        System.out.println("O carro consultado é um " + marca + " - " + modelo + ", ano " + ano);
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando uma instância do objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2024);
        Carro meuCarro2 = new Carro("Hyundai", "Creta", 2024);
        
        // Exibindo as informações do carro
        meuCarro.exibirInformacoes();
        meuCarro2.exibirInformacoes();
    }
}