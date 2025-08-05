package AulaModulo1.AulaQuatroEx;

import java.util.Scanner;

public class DesafioMenuJavaAlura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:\n");
        String nome = sc.nextLine();

        System.out.println("Qual o tipo da sua conta?\n");
        String tipoConta = sc.nextLine();

        System.out.println("Qual o saldo atual?\n");
        double saldo = sc.nextDouble();
        sc.nextLine();

        while (true) {

            String menu = String.format("""
                ******************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f
                ******************************
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """, nome, tipoConta, saldo);

            System.out.println(menu);
            String opcao = sc.nextLine();

            switch (opcao.toLowerCase()){
                case "1":
                case"consultar saldo":
                System.out.printf("Seu saldo é de R$ %.2f\n", saldo);
                break;

                case "2":
                case "receber valor":
                    System.out.println("Informe o valor a receber:");
                    double valorRecebido = sc.nextDouble();
                    sc.nextLine();
                    saldo += valorRecebido;
                    System.out.printf("Saldo atualizado R$ %.2f\n", saldo);
                    break;

                case "3":
                case "transferir valor":
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferir = sc.nextDouble();
                    sc.nextLine();
                    if (valorTransferir > saldo){
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        System.out.printf("Digite um valor menor ou igual a R$ %.2f", saldo);
                    }
                    saldo -= valorTransferir;
                    System.out.printf("Saldo atualizado R$ %.2f\n", saldo);
                    break;

                case "4":
                case "sair":
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida\n");
                    break;
            }
            if (opcao.equalsIgnoreCase("4") || opcao.equalsIgnoreCase("sair")) {
                break;
            }
        }

    }

}
