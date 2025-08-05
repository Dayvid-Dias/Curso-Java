package AulaModulo2.AulaQuatroEx;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double temperaturaCelsius;
    private double temperaturaFahrenheit;

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        System.out.printf("A temperatura em Fahrenheit é de: %.1f\n", temperaturaFahrenheit);
        return temperaturaFahrenheit;
    }

    @Override
    public double fahrenheitParaCelsius() {
        temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.printf("A temperatura em Celsius é de: %.1f\n", temperaturaCelsius);
        return temperaturaCelsius;
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.setTemperaturaCelsius(34);
        conversor.celsiusParaFahrenheit();

        conversor.setTemperaturaFahrenheit(89);
        conversor.fahrenheitParaCelsius();
    }
}