import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de venda do produto: R$ ");
        double valor = scanner.nextDouble();

        double valorRepresentante = valor * 0.2;
        double valorImposto = valor * 0.3;
        double valorVenda = valor + valorRepresentante + valorImposto;

        System.out.printf("Valor representante: R$ %.2f\n", valorRepresentante);
        System.out.printf("Valor imposto: R$ %.2f\n", valorImposto);
        System.out.printf("Valor de venda: R$ %.2f\n", valorVenda);
    }
}
