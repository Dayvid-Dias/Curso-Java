package AulaPraticandoJava.POO;
/*
* Descrição
* Imagine que você está criando um sistema de catalogação para uma biblioteca.
* Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias
* e as exiba em um formato padronizado, facilitando a consulta por outros leitores.

Crie um programa que:

Defina uma classe com os atributos título, autor e páginas.
Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
* */
public class ExDois {
    String titulo;
    String autor;
    int paginas;

    public void exibirLivro(){
        System.out.printf("%s de %s com %d páginas.", titulo, autor, paginas);
    }
    public ExDois(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public static void main(String[] args) {
        ExDois livro = new ExDois("O Guia do Mochileiro das Gálaxias", "Douglas Adams", 208);
        livro.exibirLivro();
    }
}
