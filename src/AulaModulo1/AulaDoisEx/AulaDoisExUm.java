package AulaModulo1.AulaDoisEx;

public class AulaDoisExUm {
//programa para calcular o valor de duas notas com casas decimais.
    public static void main(String[] args) {

        double nota1 = 8.4;
        double nota2 = 7.5;

        double media = (nota1 + nota2) / 2;
        System.out.printf("""
                Nota do primeiro semestre: %.1f
                Nota do segunto semestre: %.1f
                Média do ano letivo: %.1f
                """, nota1, nota2, media);

    }

}
