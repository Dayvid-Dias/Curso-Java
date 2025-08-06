package AulaModulo3.AulaQuatroEx;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable <Titulo>{
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    /*@Override
    public String toString() {
        return "Nome do filme: " + this.nome;
    }*/

    public static void main(String[] args) {
       /* var filme1 = new Titulo("Zootopia");
        var filme2 = new Titulo("Rei Arthur");
        var filme3 = new Titulo("Hitman");
        var filme4 = new Titulo("Avatar");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(filme1);
        listaDeTitulos.add(filme2);
        listaDeTitulos.add(filme3);
        listaDeTitulos.add(filme4);
        System.out.println(listaDeTitulos);

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);*/

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("Duna"));
        listaTitulos.add(new Titulo("Avatar"));
        listaTitulos.add(new Titulo("Breaking Bad"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);
        }

    }

}
