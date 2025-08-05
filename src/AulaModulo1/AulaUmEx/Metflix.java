package AulaModulo1.AulaUmEx;

public class Metflix {

    public static void main(String[] args) {

        System.out.println("Esse é o AulaModulo1.AulaUmEx.Metflix");
        System.out.println("Filme: Como treinar o seu Dragão");

        int ano = 2015;

        System.out.println("Data de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.8;

        double media = (9.0 + 8.4 + 7)/3;
        System.out.println(media);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

        int a = 10;
        double b = a; // casting implícito

        double x = 10.5;
        int y = (int) x; // casting explícito

        /*
        String sinopse = """
                Como treinar o seu dragão!
                Filme sobre treino e dragões (acho que é algo sobre academia)
                ano de lançamento:
                """ + ano;
        System.out.println(sinopse);
*/

       /* String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }


        String nomezinho = "Lobitos";
        int idade = 35;
        double valor = 4.500;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.3f reais", nomezinho, idade, valor));


        String nome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);

*/


    }

}
