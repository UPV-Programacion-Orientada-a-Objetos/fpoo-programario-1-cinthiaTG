package edu.upvictoria.fpoo.Problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDos extends Promedio {
    int a, b,c,d;
    public ProblemaDos(){
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double[] calificaciones = new double[4];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            String entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
        }
        System.out.println(Promedio.promediar(calificaciones));
    }
}