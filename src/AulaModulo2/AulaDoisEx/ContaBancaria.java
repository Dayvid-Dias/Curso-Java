package AulaModulo2.AulaDoisEx;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo inválido. não é permitido valor negativo");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta > 0){
            this.numeroConta = numeroConta;
        }else{
            System.out.println("Número da conta inválido");
        }
    }

    public void exibirFicha(){
        System.out.printf("""
                Nome do titular da conta: %s
                Número da conta: %d
                Saldo da conta: %.2f
                """, titular, numeroConta, saldo);
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "Dayvid";
        contaBancaria.setNumeroConta(7);
        contaBancaria.setSaldo(1547.47);

        contaBancaria.exibirFicha();
        System.out.printf("Saldo do elemento: %s\n", contaBancaria.getSaldo());
        System.out.printf("Número da conta do elemento: %d", contaBancaria.getNumeroConta());

    }

}
