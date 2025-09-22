import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo das perguntas");
        System.out.println("Escolha a pergunta");
        System.out.println("1 - Pergunta 01");
        System.out.println("2 - Pergunta 02");
        int pergunta = scanner.nextInt();
        scanner.nextLine();

        if (pergunta == 1) {
            System.out.println("Pergunta 01: Normalmente, quantos litros de sangue uma pessoa tem? Em média, quantos são retirados numa doação de sangue?");
            System.out.println("a) Tem entre 2 a 4 litros. São retirados 450 mililitros");
            System.out.println("b) Tem entre 4 a 6 litros. São retirados 450 mililitros");
            System.out.println("c) Tem 10 litros. São retirados 2 litros");
            String resposta = scanner.nextLine();

            String respostaFormatada = resposta.toLowerCase();

            switch (respostaFormatada) {
                case "a", "c" -> {
                    System.out.println("Resposta errada.");
                    System.out.println("Tente novamente numa próxima.");
                }
                case "b" -> System.out.println("Parabéns você acertou");
                default -> {
                    System.out.println("Resposta inválida.");
                    System.out.println("Tente novamente numa próxima.");
                }
            }
        } else if (pergunta == 2) {
            System.out.println("Pergunta 02: De onde é a invenção do chuveiro elétrico?");
            System.out.println("a) França");
            System.out.println("b) Inglaterra");
            System.out.println("c) Brasil");
            String resposta = scanner.nextLine();

            String respostaFormatada = resposta.toLowerCase();

            switch (respostaFormatada) {
                case "a", "b" -> {
                    System.out.println("Resposta errada.");
                    System.out.println("Tente novamente numa próxima.");
                }
                case "c" -> System.out.println("Parabéns você acertou");
                default -> {
                    System.out.println("Resposta inválida.");
                    System.out.println("Tente novamente numa próxima.");
                }
            }
        }
        scanner.close();
    }
}
