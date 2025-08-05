package AulaModulo2.AulaQuatroEx;

public class Livro implements Calculavel{
    private double precoBase;
    private double desconto;

    public double getPrecoBase(){
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    public double getDesconto(){
        return this.desconto;
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        if (getPrecoBase() >= 100){
            double precoDesconto = precoBase - (precoBase * desconto);
            System.out.printf("Preco com desconto de R$ %.2f", precoDesconto);
            return precoDesconto;
        }else{
            System.out.printf("não houve alteração de preço, total do pedido: R$ %.2f", precoBase);
            return precoBase;
        }
    }

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setPrecoBase(250);
        livro.setDesconto(0.1);
        livro.calcularPrecoFinal();


    }

}
