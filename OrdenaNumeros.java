import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma lista de números inteiros separados por vírgulas (exemplo: 3,1,4,1,5):");
            String entrada = scanner.nextLine();
            
            String[] partes = entrada.split(",");
            
            int[] numeros = new int[partes.length];
            
            for (int i = 0; i < partes.length; i++) {
                try {
                    numeros[i] = Integer.parseInt(partes[i].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Certifique-se de inserir apenas números inteiros.");
                    scanner.close();
                    return;
                }
            }
            
            Arrays.sort(numeros);
            
            System.out.println("Números ordenados em ordem crescente:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}