package AulaModulo2.AulaQuatroEx;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        if (valorDolar > 0){
            double valorReais = valorDolar * 5.59;
            System.out.println("O valor em BRL é R$ " + String.format("%.2f", valorReais));
        }else {
            System.out.println("Valor inválido!");
        }
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        conversor.converterDolarParaReal(100);
    }

}
