package AulaModulo2.AulaTresEx;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void deposita(double valor){
        if (valor <= 0){
            System.out.println("Valor de depósito inválido!\n");
        }else {
            System.out.printf("\nValor a ser depositado: %.2f\n", valor);
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!\n");
        } else if (valor == 0) {
            System.out.println("Número inválido!\n");
        }else {
            System.out.printf("\nSaldo a ser sacado: %.2f\n", valor);
            saldo -= valor;
        }
    }

    public void consultarSaldo(){
        System.out.printf("\nSaldo atual: %.2f\n", getSaldo());
    }

    public static void main(String[] args) {
        ContaCorrente pessoa1 = new ContaCorrente();

        pessoa1.setSaldo(1450);
        pessoa1.setTarifaMensal(50);

        pessoa1.deposita(750);
        pessoa1.consultarSaldo();
        pessoa1.sacar(100);
        pessoa1.consultarSaldo();
        pessoa1.cobrarTarifaMensal();
    }


}
