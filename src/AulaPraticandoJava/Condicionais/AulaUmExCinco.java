package AulaPraticandoJava.Condicionais;

import java.util.Scanner;

public class AulaUmExCinco {

    public static void main(String[] args) {

        double valorDesconto = 0.10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100){
            double valorCompraDesconto = valorCompra - (valorCompra * valorDesconto);

            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: " + valorCompraDesconto);
        }else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total R$ " + valorCompra);
        }

    }

}
