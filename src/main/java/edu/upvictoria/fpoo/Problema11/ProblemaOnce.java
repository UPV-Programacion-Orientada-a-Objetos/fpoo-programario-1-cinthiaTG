package edu.upvictoria.fpoo.Problema11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOnce {
    /**
     * La conagua requiere determinar el pago que debe realizar una persona por el total de
     * metros cúbicos que consume de agua al llenar una alberca (figura: prisma rectangular).
     * */
    public ProblemaOnce() throws IOException{
        BufferedReader baner =new BufferedReader(new InputStreamReader(System.in));
        String entrada; double longitud, ancho, altura, volumen, pago, precio_p_metro_cub;
        System.out.println("Dime la longitud de la alberca en metros: ");
        entrada= baner.readLine();
        longitud=Double.parseDouble(entrada);
        System.out.println("Dime el ancho de la alberca en metros: ");
        entrada= baner.readLine();
        ancho= Double.parseDouble(entrada);
        System.out.println("Dime la altura de la alberca en metros: ");
        entrada= baner.readLine();
        altura= Double.parseDouble(entrada);
        System.out.println("dime el precio por metro cubico de agua de referencia");
        entrada= baner.readLine();
        precio_p_metro_cub= Double.parseDouble(entrada);

        volumen= Volumen_Prisma_Rectangular.Calcular_Volumen_metros(longitud,ancho,altura);
        pago = volumen* precio_p_metro_cub;

        System.out.println("El volumen de la alberca es de: "+ volumen);
        System.out.println("El pago total es de: "+ pago);


    }
}
