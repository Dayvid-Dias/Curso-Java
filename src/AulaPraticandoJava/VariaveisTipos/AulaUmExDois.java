package AulaPraticandoJava.VariaveisTipos;

import java.util.Scanner;

public class AulaUmExDois {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco <= 50){
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 200) {
            System.out.println("Categoria do produto: Premium");
        }else {
            System.out.println("Categoria do produto: Intermediário");
        }

    }

}
