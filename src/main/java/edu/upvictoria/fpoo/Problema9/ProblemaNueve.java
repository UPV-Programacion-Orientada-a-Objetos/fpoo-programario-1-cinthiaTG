package edu.upvictoria.fpoo.Problema9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaNueve {
    public ProblemaNueve() throws IOException{
        BufferedReader baner = new BufferedReader(new InputStreamReader(System.in));
        double sueldoPHora;
        int horasTrabajadas;
        System.out.println("Ingrese la cantidad de horas trabajadas no minutos");
        String entrada;
        entrada= baner.readLine();
        horasTrabajadas= Integer.parseInt(entrada);
        System.out.println("horas trabajadas: "+ horasTrabajadas);

        System.out.println("Ingrese el sueldo por hora");
        entrada= baner.readLine();
        sueldoPHora= Double.parseDouble(entrada);

        double result = sueldoPHora* horasTrabajadas;

        System.out.println("el sueldo obtenido es: "+ result);


    }
}
