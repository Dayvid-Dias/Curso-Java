package AulaPraticandoJava.DataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
* Descrição
* Você trabalha no setor de tecnologia de uma empresa que gera relatórios diários.
* Esses relatórios incluem informações como transações realizadas,
* atualizações de pedidos e registros de atendimento ao cliente.
* A equipe responsável pela análise dos relatórios solicitou
*  que a data e a hora sejam exibidas em um formato mais familiar para os usuários brasileiros.

Para resolver essa tarefa, você deve:

Capturar a data e a hora atuais.
Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
Formatar a hora no padrão HH:mm (hora e minutos).
Exibir o resultado da formatação.
* */
public class ExDois {
    public static void main(String[] args) {

        String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Data formatada: " + data);
        System.out.println("Hora formatada: " + hora);

    }
}
