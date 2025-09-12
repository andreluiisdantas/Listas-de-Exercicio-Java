import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double resultado = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("A média ponderado das duas são: %.2f", resultado);
    }
}
