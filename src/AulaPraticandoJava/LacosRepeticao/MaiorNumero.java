package AulaPraticandoJava.LacosRepeticao;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        String[] numerosString = sc.nextLine().split(" ");

        int maiorNumero = Integer.parseInt(numerosString[0]);

        for (int i = 1; i < numerosString.length; i++) {
            int numero = Integer.parseInt(numerosString[i]);
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        sc.close();
    }
}
