import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int numeroAnterior = numero - 1;
        int numeroSucessor = numero + 1;

        System.out.println("Número anterior: " + numeroAnterior);
        System.out.println("Número: " + numero);
        System.out.println("Número sucessor: " + numeroSucessor);
    }
}
