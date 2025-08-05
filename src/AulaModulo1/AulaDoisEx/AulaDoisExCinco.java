package AulaModulo1.AulaDoisEx;

public class AulaDoisExCinco {
    //Declare uma variável do tipo double valorEmDolares.
    // Atribua um valor em dólares a essa variável.
    // Considere que o valor de 1 dólar é equivalente a 5.55 reais hoje.
    // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
    public static void main(String[] args) {

        double valorEmDolares = 450;
        double valorEmReais = valorEmDolares * 5.55;

        System.out.printf("%.2f convertidos em BRL são R$%.2f", valorEmDolares, valorEmReais);

    }
}
