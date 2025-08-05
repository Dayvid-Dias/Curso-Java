package AulaModulo2.AulaQuatroEx;

public class TabuadaMultiplicacao  implements Tabuada{
    private int numero;

    public TabuadaMultiplicacao(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        System.out.printf("\nTabuada do número %d:\n", this.numero);
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("\n%d X %d = %d", this.numero, i, this.numero * i);
        }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(8);

        tabuada.mostrarTabuada();
    }
}
