import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {

    private static final List<String> historico = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo à Calculadora Simples!");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Mostrar Histórico");
            System.out.println("6 - Sair");
            
            int operacao;
            
            do {
                System.out.print("Digite o número da operação desejada: ");
                operacao = scanner.nextInt();
                
                if (operacao == 6) {
                    System.out.println("Saindo...");
                    break;
                }
                
                if (operacao == 5) {
                    mostrarHistorico();
                    continue;
                }
                
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                
                double resultado;
                
                switch (operacao) {
                    case 1 -> {
                        resultado = adicao(num1, num2);
                        System.out.println("Resultado da adição: " + resultado);
                        salvarHistorico("Adição", num1, num2, resultado);
                    }
                    case 2 -> {
                        resultado = subtracao(num1, num2);
                        System.out.println("Resultado da subtração: " + resultado);
                        salvarHistorico("Subtração", num1, num2, resultado);
                    }
                    case 3 -> {
                        resultado = multiplicacao(num1, num2);
                        System.out.println("Resultado da multiplicação: " + resultado);
                        salvarHistorico("Multiplicação", num1, num2, resultado);
                    }
                    case 4 -> {
                        if (num2 != 0) {
                            resultado = divisao(num1, num2);
                            System.out.println("Resultado da divisão: " + resultado);
                            salvarHistorico("Divisão", num1, num2, resultado);
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        }
                    }
                    default -> System.out.println("Operação inválida.");
                }
                
            } while (operacao != 6);
        }
    }

    public static double adicao(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        return a / b;
    }

    public static void salvarHistorico(String operacao, double num1, double num2, double resultado) {
        String entrada = String.format("%s: %.2f e %.2f = %.2f", operacao, num1, num2, resultado);
        historico.add(entrada);
    }

    public static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio.");
        } else {
            System.out.println("Histórico:");
            for (String registro : historico) {
                System.out.println(registro);
            }
        }
    }
}