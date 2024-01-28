package edu.upvictoria.fpoo.Problema12;
import edu.upvictoria.fpoo.Problema5.AreaTriangulo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDoce{
    public ProblemaDoce() throws IOException{
        double base, altura;
        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dime la base del tringulo");
        entrada = bufer.readLine();
        base= Double.parseDouble(entrada);
        System.out.println("Dime la altura del tringulo");
        entrada = bufer.readLine();
        altura= Double.parseDouble(entrada);
        System.out.println(AreaTriangulo.calcularAreaTriangulo(base,altura));


    }

}
