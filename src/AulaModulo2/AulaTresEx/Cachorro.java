package AulaModulo2.AulaTresEx;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }

    public void abanarRabo(){
        System.out.printf("O %s sabe abanar o rabo!\n", getNome());
    }
}
