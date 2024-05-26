import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private String base_code;
    private String target_code;

    public Conversor() {
        // Construtor vazio
    }

    //requisição
    public String converter(String base_code, String target_code, double amount) throws IOException, InterruptedException {
        this.base_code = base_code;
        this.target_code = target_code;

        String APIkey = "7d1820c6dab28a011d97a490";
        String endereco = "https://v6.exchangerate-api.com/v6/" + APIkey + "/pair/" + this.base_code + "/" + this.target_code + "/" + amount;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Moeda moeda = gson.fromJson(json, Moeda.class);
        salvarResultadoComoJson(moeda);

        //resultado da conversão
        return String.format(
                "Conversão da Moeda:\n\n" +
                        "Quantidade digitada: %.2f\n" +
                        "De %s\n" +
                        "Para %s\n" +
                        "Valor convertido: %s",
                amount, base_code, target_code, moeda.getConversion_result());
    }

    private void salvarResultadoComoJson(Moeda moeda) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("resultadoConversao.json")) {
            gson.toJson(moeda, writer);
            System.out.println("Arquivo JSON salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo JSON: " + e.getMessage());
        }
    }

    }

