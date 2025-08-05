package AulaModulo2.AulaTresEx;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal(){
        this.saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$ " + getTarifaMensal() + ". Saldo atual de R$ " + this.saldo);
    }

}
