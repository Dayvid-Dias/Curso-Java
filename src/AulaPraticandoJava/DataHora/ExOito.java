package AulaPraticandoJava.DataHora;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
* Descrição
* Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália.
* Como os horários variam de acordo com o fuso horário, você precisa de um sistema que
* converta automaticamente o horário local para o horário de Sydney.

Crie um programa que converta o horário atual do sistema (fuso horário padrão)
* para o fuso horário de Sydney (Australia/Sydney) e exiba apenas as horas e os minutos.
* Dica: Utilize o método withZoneSameInstant() para realizar a conversão.
* */
public class ExOito {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaSydney = horaAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("\nHorário atual no sistema: " + horaAtual.format(formatter));
        System.out.println("\nHorário atual em Sydney: " + horaSydney.format(formatter));
    }
}
