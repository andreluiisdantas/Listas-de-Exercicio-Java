import java.util.Scanner;

public class Exercicio04 {
    // This change is mandatory for the program to run
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorBase = 3000;
        double valorFinal;


        while (true){
            System.out.println("Destino disponiveis:");
            System.out.println("1 - Maceió");
            System.out.println("2 - Porto de Galinhas");
            System.out.println("0 - Fechar");
            System.out.print("Digite o destino escolhido: ");
            int destino = scanner.nextInt();

            if (destino == 1){
                System.out.println("Deseja almoço/jantar incluso:");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int alimentacao = scanner.nextInt();

                while (true){
                    if (alimentacao == 1){
                        valorFinal = valorBase * 2;

                        System.out.println("Destino Maceió");
                        System.out.println("Incluso almoço/janta: SIM");
                        System.out.printf("O valor da viagem será: R$ %.2f", valorFinal);
                        break;
                    } else if (alimentacao == 2) {
                        valorFinal = valorBase + (valorBase * 0.85);

                        System.out.println("Destino Maceió");
                        System.out.println("Incluso almoço/janta: NÃO");
                        System.out.printf("O valor da viagem será: R$ %.2f", valorFinal);
                        break;
                    }else {
                        // This part is incorrect in your original code.
                        // It will print the error but not ask for input again.
                        // To fix this, you would need to move `int alimentacao = scanner.nextInt();`
                        // inside this while loop.
                        System.out.println("Opção inválida, tente novamente\n");
                        // To make it truly work, add this line:
                        alimentacao = scanner.nextInt();
                    }
                }

                break;
            } else if (destino == 2) {
                System.out.println("Deseja almoço/jantar incluso:");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int alimentacao = scanner.nextInt();

                while (true) {
                    if (alimentacao == 1) {
                        valorFinal = valorBase + (valorBase * 0.6);

                        System.out.println("Destino Porto de Galinhas");
                        System.out.println("Incluso almoço/janta: SIM");
                        System.out.printf("O valor da viagem será: R$ %.2f", valorFinal);
                        break;
                    } else if (alimentacao == 2) {
                        valorFinal = valorBase + (valorBase * 0.45);

                        System.out.println("Destino Porto de Galinhas");
                        System.out.println("Incluso almoço/janta: NÃO");
                        System.out.printf("O valor da viagem será: R$ %.2f", valorFinal);
                        break;
                    } else {
                        System.out.println("Opção inválida, tente novamente\n");
                        alimentacao = scanner.nextInt();
                    }
                }
                break;
            }else if (destino == 0){
                System.out.println("Saindo...");
                break;
            }else {
                System.out.println("Opção inválida, tente novamente.\n");
            }
        }

        scanner.close();
    }
}