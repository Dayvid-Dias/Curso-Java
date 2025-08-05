package AulaModulo3.AulaTresEx;

import java.util.ArrayList;

public class ExArrayLista1 {
    public static void main(String[] args) {
        ArrayList<String> listaDeElementos = new ArrayList<>();
        listaDeElementos.add("pessoa1");
        listaDeElementos.add("pessoa2");
        listaDeElementos.add("pessoa3");

        for (String lista : listaDeElementos){
            System.out.println(lista);
        }

    }

}
