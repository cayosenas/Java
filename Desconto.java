import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Digite um valor: ");
            double valor = sc.nextDouble();

            double desconto = valor * 0.90;
            double parcela = valor / 3;
            double comissao = desconto * 0.05;
            double comissaoParcelado = valor * 0.05;

            System.out.println("valor com desconto de 10%: R$" + desconto);
            System.out.println("valor parcelado em 3x sem juros: R$" + parcela);
            System.out.println("comissão do vendedor com compra à vista: R$" + comissao);
            System.out.println("comissão do vendedor com compra parcelada: R$" + comissaoParcelado);
        }
    }
}
