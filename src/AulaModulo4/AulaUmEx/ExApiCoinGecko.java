package AulaModulo4.AulaUmEx;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static java.net.http.HttpResponse.BodyHandlers.*;

public class ExApiCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual moeda para cotação? " );
        String cripto = sc.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?ids=" + cripto + "&vs_currencies=usd"))
                .build();
        HttpResponse<String> response = client
                .send(request, ofString());

        System.out.println(response.body());
    }
}
