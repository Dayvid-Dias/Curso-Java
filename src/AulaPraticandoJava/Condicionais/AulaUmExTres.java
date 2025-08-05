package AulaPraticandoJava.Condicionais;

import java.util.Objects;
import java.util.Scanner;

public class AulaUmExTres {

    public static void main(String[] args) {

        String senhaPadrao = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha para acessar o sistema: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaPadrao)){
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Pah, acesso negado!");
        }

    }

}
