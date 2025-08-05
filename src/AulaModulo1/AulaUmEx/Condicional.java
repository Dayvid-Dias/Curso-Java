package AulaModulo1.AulaUmEx;

public class Condicional {

    public static void main(String[] args) {

        /*int dia = 7;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.printf("O dia %d é %s%n", dia, nomeDia);
*/



    int anoDeLancamento = 2022;
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.1;
    String tipoPlano = "plus";

    if (anoDeLancamento >= 2022){
        System.out.println("Lançado depois da Pandemia");
    }else{
        System.out.println("lançado antes ou durante a Pandemia");
    }

    if(incluidoNoPlano && tipoPlano.equals("plus")){
        System.out.println("incluido no plano, e no plus");
    } else if (!incluidoNoPlano && tipoPlano.equals("normal")) {
        System.out.println("Tá duro dorme");
    }

    }

}


