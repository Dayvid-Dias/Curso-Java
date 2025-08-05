package AulaModulo2.AulaUmEx;

import java.time.Year;

public class AulaUmExQuatro {

    String modelo;
    int ano;
    String cor;

    void exibirFicha() {
        System.out.printf("""
                Modelo do carro: %s
                Ano do carro: %d
                Cor do carro: %s
                """, modelo, ano, cor);
    }

    int idadeCarro() {
        int anoAtual = Year.now().getValue();
        return anoAtual - ano;
    }

    static String pluralizaAno(int idade) {
        if (idade == 1) {
            return "ano";
        } else {
            return "anos";
        }
    }

    void exibirIdade() {
        int anoAtual = Year.now().getValue();
        int idade = idadeCarro();

        if (ano > anoAtual) {
            System.out.printf("O carro será lançado em %d.\n", ano);
        } else if (idade == 0) {
            System.out.println("O carro é do ano.");
        } else {
            System.out.printf("O carro tem %d %s de idade.\n", idade, AulaUmExQuatro.pluralizaAno(idade));
        }
    }

    public static void main(String[] args) {
        AulaUmExQuatro carro = new AulaUmExQuatro();

        carro.modelo = "Mclaren Senna";
        carro.ano = 2026; // ano futuro para testar
        carro.cor = "Laranja";

        carro.exibirFicha();
        carro.exibirIdade();
    }
}
