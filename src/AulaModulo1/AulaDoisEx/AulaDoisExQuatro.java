package AulaModulo1.AulaDoisEx;

public class AulaDoisExQuatro {
    //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
    //Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
    public static void main(String[] args) {

        double precoProduto = 3.450;
        int quantidade = 14;
        double valorTotal = quantidade * precoProduto;

        System.out.printf("Existem %d nintendo switch 2 que custam R$%.3f cada, o valor total deles é de: R$%.3f",
                quantidade, precoProduto, valorTotal);

    }
}
