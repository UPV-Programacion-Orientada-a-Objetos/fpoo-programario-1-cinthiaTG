package edu.upvictoria.fpoo.Problema3;
import edu.upvictoria.fpoo.Problema3.AreaRectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTres {
    public ProblemaTres() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double base;
        double altura;
        String entrada;
        System.out.println("valor de la base del rectangulo ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);
        System.out.println("valor de la altura del rectangulo ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);
        System.out.println(AreaRectangulo.calcularAreaRectangulo(base, altura));
    }
}
