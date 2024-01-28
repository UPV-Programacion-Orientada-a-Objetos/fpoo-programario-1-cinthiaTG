package edu.upvictoria.fpoo.problema13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.prefs.BackingStoreException;

public class ProblemaTrece {
    /**
     * Una empresa importadora desea determinar cuántos dólares puede adquirir con equis
     * cantidad de dinero mexicano.
     * */

    public ProblemaTrece() throws IOException {
        BufferedReader baner = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double cant_pesos;
        System.out.println("Ingresa la cantidad de pesos mexicanos que quieres convertir a dolares:");
        entrada= baner.readLine();
        cant_pesos= Double.parseDouble(entrada);
        System.out.println(Pesos_a_Dolares.Convertir_Pesos_a_Dolares(cant_pesos));

    }

}
