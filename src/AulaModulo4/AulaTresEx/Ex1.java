package AulaModulo4.AulaTresEx;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número a ser dividido: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número divisor: ");
        int divisor = sc.nextInt();

        try{
        int res = numero / divisor;
        System.out.println("Resultado da divisão: " + res);
        } catch (ArithmeticException e){
            System.out.println("O número divisor não pode ser 0!");
        }
        sc.close();
    }
}
