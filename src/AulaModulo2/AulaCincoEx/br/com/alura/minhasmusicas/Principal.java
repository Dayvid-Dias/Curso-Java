package AulaModulo2.AulaCincoEx.br.com.alura.minhasmusicas;
import AulaModulo2.AulaCincoEx.br.com.alura.minhasmusicas.modelos.*;


public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica("Believer", 4, "Imagine Dragons", "Evolve", "Pop Rock");
        Podcast podcast = new Podcast("The Daily", 25, "Michael Barbaro", 101);

        musica.reproduzir();
        musica.exibirInfoMusica();
        musica.setClassificacao(5);
        musica.mostrarClassificacao();

        podcast.reproduzir();
        podcast.exibirInfoPodcast();
        podcast.setClassificacao(5);
        podcast.mostrarClassificacao();

    }

}
