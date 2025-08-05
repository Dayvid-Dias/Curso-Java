package AulaModulo2.AulaTresEx;

public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo(){
        System.out.printf("""
                Modelo: %s
                
                Preço Ano 1: %.2f
                Preço Ano 2: %.2f
                Preço Ano 3: %.2f
                
                Menor Preço: R$ %.2f
                Maior Preço: R$ %.2f
                """, modelo, precoAno1, precoAno2, precoAno3, calcularMenorPreco(), calcularMaiorPreco());
    }

    private double calcularMenorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double calcularMaiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public static void main(String[] args) {
        ModeloCarro nissanGTR = new ModeloCarro();
        nissanGTR.definirPrecos(38000, 48000, 60000);
        nissanGTR.setModelo("Nissan-GTR");
        nissanGTR.setCategoria("Esportivo");
        nissanGTR.setMotor("2JZ");

        nissanGTR.exibirInfo();
        nissanGTR.buzina();
        nissanGTR.cavaloDePau();
        nissanGTR.fazerDrift();

    }

}
