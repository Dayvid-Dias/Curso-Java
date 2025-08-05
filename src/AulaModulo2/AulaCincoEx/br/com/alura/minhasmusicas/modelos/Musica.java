package AulaModulo2.AulaCincoEx.br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracaoEmMinutos, String artista, String album, String genero) {
        super(titulo, duracaoEmMinutos);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirInfoMusica(){
        System.out.printf("""
                \nTítulo: %s
                Nome do Artista: %s
                Nome do album: %s
                Duração da Música: %d minutos
                Gênero da música: %s\n
                """, getTitulo(), getArtista(), getAlbum(), getDuracaoEmMinutos(), getGenero());
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Tocando a música: " + getTitulo() + " do artista " + getArtista());
    }

    @Override
    public void curtir() {
        super.curtir(); // mantém o comportamento original (incrementar curtidas)
        System.out.println("Você curtiu a música: " + getTitulo());
    }

}
