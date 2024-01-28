package edu.upvictoria.fpoo.Problema14;

import edu.upvictoria.fpoo.problema13.ProblemaTrece;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCatorce {
    /**
     * Una empresa que contrata personal requiere determinar la edad de las personas que
     * solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en que
     * nacieron.
     * */
    public ProblemaCatorce() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int año_nacimineto, año_actual, edad_aproximada;
        System.out.println("Ingresa el año de nadimiento:");
        entrada= bufer.readLine();
        año_nacimineto= Integer.parseInt(entrada);
        System.out.println("Ingresa el año actual:");
        entrada= bufer.readLine();
        año_actual= Integer.parseInt(entrada);
        edad_aproximada= Edad_persona.Calcular_edad(año_nacimineto, año_actual);
        System.out.println("Esta persona va a cumplir o ya cumplo: "+ edad_aproximada + "años de edad");
    }


}
