import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            int soma = 0;

            for (int i = 2; i <= 100; i = i + 2) {
                soma = soma + i;
            }
            
            System.out.println(soma);

            scanner.close();
        }
    }
}