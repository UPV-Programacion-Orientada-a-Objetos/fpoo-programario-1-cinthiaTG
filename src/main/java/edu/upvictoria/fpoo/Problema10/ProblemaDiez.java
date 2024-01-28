package edu.upvictoria.fpoo.Problema10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaDiez {
    public ProblemaDiez() throws IOException{
        /**
         *Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para cada
         * pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente
         * las tiene en metros.
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double cant_metros;
        System.out.println("Ingresa la cantidad de metros: ");
        entrada= bufer.readLine();
        cant_metros= Double.parseDouble(entrada);
        System.out.println(Metros_a_Pulgadas.Convertir_Metros_Pulgadas(cant_metros));
    }
}
