package AulaPraticandoJava.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
* Descrição
* Você trabalha no setor financeiro de uma empresa de serviços
*  e é responsável por gerenciar o vencimento das faturas dos clientes.
* Em alguns casos, os clientes solicitam um adiamento da data de pagamento,
* e o sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.

Crie um programa que:

Receba uma data de vencimento original.
Adicione um número de meses ao vencimento.
A data ajustada deve ser exibida no formato dd-MM-yyyy.
* */
public class ExCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe a data de vencimento original: ");
        LocalDate dataOriginal = LocalDate.parse(sc.nextLine(), formatter);

        System.out.println("Adicione o número de meses a ser adicionado no prazo: ");
        int meses = sc.nextInt();

        LocalDate dataAtualizada = dataOriginal.plusMonths(meses);

        System.out.println("Nova data de vencimento: " + dataAtualizada.format(formatter));
    }
}
