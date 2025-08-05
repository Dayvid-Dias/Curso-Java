package AulaPraticandoJava.Condicionais;

import java.util.Scanner;

public class AulaUmExQuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numUm = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numDois = sc.nextInt();

        if (numUm > numDois){
            System.out.println("O maior número é " + numUm);
        } else if (numDois > numUm) {
            System.out.println("O maior número é " + numDois);
        }else{
            System.out.println("Os números digitados são iguais.");
        }

    }

}
