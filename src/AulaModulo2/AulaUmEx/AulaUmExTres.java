package AulaModulo2.AulaUmEx;

public class AulaUmExTres {

    String titulo;
    String artista;
    int anoDeLancamento;
    int numAvaliacoes;
    double mediaAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double avaliacao){
        mediaAvaliacoes += avaliacao;
        numAvaliacoes++;
    }

    double Media(){
        return mediaAvaliacoes / numAvaliacoes;
    }

    public static void main(String[] args) {

        AulaUmExTres musica1 = new AulaUmExTres();

        musica1.titulo = "In the end";
        musica1.artista = "Linkin Park";
        musica1.anoDeLancamento = 2011;

        musica1.exibeFichaTecnica();
        musica1.avalia(9);
        musica1.avalia(1);
        musica1.avalia(8);

        System.out.println("A média é: " + musica1.Media());
        System.out.println("O total de avaliações é de: " + musica1.numAvaliacoes);
    }

}
