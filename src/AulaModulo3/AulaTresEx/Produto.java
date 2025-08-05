package AulaModulo3.AulaTresEx;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        double precoTotal = 0;
        double precoMedio;

        produto1.setNome("Coquinha");
        produto1.setPreco(2.50);
        produto2.setNome("Batatinha");
        produto2.setPreco(5.50);
        produto3.setNome("Chocolate");
        produto3.setPreco(4.50);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        for (Produto p : listaProdutos){
            System.out.printf("""
                    Nome do Produto: %s
                    Preço do Produto: %.2f%n
                    """, p.getNome(), p.getPreco());
            precoTotal += p.getPreco();
        }
        precoMedio = precoTotal / listaProdutos.size();

        System.out.printf("O preço médio dos produtos é de: R$ %.2f", precoMedio);
    }


}
