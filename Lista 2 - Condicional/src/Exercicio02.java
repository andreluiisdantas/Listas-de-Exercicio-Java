import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor;
        int quantidade;

        System.out.print("Digite o valor do produto: R$ ");
        valor = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        quantidade = scanner.nextInt();

        if (quantidade > 12){
            double valorComDesconto = valor - (valor * 0.1);
            double valorTotal = valorComDesconto * quantidade;

            System.out.println("\n===== Informações da compra =====");
            System.out.printf("Valor unidade: R$ %.2f\n", valor);
            System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);
            System.out.printf("Valor total da compra: %.2f\n",  valorTotal);
        }

    }
}