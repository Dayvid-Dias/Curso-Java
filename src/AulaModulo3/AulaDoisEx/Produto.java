package AulaModulo3.AulaDoisEx;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome(){
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", preço = " + preco + ", quantidade = " + quantidade + "]";
    }

    public static void main(String[] args) {
        var produto1 = new Produto("Coca-Cola", 2.50, 1);
        var produto2 = new Produto("Ruffles", 6.99, 1);
        var produto3 = new Produto("Kit-Kat", 4.50, 2);

        var listaDeProdutos = new ArrayList<Produto>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Nome do produto: " + listaDeProdutos.get(1).getNome());
        System.out.println("Preço do Produto: " + listaDeProdutos.get(1).getPreco());

        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }

        var produtoPerecivel = new ProdutoPerecivel("chuchu", 2.5, 2, "01/08/2025");

        System.out.println(produtoPerecivel);

    }



}
