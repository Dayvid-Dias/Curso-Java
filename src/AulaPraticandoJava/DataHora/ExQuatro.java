package AulaPraticandoJava.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
* Descrição
* Você é responsável pelos projetos em uma empresa de desenvolvimento de software.
* Para garantir que os prazos sejam cumpridos,
* você precisa calcular a data de entrega de cada projeto com base na data de início e no prazo estimado em dias.

Você precisa criar um programa que:

Receba uma data de início.
Adicione o prazo em dias ao início do projeto.
Exiba a data final formatada corretamente.
* */
public class ExQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite a data de início do projeto: ");
        LocalDate dataInicio = LocalDate.parse(sc.nextLine(), formatter);
        System.out.println("Digite o prazo em dias para o fim do projeto: ");
        int diasPrazo = sc.nextInt();

        LocalDate dataTermino = dataInicio.plusDays(diasPrazo);

        System.out.println("\nData de início do projeto: " + dataInicio.format(formatter));
        System.out.println("Prazo para entregar o projeto: " + diasPrazo + " dias.\n");
        System.out.println("Data de entrega: " + dataTermino.format(formatter));
        sc.close();

    }
}
