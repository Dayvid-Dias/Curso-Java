package AulaModulo3.AulaTresEx;

public class Quadrado implements Forma{
    private double lado;

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Quadrado";
    }
}
