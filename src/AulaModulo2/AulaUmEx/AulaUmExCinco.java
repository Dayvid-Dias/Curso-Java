package AulaModulo2.AulaUmEx;

public class AulaUmExCinco {

    String nome;
    int idade;

    void exibirFicha(){
        System.out.printf("""
                Nome do aluno: %s
                Idade do aluno: %d
                """, nome, idade);
    }

    public static void main(String[] args) {

        AulaUmExCinco aluno = new AulaUmExCinco();

        aluno.nome = "Tonhão";
        aluno.idade = 15;

        aluno.exibirFicha();

    }

}
