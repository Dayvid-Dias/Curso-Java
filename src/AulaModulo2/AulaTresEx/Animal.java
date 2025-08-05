package AulaModulo2.AulaTresEx;

public class Animal {
    private String nome;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("Os animais fazem sons!");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Chuchu");
        cachorro.emitirSom();
        cachorro.abanarRabo();
        gato.setNome("Félix");
        gato.emitirSom();
        gato.arranharMoveis();
    }

}
