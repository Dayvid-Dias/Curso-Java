package AulaModulo1.AulaTresEx;
//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
import java.util.Scanner;

public class AulaTresExCinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }

    }

}
