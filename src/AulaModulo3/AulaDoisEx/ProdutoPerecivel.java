package AulaModulo3.AulaDoisEx;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto [nome = " + this.getNome() + ", preço = " + this.getPreco() + ", quantidade = " + this.getQuantidade() + " Data de validade: " + this.dataValidade + "]";
    }
}
