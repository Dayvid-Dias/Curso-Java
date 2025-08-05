package AulaModulo3.AulaUmEx;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa("Dayvid", 21);
        var pessoa2 = new Pessoa("Veronica", 20);
        var pessoa3 = new Pessoa("Davi", 1);
        
        //ArrayList<Filme> listaDeFilme = new ArrayList<>();
        var listaDePessoa = new ArrayList<Pessoa>();
        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);

        System.out.println("Tamanha da lista: " + listaDePessoa.size());

        System.out.println("Primeiro pessoa da lista: " + listaDePessoa.getFirst().getNome());
        System.out.println(listaDePessoa);

    }

}
