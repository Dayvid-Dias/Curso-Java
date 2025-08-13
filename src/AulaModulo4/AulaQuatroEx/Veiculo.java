package AulaModulo4.AulaQuatroEx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    private String marca;
    private String cor;
    private String modelo;

    public Veiculo(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Mclaren", "laranja", "P1");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(carro1);

        System.out.println("Objeto serializado:");
        System.out.println(json);
    }
}
