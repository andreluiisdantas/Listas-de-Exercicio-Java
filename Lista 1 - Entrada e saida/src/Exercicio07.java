import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = 1500;
        double comissao = 350;

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();

        System.out.print("Digite a quantidade de carros vendidos: ");
        int quantidadeVendida = scanner.nextInt();

        System.out.print("Quantidade total de vendas em " + mes + ": ");
        double totalVendaMes = scanner.nextDouble();

        double totalComissao = comissao * quantidadeVendida;
        double totalComissaoMes = 0.001 * totalVendaMes;

        double salarioFinal = salario + totalComissaoMes + totalComissao;

        System.out.printf("Salário mensal: R$ %.2f \n", salario);
        System.out.printf("Comissão por vendas: R$ %.2f \n", totalComissao);
        System.out.printf("Comissão por vendas totais no mês: R$ %.2f \n", totalComissaoMes);
        System.out.printf("Salário final: R$ %.2f \n", salarioFinal);
    }
}
