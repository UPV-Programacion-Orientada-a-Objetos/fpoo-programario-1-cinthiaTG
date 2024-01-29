package edu.upvictoria.fpoo.Problema19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiecinueve {
    public ProblemaDiecinueve () throws IOException{
        /**
         * Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en
         * bicicleta, considerando que lleva una velocidad constante.
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double distancia, velocidad, tiepo;
        System.out.println("A que distancia esta la ciudad");
        entrada =bufer.readLine();
        distancia = Double.parseDouble(entrada);
        System.out.println("A que velocidad esta persona conduce la bicicleta");
        entrada =bufer.readLine();
        velocidad =Double.parseDouble(entrada);
        tiepo = CalcularTiempo.Calcular_tiempo_costante(distancia,velocidad);
        System.out.println("El tiempo que tardaria la persona en llegar a la ciudad es de: " + tiepo);
}
}
