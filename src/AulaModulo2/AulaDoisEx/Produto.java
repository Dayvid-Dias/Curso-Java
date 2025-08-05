package AulaModulo2.AulaDoisEx;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirFicha(){
        System.out.printf("\nNome do Produto: %s", nome);
        System.out.printf("\nPreço do Produto: R$ %.2f", preco);

    }

    public void aplicarDesconto(double percentual){
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("KitKat");
        meuProduto.setPreco(100);

        meuProduto.exibirFicha();
        meuProduto.aplicarDesconto(10);
        System.out.printf("\nPreço com desconto: R$ %.2f", meuProduto.getPreco());

    }


}
