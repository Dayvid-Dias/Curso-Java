package AulaPraticandoJava.VariaveisTipos;

import java.util.Scanner;

public class AulaUmExQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        double num = sc.nextDouble();

        double valorDolar = num * 5.56;

        System.out.printf("Valor em Dólar: USD %.2f", valorDolar);

    }

}
