package AulaModulo2.AulaCincoEx.br.com.alura.minhasmusicas.modelos;

public class Audio {

    private int duracaoEmMinutos;
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio(String titulo, int duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = Math.min(Math.max(classificacao, 1), 5);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void reproduzir(){
        totalReproducoes++;
    }

    public void curtir(){
        totalCurtidas++;
    }

    public void mostrarClassificacao() {
        switch (classificacao) {
            case 1:
                System.out.println("Classificação: 1 estrela - Muito ruim");
                break;
            case 2:
                System.out.println("Classificação: 2 estrelas - Ruim");
                break;
            case 3:
                System.out.println("Classificação: 3 estrelas - Regular");
                break;
            case 4:
                System.out.println("Classificação: 4 estrelas - Bom");
                break;
            case 5:
                System.out.println("Classificação: 5 estrelas - Excelente");
                break;
            default:
                System.out.println("Sem classificação");
        }
        System.out.println();
    }

}
