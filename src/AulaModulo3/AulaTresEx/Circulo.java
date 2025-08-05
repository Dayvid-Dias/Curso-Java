package AulaModulo3.AulaTresEx;

import java.util.ArrayList;

public class Circulo implements Forma{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Círculo";
    }

    @Override
    public double calcularArea() {
        return Math.PI * getRaio() * getRaio();
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        circulo.setRaio(3);
        quadrado.setLado(4);

        var listaDeFormas = new ArrayList<Forma>();

        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas){
            System.out.printf("Área do %s: %.2f%n", forma.toString(), forma.calcularArea());
        }

    }

}
