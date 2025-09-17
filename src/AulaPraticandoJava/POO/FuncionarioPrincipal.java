package AulaPraticandoJava.POO;

public class FuncionarioPrincipal {
    String nome;
    String cargo;
    double salario;

    public void exibirInfo(){
        System.out.printf("""
                Nome do funcionário: %s
                Cargo: %s
                Salário: %.2f
                """, nome, cargo, salario);
    }
    public void reajustarSalario(double percentual){
        salario += salario * (percentual /100);
        System.out.printf("Novo salário de %s é %.2f", nome, salario);
    }

    public static void main(String[] args) {
        FuncionarioPrincipal funcionarioPrincipal1 = new FuncionarioPrincipal();
        funcionarioPrincipal1.nome = "antonio";
        funcionarioPrincipal1.cargo = "analista";
        funcionarioPrincipal1.salario = 4600;

        FuncionarioPrincipal funcionarioPrincipal2 = new FuncionarioPrincipal();
        funcionarioPrincipal2.nome = "batista";
        funcionarioPrincipal2.cargo = "engenheiro";
        funcionarioPrincipal2.salario = 7800;

        funcionarioPrincipal1.exibirInfo();
        funcionarioPrincipal1.reajustarSalario(5);
        System.out.println();
        System.out.println();
        funcionarioPrincipal2.exibirInfo();
        funcionarioPrincipal2.reajustarSalario(5);
    }
}
