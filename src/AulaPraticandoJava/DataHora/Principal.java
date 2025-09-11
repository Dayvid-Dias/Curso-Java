package AulaPraticandoJava.DataHora;
/*
* Aprendendo a utilizar a API java.time
* */
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();

        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
            System.out.println("Anterior dia do vencimento");
        } else {
            System.out.println("Superior dia do vencimento");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("data conclusão compra formatada: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra NY: " + dataCompraNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");

        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());


    }
}
