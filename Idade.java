import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
                System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite sua idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    if (idade < 18) {
                        System.out.println(nome + " é menor de idade.");
                    }
                    else {
                        System.out.println(nome + " é maior de idade.");
                    }
            }
        }
}