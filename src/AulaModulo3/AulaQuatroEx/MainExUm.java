package AulaModulo3.AulaQuatroEx;

import java.util.ArrayList;
import java.util.Collections;

public class MainExUm {

    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(3);
        listaDeNumeros.add(5);
        listaDeNumeros.add(8);
        listaDeNumeros.add(6);
        listaDeNumeros.add(1);
        System.out.println("Lista não ordenada:\n");
        System.out.println(listaDeNumeros);

        System.out.println("\nLista ordenada:\n");
        Collections.sort(listaDeNumeros);
        System.out.println(listaDeNumeros);


    }

}
