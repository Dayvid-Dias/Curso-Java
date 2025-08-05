package AulaPraticandoJava.Condicionais;

import java.util.Scanner;

public class AulaUmExOito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int ladoUm = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        int ladoDois = sc.nextInt();

        System.out.println("Digite o  terceiro lado: ");
        int ladoTres = sc.nextInt();

        if (ladoUm + ladoDois > ladoTres && ladoUm + ladoTres > ladoDois && ladoDois + ladoTres > ladoUm){
            System.out.println("Os lados podem formar um triângulo.");
        }else{
            System.out.println("Os lados não podem formar um triângulo.");
        }

    }

}
