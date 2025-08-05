package AulaModulo1.AulaTresEx;

import java.util.Scanner;

//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
public class AulaTresExSeis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.printf("O número %d é par.", num);
        }else {
            System.out.printf("O número %d é ímpar.", num);
        }

    }

}
