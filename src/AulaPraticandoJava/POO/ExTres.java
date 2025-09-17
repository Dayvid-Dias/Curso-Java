package AulaPraticandoJava.POO;
/*
*Descrição
*Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras.
* Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.

Crie um programa que:

Defina uma classe com o atributo saldo.
Implemente um método que redefine o valor do saldo para 0.0.
Implemente um método que mostra o saldo atual formatado.
*/
public class ExTres {
    double saldo;

    public void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
    public void zerarSaldo(){
        saldo = 0;
    }
    public ExTres (double saldo){
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        ExTres saldo = new ExTres(250);

        saldo.exibirSaldo();
        saldo.zerarSaldo();
        saldo.exibirSaldo();
    }
}
