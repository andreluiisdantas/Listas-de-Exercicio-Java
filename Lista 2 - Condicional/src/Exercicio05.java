import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo ao sistema de estoque");

        System.out.print("Digite a quantidade máxima de estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade mínima do estoque: ");
        int quantidadeMinima = scanner.nextInt();

        System.out.print("Digite a quantidade atual do estoque: ");
        int quantidadeAtual = scanner.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima)/2;

        if(quantidadeAtual >= quantidadeMedia){
            System.out.println("Não efetuar a compra!");
        } else {
            System.out.println("Efetuar a compra!");
        }
        scanner.close();
    }
}
