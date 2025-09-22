import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        if(idade < 15){
            System.out.println("Você é uma criança!");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente!");
        } else if (idade <= 30) {
            System.out.println("Você é umm adulto jovem!");
        } else {
            System.out.println("Você é adulto!");
        }

    }
}