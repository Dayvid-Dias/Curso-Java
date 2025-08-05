package AulaModulo2.AulaTresEx;

public class ModeloCarro extends Carro{
    private String categoria;
    private String motor;

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nCategoria do carro: %s\n", categoria);
        System.out.printf("Modelo do carro: %s\n", motor);

    }

    public void buzina(){
        System.out.println("BIBIBI");
    }

    public void cavaloDePau(){
        System.out.println("Olha o freio");
    }

    public void fazerDrift(){
        System.out.println("Bota a segunda, afunda a embreagem e solta");
    }
}
