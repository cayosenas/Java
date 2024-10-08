import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7: ");
            int numero = scanner.nextInt();
            
            String diaDaSemana;
            
            diaDaSemana = switch (numero) {
                case 1 -> "Domingo";
                case 2 -> "Segunda-feira";
                case 3 -> "Terça-feira";
                case 4 -> "Quarta-feira";
                case 5 -> "Quinta-feira";
                case 6 -> "Sexta-feira";
                case 7 -> "Sábado";
                default -> "Número inválido. Digite um número de 1 a 7.";
            };
            
            System.out.println("Dia da semana correspondente: " + diaDaSemana);
        }
    }
}