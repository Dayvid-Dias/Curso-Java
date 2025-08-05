package AulaModulo2.AulaDoisEx;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        if (idade > 0){
            this.idade = idade;
        }else{
            System.out.println("A idade é inválida");
        }
    }

    public void setNome(String nome){
        if (nome.isBlank()){
            System.out.println("Nome não foi digitado corretamente.");
        }else {
            this.nome = nome;
        }
    }

    public void verificarIdade(){
        if (idade >= 18){
            System.out.println();
            System.out.println(nome + " é maior de idade.");
        }else {
            System.out.println(nome + " é menor de idade.");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("tonhão");
        pessoa.setIdade(100);

        pessoa.verificarIdade();
        System.out.println("Nome do elemento: " + pessoa.getNome());
        System.out.println("Idade do elemento: " + pessoa.getIdade());

    }

}
