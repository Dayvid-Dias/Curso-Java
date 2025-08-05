package AulaModulo2.AulaQuatroEx;

public class Produto implements Vendaval {
    private double precoUnitario;
    private int quantidade;
    private double precoFinal;

    public Produto(double precoUnitario, int quantidade) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        precoFinal = precoUnitario * quantidade;
        return precoFinal;
    }

    @Override
    public double aplicarDesconto(double desconto) {
        if (quantidade >= 5) { // Desconto só se comprar 5 ou mais unidades
            precoFinal -= precoFinal * desconto;
        }
        return precoFinal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }
}
