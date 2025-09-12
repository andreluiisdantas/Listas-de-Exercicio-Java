import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite a quantidade de horas: ");
        int horas = scanner.nextInt();

        System.out.println("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        System.out.println("Digite a quantidade de segundos: ");
        int segundos = scanner.nextInt();

        int horasParaSegundos = horas * 3600;
        int minutosParasgundos = minutos * 60;

        int totalParaSegundos = horasParaSegundos + minutosParasgundos + segundos;

        System.out.printf("O horário convertido em segundos são %d segundo(s).", totalParaSegundos);
    }
}
