package com.alura.conversor.Principal;
import com.alura.conversor.modelos.ModalConversor;
import com.alura.conversor.peticion.Peticion;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner =new Scanner(System.in);
        Peticion peticion1 = new Peticion();

        String menu = """
                ################################################### CONVERSOR DE MONEDAS #########################################################
                
                OPCIONES:
                
                1.- Euro(EUR) a Franco(CHF)
                2.- Dolar(USD) a Euro(EUR)
                3.- Dolar(USD) a Franco(CHF)
                4.- Dolar(USD) a Peso Mexicano(MXN)
                5.- Dolar(USD) a Rupia(LKR)
                6.- Peso Mexicano(MXN) a Yen(JPY)
                7.- Euro(EUR) a Real(BRL)
                8.- Euro(EUR) a Marco Aleman(DEM)
                9.- Euro(EUR) a Peso Mexicano(MXN)
                10.- Salir
                
                Dame una Opcion Valida:
                """;

        double cantidad;
        boolean loop = true;

        while(loop) {

            System.out.println(menu);
            var opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextDouble();
                    peticion1.setBase("EUR");
                    peticion1.setResult("CHF");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 2:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("USD");
                    peticion1.setResult("EUR");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 3:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("USD");
                    peticion1.setResult("CHF");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 4:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("USD");
                    peticion1.setResult("MXN");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 5:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("USD");
                    peticion1.setResult("LKR");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 6:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("MXN");
                    peticion1.setResult("JPY");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 7:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("EUR");
                    peticion1.setResult("BRL");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 8:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("EUR");
                    peticion1.setResult("DEM");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 9:
                    System.out.println("Dame la cantidad a convertir: ");
                    cantidad = scanner.nextInt();
                    peticion1.setBase("EUR");
                    peticion1.setResult("MXN");
                    peticion1.setCantidad(cantidad);
                    peticion1.peticion();
                    System.out.println("Cantidad de "+ peticion1.moneda.base_code() + ": " + cantidad);
                    System.out.println("Conversion a " + peticion1.moneda.target_code() + ": " + peticion1.moneda.conversion_result());
                    break;

                case 10:
                    loop = false;
                    break;

                default:
                    System.out.println("Seleccione una opcion valida");
                    break;
            }
        }




    }
}
