package AulaModulo2.AulaDoisEx;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4= nota4;
    }

    public Aluno(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
        }
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        if (nota4 >= 0 && nota4 <= 10) {
            this.nota4 = nota4;
        } else {
            System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
        }
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Dayvid", 10, 7,8, 6);

        System.out.printf("""
                Nome do aluno: %s
                Nota do primeiro bimestre: %.1f
                Nota do segundo bimestre: %.1f
                Nota do terceiro bimestre: %.1f
                Nota do quarto bimestre: %.1f
                Média final do aluno: %.1f
                """, aluno.getNome(), aluno.getNota1(), aluno.getNota2(), aluno.getNota3(), aluno.getNota4(), aluno.calcularMedia());

    }

}
