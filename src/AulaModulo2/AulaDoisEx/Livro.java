package AulaModulo2.AulaDoisEx;

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor( String autor){
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.printf("""
                Título: %s
                Nome do autor: %s
                """, titulo, autor);
    }

    public static void main(String[] args) {
        Livro meuLivro = new Livro();

        meuLivro.setTitulo("As 48 Leis do Poder");
        meuLivro.setAutor("Robert Greene");

        meuLivro.exibirDetalhes();
    }

}
