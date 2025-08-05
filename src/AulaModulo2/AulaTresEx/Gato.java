package AulaModulo2.AulaTresEx;

public class Gato extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("Miaaaaaaaaaaaaaaaaaaaaaaau");
    }

    public void arranharMoveis(){
        System.out.printf("Para de arranhar os móveis %s!\n", this.getNome());
    }

}
