package AulaModulo1.AulaTresEx;

import java.util.Scanner;

//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais,
// diferentes, o primeiro é maior ou o segundo é maior.
public class AulaTresExTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numUm = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numDois = sc.nextInt();

        if (numUm == numDois){
            System.out.println("Os números são iguais");
        }else {
            System.out.println("Os números são diferentes");
            if (numUm > numDois){
                System.out.println("O primeiro número é maior.");
            }else {
                System.out.println("O segundo número é maior.");
            }
        }

    }

}
