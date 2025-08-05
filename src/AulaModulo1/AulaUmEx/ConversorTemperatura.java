package AulaModulo1.AulaUmEx;

public class ConversorTemperatura {

    public static void main(String[] args) {

        int temperaturaCelsius = 18 ;

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura em graus celsius é de: " + temperaturaCelsius);
        System.out.printf("A temperatura em graus Fahrenheit é de: %.0f%n fahrenheit",  temperaturaFahrenheit);

    }
}
