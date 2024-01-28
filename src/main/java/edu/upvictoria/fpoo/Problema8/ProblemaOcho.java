package edu.upvictoria.fpoo.Problema8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaOcho {
    public ProblemaOcho() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double x1, x2, y1, y2;

        System.out.println("Dime el valor de x1");
        String entrada = bufer.readLine();
        x1 = Double.parseDouble(entrada);

        System.out.println("Dime el valor de y1");
        entrada = bufer.readLine();
        y1 = Double.parseDouble(entrada);

        System.out.println("Dime el valor de x2");
        entrada = bufer.readLine();
        x2 = Double.parseDouble(entrada);

        System.out.println("Dime el valor de y2");
        entrada = bufer.readLine();
        y2 = Double.parseDouble(entrada);

        double result = DistanciaDosPuntos.Calcular_Distancia(x1,x2,y1,y2);
        System.out.println("El resultado es: " + result);
    }
}
