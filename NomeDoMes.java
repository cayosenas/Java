import java.util.Scanner;

public class NomeDoMes {
    public static void main(String[] args) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o número do mês (1 a 12): ");
            int n = sc.nextInt();
            
            if (n >= 1 && n <= 12) {
                System.out.println(meses[n -1]);
            } else {
                System.out.println("Mês inválido");
            }
        }
    }
}