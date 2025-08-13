package AulaModulo4.AulaQuatroEx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    private String nome;
    private String autor;
    private String editora;

    public Titulo(String nome, String autor, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    public static void main(String[] args) {
        Titulo livro1 = new Titulo("Clean Code", "Robert Cecil Martin", "Prentice Hall PTR");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String objeto = gson.toJson(livro1);

        System.out.println(objeto);

    }
}
