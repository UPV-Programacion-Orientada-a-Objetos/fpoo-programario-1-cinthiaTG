package edu.upvictoria.fpoo.Problema17;

import edu.upvictoria.fpoo.Problema5.AreaTriangulo;
import edu.upvictoria.fpoo.Problema6.TeoremaPitagoras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecisiete {
    public ProblemaDiecisiete() throws IOException{
        double ca_op, ca_ady, hipotenusa;
        /**
         *Se requiere determinar la hipotenusa de un triángulo rectángulo.
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada ;
        System.out.println("Ingresa el valor del Cateto Adyacente: ");
        entrada= bufer.readLine();
        ca_ady= Double.parseDouble(entrada);
        System.out.println("Ingresa el valor del Cateto Opuesto: ");
        entrada= bufer.readLine();
        ca_op= Double.parseDouble(entrada);
        hipotenusa= TeoremaPitagoras.calcular_hipotenusa(ca_op,ca_ady);
        System.out.println("la hipotenusa de este triangulo es: "+ hipotenusa);
    }
}
