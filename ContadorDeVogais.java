import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine().toLowerCase();
            HashMap<Character, Integer> contagemVogais = new HashMap<>();
            contagemVogais.put('a', 0);
            contagemVogais.put('e', 0);
            contagemVogais.put('i', 0);
            contagemVogais.put('o', 0);
            contagemVogais.put('u', 0);
            for (char c : frase.toCharArray()) {
                if (contagemVogais.containsKey(c)) {
                    contagemVogais.put(c, contagemVogais.get(c) + 1);
                }
            }
            System.out.println("Tabela de Frequências das Vogais:");
            System.out.printf("%-5s %s%n", "Vogal", "Frequência");
            System.out.println("--------------------");
            for (Map.Entry<Character, Integer> entrada : contagemVogais.entrySet()) {
                System.out.printf("%-5c %d%n", entrada.getKey(), entrada.getValue());
            }
        }
    }
}