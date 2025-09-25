package AulaPraticandoJava.POO;
/*
* Descrição:
* Imagine que você está desenvolvendo um sistema acadêmico simplificado para auxiliar professores
* no acompanhamento de alunos. Seu desafio é criar uma solução que automatize o cálculo de médias
* e forneça rapidamente o resultado, eliminando a necessidade de cálculos manuais e reduzindo erros.

Crie uma classe que:

Represente os alunos com os atributos nome, nota 1´ e nota 2`.

*Implemente um método que:
Calcule a média das notas.
Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
Indique se o aluno foi aprovado (média >= 7) ou reprovado.
* */
public class ExCinco {
    String nome;
    double nota1;
    double nota2;

    public ExCinco(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void exibirMedia(){
        double media = (nota1 + nota2) / 2;
        System.out.printf("""
                Nome: %s
                Nota 1: %.1f
                Nota 2: %.1f
                Média: %.1f
                """, nome, nota1, nota2, media);
        if (media >= 7){
            System.out.println("Situação: Aprovado");
        }else {
            System.out.println("Situação: Reprovado");
        }
    }

    public static void main(String[] args) {
        var aluno1 = new ExCinco("white", 7.5, 8.4);

        aluno1.exibirMedia();
    }
}
