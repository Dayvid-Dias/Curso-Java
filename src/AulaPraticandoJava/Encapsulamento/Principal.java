package AulaPraticandoJava.Encapsulamento;

public class Principal {
    public static void main(String[] args) {
        var funcionario1 = new Funcionario("antonio", 4600);
        funcionario1.setCargo("analista");
        System.out.println("Funcionário tem o cargo: " + funcionario1.getCargo());
        System.out.println("Funcionário tem o nome: " + funcionario1.getNome());
        System.out.println("Funcionário tem o salário: " + funcionario1.getSalario());
        System.out.println("\n");
        funcionario1.reajustarSalario(5);
        funcionario1.reajustarSalario(7);
        funcionario1.exibirInfo();
    }
}
