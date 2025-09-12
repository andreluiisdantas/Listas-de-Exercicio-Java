import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String grauInstrucao = "";
        boolean cnhTipoB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Seja bem-vindo a nossa empresa\n");
        System.out.println("Preencha o formulário abaixo\n");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento nesse formato (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite a pretensão salarial: ");
        double pretensaoSalarial = scanner.nextDouble();
        scanner.nextLine();

        while (true) {
            System.out.println("Qual o seu grau de instrução: ");
            System.out.println("1 - Ensino Médio");
            System.out.println("2 - Ensino Técnico");
            System.out.println("3 - Ensino Superior");
            int opcaoGrau = scanner.nextInt();
            scanner.nextLine(); // limpar o \n após nextInt()

            if (opcaoGrau == 1) {
                grauInstrucao = "Ensino Médio";
                break;
            } else if (opcaoGrau == 2) {
                grauInstrucao = "Ensino Técnico";
                break;
            } else if (opcaoGrau == 3) {
                grauInstrucao = "Ensino Superior";
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.print("Digite seu cargo pretendido: ");
        String cargoPretendido = scanner.nextLine();

        while (true) {
            System.out.println("Possui CNH tipo B? (sim/não): ");
            String opcaoCNH = scanner.nextLine().toLowerCase();

            if (opcaoCNH.equals("sim")) {
                cnhTipoB = true;
                break;
            } else if (opcaoCNH.equals("nao") || opcaoCNH.equals("não")) {
                cnhTipoB = false;
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("\nCadastro feito com sucesso:");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.printf("Pretensão salarial: R$ %.2f\n", pretensaoSalarial);
        System.out.println("Grau de instrução: " + grauInstrucao);
        System.out.println("Cargo pretendido: " + cargoPretendido);
        System.out.println("Possui CNH tipo B: " + (cnhTipoB ? "Sim" : "Não"));

        scanner.close();
    }
}
