import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int numeroDigitado = scanner.nextInt();

            if(numeroDigitado % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares ++;
            }

            if(numeroDigitado > 0){
                numerosPositivos++;
            }else {
                numerosNegativos++;
            }
        }

        System.out.println("=== Escolha a opção que deseja ver ===");
        System.out.println("1 - Ver quantos números pares");
        System.out.println("2 - Ver quantos números impares");
        System.out.println("3 - Ver quantos números positivos");
        System.out.println("4 - Ver quantos números negativos");
        System.out.println("0 - Fechar programa");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("A quantidade de números pares são: " + numerosPares);
                break;
            case 2:
                System.out.println("A quantidade de números ímpares são: " + numerosImpares);
                break;
            case 3:
                System.out.println("A quantidade de números positivos são: " + numerosPositivos);
                break;
            case 4:
                System.out.println("A quantidade de números negativos são: " + numerosNegativos);
                break;
            case 0:
                System.out.println("Saindo do programa...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
