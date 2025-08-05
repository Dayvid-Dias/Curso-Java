package AulaModulo1.AulaTresEx;

import java.util.Scanner;

//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
public class AulaTresExSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.printf("%d! = %d\n", num, fatorial);

    }

}
