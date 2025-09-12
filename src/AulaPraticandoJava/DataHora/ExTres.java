package AulaPraticandoJava.DataHora;
/*
* Descrição
* Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento.
* Você precisa monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.

Para isso, crie um programa que:

Receba dois horários representando o início e o término de uma atividade.
Calcule a diferença em horas e minutos entre esses dois horários.
Exiba o resultado formatado.
* */
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horário de início da atividade: ");
        LocalTime horaInicio = LocalTime.parse(sc.nextLine());

        System.out.println("Digite o horário de término da atividade: ");
        LocalTime horaTermino = LocalTime.parse(sc.nextLine());

        Duration duracao = Duration.between(horaInicio, horaTermino);

        System.out.println("\nhora início: " + horaInicio);
        System.out.println("hora término: " + horaTermino + "\n");
        System.out.println("jornada de trabalho realizada: " + duracao.toHours() + " horas.\n");
        System.out.println("Diferença de tempo: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

    }
}
