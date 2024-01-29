package edu.upvictoria.fpoo.Problema18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDieciocho {
    public ProblemaDieciocho() throws IOException{
        /**
         * La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
         * boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
         * kilómetro. R
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double kilometros, costo_p_kilometro, costo_final;
        System.out.println("cual es el costo por kilometro?: ");
        entrada = bufer.readLine();
        costo_p_kilometro= Double.parseDouble(entrada);
        System.out.println("cuantos kilometros se quiere recorrer: ");
        entrada = bufer.readLine();
        kilometros = Double.parseDouble(entrada);
        costo_final =  kilometros * costo_p_kilometro;

        System.out.println("el costo que tendra el boleto para ese viaje sera de: "+ costo_final);
    }
}
