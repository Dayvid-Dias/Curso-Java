package AulaModulo3.AulaTresEx;

public class Animal {
    private String nome;
    private String cor;

    public Animal(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Chuchu", "Marrom");

        System.out.printf("O nome do cachorro é %s e ele é da cor %s.", cachorro.getNome(), cachorro.getCor());
        cachorro.latir();
        Animal animal = cachorro;

        System.out.printf("O nome do cachorro é %s e ele é da cor %s.", animal.getNome(), animal.getCor());
        if (animal instanceof Cachorro dog){
            dog.latir();
        }

    }

}
