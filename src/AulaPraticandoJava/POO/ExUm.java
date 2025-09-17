package AulaPraticandoJava.POO;
/*
* Descrição
* Imagine que você é responsável pelo controle de estoque de uma loja de informática
* que está expandindo seus negócios. Com o aumento da demanda, é importante manter um
* registro organizado e preciso de todos os produtos disponíveis. Sua tarefa é criar um
* sistema que armazene as informações de cada item e gere um relatório para facilitar a gestão do estoque.

Sua tarefa é criar uma classe que:

Represente um produto com os atributos nome, preço e quantidade.
Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
* */
public class ExUm {
    String nome;
    double preco;
    int quantidade;

    public void ExibirInfoProduto() {
        System.out.printf("""
                Nome: %s
                Preço: R$ %.2f
                Quantidade em estoque: %d
                """, nome, preco, quantidade);
    }

    public ExUm(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        var produto = new ExUm("Grampeador", 7.50, 4);

        produto.ExibirInfoProduto();
    }
}
