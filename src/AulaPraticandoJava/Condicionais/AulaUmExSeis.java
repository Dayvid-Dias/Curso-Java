package AulaPraticandoJava.Condicionais;

import java.util.Scanner;

public class AulaUmExSeis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = sc.nextLine();

        switch (dia.toLowerCase()){

            case "Domingo":
            case "1":
                System.out.println("Domingo não é um dia útil.");
                break;

            case "segunda":
            case "2":
                System.out.println("Segunda é um dia útil.");
                break;

            case "terça":
            case "3":
                System.out.println("Terça é um dia útil.");
                break;

            case "quarta":
            case "4":
                System.out.println("Quarta é um dia útil.");
                break;

            case "quinta":
            case "5":
                System.out.println("Quinta é um dia útil.");
                break;

            case "sexta":
            case "6":
                System.out.println("Sexta é um dia útil.");
                break;

            case "sabado":
            case "7":
                System.out.println("Sábado é um dia útil.");
                break;

            default:
                System.out.println("Opção inválida");
        }

    }

}
