package AulaPraticandoJava.Condicionais;

import java.util.Scanner;

public class AulaUmExDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double numUm = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double numDois = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double numTres = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double numQuatro = sc.nextDouble();

        double media = (numUm + numDois + numTres +numQuatro) / 4;

        if (media >= 7){
            System.out.printf("O estudante teve média %.2f e foi aprovado", media);
        }else if (media >= 5 || media <= 6.9) {
            System.out.printf("O estudante teve média de %.2f e está de recuperação", media);
        }else {
            System.out.printf("O estudante teve média 4.3 e foi reprovado.");
        }
    }
}
