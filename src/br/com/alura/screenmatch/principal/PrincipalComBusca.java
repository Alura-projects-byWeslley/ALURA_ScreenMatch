package br.com.alura.screenmatch.principal;

import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.modelo.Titulo;
import br.com.alura.screenmatch.modelo.TituloOMDB;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = scan.nextLine();

        String url = "https://www.omdbapi.com/?t=" + busca + "&apikey=4ef38559";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(url))
         .build();
        
        HttpResponse<String> response = client
         .send(request, HttpResponse.BodyHandlers.ofString());
         String json = response.body();
         System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        
        TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
        System.out.println(meuTituloOMDB);
        Titulo meuTitulo = new Titulo(meuTituloOMDB);
        System.out.println("Titulo já convertido");
        System.out.println(meuTitulo);
    }
}
