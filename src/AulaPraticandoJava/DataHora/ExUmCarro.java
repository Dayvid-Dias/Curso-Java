package AulaPraticandoJava.DataHora;

public class ExUmCarro {
    private String nome;
    private String placa;
    private int ano;

    public ExUmCarro(String nome, String placa, int ano) {
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }


    public String getPlaca() {
        return placa;
    }


    public int getAno() {
        return ano;
    }

    public void exibirInfo(){
        System.out.printf("""
                Veículo cadastrado:
                Modelo: %s
                Placa: %s
                Ano: %d
                """, getNome(), getPlaca(), getAno());
    }

    public static void main(String[] args) {
        ExUmCarro carro = new ExUmCarro("Astra", "ABC-1234", 2005);
        carro.exibirInfo();
    }
}
