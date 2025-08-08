package AulaModulo4.AulaDoisEx;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverteJson {

    public static void main(String[] args) {
/*        String json = """
{
  "nome": "Maria",
  "idade": 25,
  "cidade": "São Paulo"
}
""";*/

        String json = """
{
  "nome": "Maria",
  "idade": 25,
  "Profissão": "TI"
}
""";

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);

    }

}
