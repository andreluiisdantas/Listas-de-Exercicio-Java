import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorte = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao jogo");
        for (int i = 2; i >= 0; i--){
            System.out.print("Tente adivinhar o número: ");
            int numeroEscolhido = scanner.nextInt();

            if(numeroEscolhido == numeroSorte){
                System.out.println("Você acertou!");
                break;
            }else {
                System.out.println("Você errou");
                System.out.printf("Você tem %d chance(s)\n", i);
            }
        }
    }
}

