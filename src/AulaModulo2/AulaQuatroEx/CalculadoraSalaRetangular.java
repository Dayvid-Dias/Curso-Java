package AulaModulo2.AulaQuatroEx;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getLargura(){
        return this.largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = altura * largura;
        System.out.printf("\nA área da sala retangular com altura de %.1f e largura de %.1f é de: %.1f\n", getAltura(),getLargura(), area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (altura + largura);
        System.out.printf("\nO perímetro da sala retangular é de %.1f\n", perimetro);
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular(7, 8);
        calculadora.setAltura(4);
        calculadora.setLargura(7);

        calculadora.calcularArea();
        calculadora.calcularPerimetro();
    }

}
