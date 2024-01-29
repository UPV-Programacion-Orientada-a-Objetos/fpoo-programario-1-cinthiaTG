package edu.upvictoria.fpoo.Problema16;

import edu.upvictoria.fpoo.Problema3.AreaRectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDieciseis {
    /**
     *Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
     * Considere que se cobra por m2
     * */
    public ProblemaDieciseis() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double costo_metro_cuadrado, largo, ancho;
        String entrada;
        System.out.println("Pinturas ---LA BROCHA GORDA---");
        System.out.println("ingrese el cobro por m²");
        entrada=bufer.readLine();
        costo_metro_cuadrado= Double.parseDouble(entrada);
        System.out.println("cual es el largo de la pintura? (en metros): ");
        entrada = bufer.readLine();
        largo= Double.parseDouble(entrada);
        System.out.println("cual es el ancho de la pintura? (en metros): ");
        entrada = bufer.readLine();
        ancho= Double.parseDouble(entrada);

        double area_pintura = AreaRectangulo.calcularAreaRectangulo(ancho,largo);
        System.out.println("El area de la pintura es de: "+ area_pintura) ;
        System.out.println("El precio de la pintura es de: "+ (area_pintura*costo_metro_cuadrado)) ;

    }

}
