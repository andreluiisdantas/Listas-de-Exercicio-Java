import java.util.Scanner;

public class Exercicio03 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de gols do time A: ");
        int golsTimeA = scanner.nextInt();

        System.out.print("Digite a quantidade de gols do time B: ");
        int golsTimeB = scanner.nextInt();

        System.out.println("=== Placar ===");
        System.out.printf("%d X %d\n", golsTimeA, golsTimeB);

        if(golsTimeA > golsTimeB){
            System.out.println("Time A venceu!");
        }else {
            System.out.println("Time B venceu!");
        }
        scanner.close();
    }
}
