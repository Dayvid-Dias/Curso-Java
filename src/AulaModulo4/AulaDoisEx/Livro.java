package AulaModulo4.AulaDoisEx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public record Livro(String titulo, String autor, Editora editora) {

    public static void main(String[] args) {
        String json = """
                {
                  "titulo": "Clean Code",
                  "autor": "Robert C. Martin",
                  "editora": {
                    "nomeEditora": "Prentice Hall",
                    "cidade": "Upper Saddle River"
                  }
                }
                """;

        Gson gson = new GsonBuilder().create();
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);

    }
}
