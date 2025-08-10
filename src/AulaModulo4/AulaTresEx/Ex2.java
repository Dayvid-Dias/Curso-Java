package AulaModulo4.AulaTresEx;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite a senha:");
            String senha = sc.nextLine();
            if (senha.length() < 8){
                throw new SenhaInvalidaException("A senha não atende aos requisitos");
            }
        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
