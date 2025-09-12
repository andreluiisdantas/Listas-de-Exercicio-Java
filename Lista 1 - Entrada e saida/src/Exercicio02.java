import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;

        double potencia = Math.pow(n1, n2);
        System.out.printf("%d + %d = %d\n", n1, n2, soma);
        System.out.printf("%d - %d = %d\n", n1, n2, subtracao);
        System.out.printf("%d * %d = %d\n", n1, n2, multiplicacao);
        System.out.printf("%d ** %d = %f\n", n1, n2, potencia);

        if (n2 == 0){
            System.out.printf("A divisão não poderá ser realizada!\n");
        }else{
            int divisao = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, divisao);
            double restoDivisao = n1 % n2;
            System.out.printf("%d %% %d = %f\n", n1, n2, restoDivisao);
        }



    }
}
