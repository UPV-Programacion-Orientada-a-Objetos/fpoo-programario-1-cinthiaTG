package edu.upvictoria.fpoo.Problema21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintiuno {
    public ProblemaVeintiuno() throws IOException{
        /**
         * La CONAGUA requiere determinar el pago que debe realizar una persona por el total de
         * metros cúbicos que consume de agua
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double pago, metros_cub_consummidos, precio_metro_cub;
        System.out.println("Cual es el precio por metro cubico del agua?: ");
        entrada = bufer.readLine();
        precio_metro_cub= Double.parseDouble(entrada);
        System.out.println("Que cantidad de de metros cubicos de agua consumio? : ");
        entrada = bufer.readLine();
        metros_cub_consummidos = Double.parseDouble(entrada);

        pago= precio_metro_cub * metros_cub_consummidos;
        System.out.println("El pago sera de: "+ pago);
    }
}
