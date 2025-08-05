package AulaPraticandoJava.Condicionais;

import java.util.Scanner;

public class AulaUmExSete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000){
            System.out.printf("O valor R$%.2f está dentro do prazo permitido para empréstimo.", valorEmprestimo);
        }else {
            System.out.printf("O valor R$%.2f não está dentro do intervalo permitido para empréstimo.", valorEmprestimo);
        }

    }

}
