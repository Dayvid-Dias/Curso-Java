package AulaModulo1.AulaTresEx;

import java.util.Random;
import java.util.Scanner;

public class AulaTresExUm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroSorteado = 0;

        for (int tentativas = 1; tentativas <= 5; tentativas++) {
            System.out.println("Tentativa " + tentativas);
            System.out.println("Digite um número da sorte: ");
            numeroSorteado = sc.nextInt();

            if (numeroSorteado == numeroAleatorio) {
                System.out.println("Parabens, você acertou. O número sorteado é: " + numeroAleatorio);
                break;
            }else if(numeroAleatorio > numeroSorteado){
                System.out.println("O número da sorte é maior\n" );
            }else{
                System.out.println("O número sorteado é menor\n");
            }

        }
        if (numeroSorteado != numeroAleatorio){
            System.out.println("Infelizmente você não acertou, o número sorteado era " + numeroAleatorio);
        }

    }

}



/*

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
             System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}

 */
