package AulaPraticandoJava.POO;
/*
* Descrição
* Imagine que você faz parte de uma equipe de agricultura tecnológica responsável por monitorar estufas inteligentes.
* Cada setor possui sensores que coletam dados críticos para o crescimento das plantas. Seu desafio é desenvolver
* um sistema que não apenas registre a temperatura, mas também alerte quando as condições saírem do ideal,
* garantindo a saúde das culturas.

Crie uma classe que:
Possua os atributos local, indicando o setor monitorado, e temperatura atual, armazenando a última medição.
Implemente um método que mostre:
O local do sensor.
A temperatura formatada com uma casa decimal.
Um alerta se a temperatura ultrapassar 37.5ºC.
* */
public class ExQuatro {
    String local;
    double temperaturaAtual;

    void exibirInfo(){
        System.out.printf("""
                Sensor no local: %s
                Temperatura: %.1f ºC%n
                """, local, temperaturaAtual);
        if (temperaturaAtual > 37.5){
            System.out.println("Alerta: temperatura acima do limite!");
        }
    }

    public ExQuatro(String local, double temperaturaAtual) {
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
    }

    public static void main(String[] args) {
        ExQuatro local = new ExQuatro("Setor A", 39.6);
        local.exibirInfo();
    }
}
