import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String entrada;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
            entrada = scanner.nextLine();
        }

        if (ehPalindromo(entrada)) {
            System.out.println(entrada + " é um palíndromo.");
        } else {
            System.out.println(entrada + " não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String str) {
        String limpaStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverso = new StringBuilder(limpaStr).reverse().toString();

        return limpaStr.equals(reverso);
    }
}