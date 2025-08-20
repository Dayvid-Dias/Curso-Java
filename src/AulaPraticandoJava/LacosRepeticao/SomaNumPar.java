package AulaPraticandoJava.LacosRepeticao;

public class SomaNumPar {
    public static void main(String[] args) {
        int num = 100;
        int soma = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
