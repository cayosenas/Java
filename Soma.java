import java.util.Scanner;

public class Soma {
       public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Escolha o tipo de conversão:");
                System.out.println("1. Soma");
                System.out.print("Digite o número da opção desejada: ");
                int option = scanner.nextInt();

                switch(option){
                    case 1 -> {
                        double num1;
                        System.out.print("Digite um número: ");
                        num1 = scanner.nextDouble();
                        double num2;
                        System.out.print("Digite outro número: ");
                        num2 = scanner.nextDouble();
                        double result = num1 + num2;
                        System.out.print("Resultado: " + result);
                    }
                }
            }
       }
}