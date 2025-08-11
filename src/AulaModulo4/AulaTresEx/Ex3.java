package AulaModulo4.AulaTresEx;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do perfil:");
            String user = sc.nextLine();

            String endereco = "https://api.github.com/users/" + user;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado!");
            }

            System.out.println(response.body());

        } catch (ErroConsultaGitHubException e) {
            System.out.println("⚠ Erro: " + e.getMessage());
        }catch (IOException | InterruptedException e) {
            System.out.println("⚠ Ocorreu um erro ao consultar a API: " + e.getMessage());
            //e.printStackTrace();
        }

    }

}
