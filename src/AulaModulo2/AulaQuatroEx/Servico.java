package AulaModulo2.AulaQuatroEx;

public class Servico implements Vendaval {
    private double precoUnitario;
    private int quantidade;
    private double precoFinal;

    public Servico(double precoUnitario, int quantidade) {
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
        if (quantidade >= 10) { // Desconto só se contratar 10 ou mais serviços
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

    public static void main(String[] args) {
        // --- Produto ---
        Produto produto = new Produto(50, 6); // Preço unitário 50, quantidade 6
        System.out.println("Produto criado: preço unitário = R$ 50, quantidade = " + produto.getQuantidade());

        double totalProduto = produto.calcularPrecoTotal(produto.getQuantidade());
        System.out.println("Total do produto sem desconto: R$ " + totalProduto);

        double finalProduto = produto.aplicarDesconto(0.10); // 10% de desconto
        System.out.println("Total do produto com desconto: R$ " + finalProduto);

        System.out.println("----------------------------------");

        // --- Serviço ---
        Servico servico = new Servico(100, 12); // Preço unitário 100, quantidade 12
        System.out.println("Serviço criado: preço unitário = R$ 100, quantidade = " + servico.getQuantidade());

        double totalServico = servico.calcularPrecoTotal(servico.getQuantidade());
        System.out.println("Total do serviço sem desconto: R$ " + totalServico);

        double finalServico = servico.aplicarDesconto(0.15); // 15% de desconto
        System.out.println("Total do serviço com desconto: R$ " + finalServico);
    }

}