package AulaPraticandoJava.DataHora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
* Descrição
* Você trabalha no setor administrativo de uma empresa e precisa de um sistema para acompanhar os horários
* de entrada e saída dos funcionários. O sistema deve calcular o horário de saída com base na
* hora de entrada e na carga horária diária.
Além disso, para controle de banco de horas, o sistema deve calcular quantas horas um funcionário trabalhou
*  a mais ou a menos, caso o expediente tenha durado mais ou menos que o previsto.

O programa deve:
Capturar o horário de entrada.
Adicionar a carga horária diária para calcular o horário de saída previsto.
Capturar o horário real de saída
Calcular a diferença entre o tempo trabalhado e a carga horária.
Exibir as informações formatadas corretamente.

Dica:
Para tornar o sistema mais interativo, utilize a classe Scanner para capturar a entrada do usuário,
* permitindo que ele informe os horários diretamente. Neste caso, primeiro, crie um objeto Scanner
* para ler os dados digitados. Depois, defina um DateTimeFormatter para garantir que os horários
* sejam inseridos no formato correto, ou seja, com duas casas para horas e minutos, separados por
* dois pontos (HH:mm), como "08:05". Isso evita erros ao converter o valor digitado em um objeto LocalTime.
* Em seguida, solicite a entrada do usuário com System.out.print() e utilize LocalTime.parse()
* para interpretar a string informada e transformá-la em um horário válido.
* */
public class ExNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cargaHoraria = 8;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Digite o horário de entrada: \n");
        LocalTime horaEntrada = LocalTime.parse(sc.nextLine(), formatter);
        LocalTime horaSaidaPrevisto = horaEntrada.plusHours(cargaHoraria);
        System.out.println("Horário de saída previsto: " + horaSaidaPrevisto + "\n");
        System.out.println("Digite o horário de saída: ");
        LocalTime horaSaida = LocalTime.parse(sc.nextLine(), formatter);
        Duration duration = Duration.between(horaEntrada, horaSaida);
        Duration cargaTrabalhada = duration.minusHours(cargaHoraria);
        System.out.println("Duração do expediente: " + duration.toHours() + " e " + duration.toMinutesPart() + " minutos.");
        System.out.println("Diferença entre o tempo trabalho e carga horaria: " + cargaTrabalhada.toHours() + " e " + cargaTrabalhada.toMinutesPart() + " minutos.");
    }
}
