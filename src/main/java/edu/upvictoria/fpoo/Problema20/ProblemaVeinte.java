package edu.upvictoria.fpoo.Problema20;

import edu.upvictoria.fpoo.Problema19.CalcularTiempo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinte {
/**
 * Se requiere determinar el costo que tendrá realizar una llamada telefónica con base en el
 * tiempo que dura la llamada y en el costo por minuto.
 * */
    public  ProblemaVeinte() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double costo_minuto, costo_final, tiempo;
        System.out.println("dime el costo de tiene la llamada telefonica por minuto: ");
        entrada = bufer.readLine();
        costo_minuto = Double.parseDouble(entrada);
        System.out.println("dime el tiempo durado en minutos al telefono: ");
        entrada = bufer.readLine();
        tiempo = Double.parseDouble(entrada);

        costo_final = CalcularTiempo.Calcular_costo_por_tiempo(tiempo, costo_minuto);
        System.out.println("El costo a pagar es de: " + costo_final);

    }
}
