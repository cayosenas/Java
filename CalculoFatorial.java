import java.util.Scanner;

public class CalculoFatorial {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro para calcular o fatorial: ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                System.out.println("O fatorial de números negativos não é definido.");
            } else {
                long fatorial = 1;
                
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i; // fatorial = fatorial * i
                }
                
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }
        }
    }
}