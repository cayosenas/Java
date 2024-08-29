import java.util.Scanner;
import java.util.StringTokenizer;

public class maiorEMenor {
    public static void main(String[] args) {
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma lista de números separados por vírgula: ");
            input = scanner.nextLine();
        }

        StringTokenizer tokenizer = new StringTokenizer(input, ",");

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (tokenizer.hasMoreTokens()) {
            try {
                int numero = Integer.parseInt(tokenizer.nextToken().trim());

                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: " + e.getMessage());
                return;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("O menor número é: ");
    }
}