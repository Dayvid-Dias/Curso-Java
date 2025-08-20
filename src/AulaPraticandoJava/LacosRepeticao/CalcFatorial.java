package AulaPraticandoJava.LacosRepeticao;

import java.util.Scanner;

public class CalcFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int fatorial = 1;

        for (int i = num; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
        sc.close();
    }
}
