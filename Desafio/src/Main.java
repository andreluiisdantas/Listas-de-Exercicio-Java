import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            LocalTime horaDePartida = LocalTime.of(17, 0, 0);

            int posicaoInicialA;
            int posicaoInicialB;
            int velocidadeA;
            int velocidadeB;

            while (true) {
                try {
                    System.out.print("Digite a posição do Trem A (KM): ");
                    posicaoInicialA = scanner.nextInt();
                    System.out.print("Digite a posição do Trem B (KM): ");
                    posicaoInicialB = scanner.nextInt();

                    if (posicaoInicialA < 0 || posicaoInicialB < 0 || posicaoInicialA > 10000 || posicaoInicialB > 10000) {
                        System.out.println("O número deve ser maior ou igual a zero e menor que 10000.");
                    } else {
                        break;
                    }
                } catch (Exception InputMismatchException) {
                    System.out.println("Você digitou um caractere inválido.");
                    System.out.println("Por favor, digite novamente:");
                    scanner.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.print("Digite a velocidade do Trem A em Km/h (ex: 100): ");
                    velocidadeA = scanner.nextInt();
                    System.out.print("Digite a velocidade do Trem B em Km/h (ex: 150): ");
                    velocidadeB = scanner.nextInt();

                    if (velocidadeA > 300 || velocidadeB > 300 || velocidadeA < 0 || velocidadeB < 0) {
                        System.out.println("A velocidade deve ser um valor positivo (ou zero) entre 0 e 300.");
                    } else {
                        break;
                    }
                } catch (Exception InputMismatchException) {
                    System.out.println("Você digitou um caractere inválido.");
                    System.out.println("Por favor, digite novamente:");
                    scanner.nextLine();
                }
            }

            if (posicaoInicialB < posicaoInicialA) {
                System.out.println("\nNÃO HAVERÁ COLISÃO: Os trens estão se afastando um do outro.\n");
            } else {
                velocidadeB = -velocidadeB;

                double tempoEmHoras = (double) (posicaoInicialB - posicaoInicialA) / (velocidadeA - velocidadeB);
                double tempoParaColidir = tempoEmHoras * 3600;
                double localDaColisao = posicaoInicialA + (velocidadeA * tempoEmHoras);

                LocalTime horarioDaColisao = horaDePartida.plusSeconds((long) tempoParaColidir);
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horarioFormatado = horarioDaColisao.format(formatador);

                System.out.printf("A colisão dos trens ocorrerá no KM %d e ocorrerá após %d segundos no horário de %s\n", (int)localDaColisao, (int)tempoParaColidir, horarioFormatado);
            }

            System.out.print("Deseja executar novamente? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\nFIM DO PROGRAMA");
        scanner.close();
    }
}
