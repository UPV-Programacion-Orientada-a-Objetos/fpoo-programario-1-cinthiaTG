package edu.upvictoria.fpoo.Problema24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticuatro {
    public ProblemaVeinticuatro() throws IOException{
        /**
         * determinar cuánto dinero ahorra una persona en un año si considera que cada semana
         * ahorra 15% de su sueldo
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double sueldo_semanal, ahorro= 0.15, ahorro_Anual;
        System.out.println("Cual es el sueldo de una semana: ");
        entrada = bufer.readLine();
        sueldo_semanal = Double.parseDouble(entrada);
        double ahorro_mensual = (sueldo_semanal* ahorro)*4;
        ahorro_Anual = ahorro_mensual*12;
        System.out.println("El total del ahorro anual es de : " + ahorro_Anual);

    }
}
