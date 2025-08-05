package AulaModulo2.AulaQuatroEx;

public class ProdutoFisico implements Calculavel{
    private double precoBase;
    private double taxa;

    public double getPrecoBase(){
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    public double getTaxa(){
        return taxa;
    }

    public void setTaxa(double taxa){
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        if (precoBase >= 100){
            double precoFinal = precoBase + (precoBase * taxa);
            System.out.printf("Preco com taxa de acréscimo, valor total R$ %.2f", precoFinal);
            return precoBase = precoFinal;
        }else{
            System.out.printf("Preço sem taxa de acréscimo, valor total R$ %.2f", precoBase);
            return precoBase;
        }
    }

    public static void main(String[] args) {
        ProdutoFisico produto = new ProdutoFisico();

        produto.setPrecoBase(150);
        produto.setTaxa(0.15);
        produto.calcularPrecoFinal();

    }

}
