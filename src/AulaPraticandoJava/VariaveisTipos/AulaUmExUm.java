package AulaPraticandoJava.VariaveisTipos;

import java.util.Scanner;

public class AulaUmExUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double notaUm = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double notaDois = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double notaTres = sc.nextDouble();

        double media = (notaUm + notaDois + notaTres) /3;

        System.out.println("a média das notas é: " + media);

    }

}
