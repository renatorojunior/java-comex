package br.com.alura.comex;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApiExterna {
    public static void main(String[] args) {
        String uri = "https://fakestoreapi.com/products/1";

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Resposta da API:");
            System.out.println(response.body());

            int statusCode = response.statusCode();
            System.out.println("Código de Status: " + statusCode);
        } catch (Exception e) {
            System.err.println("Erro ao realizar a consulta: " + e.getMessage());
        }
    }
}