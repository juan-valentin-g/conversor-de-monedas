package com.alura.conversor.peticion;

import com.alura.conversor.modelos.ModalConversor;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticion {
    private double cantidad;
    private String base;
    private String result;
    public ModalConversor moneda;

    public void setResult(String result) {
        this.result = result;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    public void peticion () throws IOException, InterruptedException {
        String URL = "https://v6.exchangerate-api.com/v6/3077273c51a7d457add58982/pair/" + base + "/"+ result + "/" + cantidad;

        try {
            HttpClient client =HttpClient.newHttpClient();
            HttpRequest request =HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json =response.body();

            moneda = gson.fromJson(json, ModalConversor.class);


        }catch (IllegalArgumentException e){
            System.out.println("Error en la URL, verifiquela.");
        }
    }

}
