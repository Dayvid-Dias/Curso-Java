package AulaModulo2.AulaCincoEx.br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private int numeroEpisodio;

    public String getApresentador(){
        return apresentador;
    }

    public void setApresentador(String apresentador){
        this.apresentador = apresentador;
    }

    public int getNumeroEpisodio(){
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio){
        this.numeroEpisodio = numeroEpisodio;
    }

    public Podcast(String titulo, int duracaoEmMinutos, String apresentador, int numeroEpisodio) {
        super(titulo, duracaoEmMinutos);
        this.apresentador = apresentador;
        this.numeroEpisodio = numeroEpisodio;
    }

    public void exibirInfoPodcast(){
        System.out.printf("""
                \nTítulo: %s
                Nome do Apresentador: %s
                Número do episódio: %d
                Duração do episódio: %d minutos\n
                """,getTitulo(), getApresentador(), getNumeroEpisodio(), getDuracaoEmMinutos());
    }

    @Override
    public void reproduzir() {
        super.reproduzir();// mantém o comportamento original (incrementar curtidas)
        System.out.println("Reproduzindo episódio " + getNumeroEpisodio() + " do podcast: " + getTitulo());
    }

    @Override
    public void curtir() {
        super.curtir();
        System.out.println("Você curtiu o episódio " + getNumeroEpisodio() + " do podcast: " + getTitulo());
    }


}
