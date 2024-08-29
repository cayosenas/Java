public class Numeros {
    // Atributo da classe
    private final int[] arrayNumeros;

    // Construtor que inicializa o atributo arrayNumeros
    public Numeros(int[] arrayNumeros) {
        this.arrayNumeros = arrayNumeros;
    }

    // Método para calcular e retornar a soma de todos os elementos do array
    public int somarElementos() {
        int soma = 0;
        for (int numero : arrayNumeros) {
            soma += numero;
        }
        return soma;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando um array de inteiros
        int[] numeros = {6, 7, 8, 9, 10};

        // Criando uma instância do objeto Numeros
        Numeros numerosObj = new Numeros(numeros);

        // Calculando e exibindo a soma dos elementos
        int soma = numerosObj.somarElementos();
        System.out.println("A soma dos elementos é: " + soma);
    }
}