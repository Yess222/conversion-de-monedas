import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarConversion {

    private String APIKEY = System.getenv("api_key");

    public Conversor consultarConversion(String primeraMondena, String segundaMoneda){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+ APIKEY +"/pair/" + primeraMondena + "/" + segundaMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (IOException  | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
