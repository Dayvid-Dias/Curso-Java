package AulaModulo1.AulaTresEx;

//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class AulaTresExDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.printf("O número %d é um número positivo", num);
        } else {
            System.out.printf("O número %d é um número negativo", num);
        }
    }

}
