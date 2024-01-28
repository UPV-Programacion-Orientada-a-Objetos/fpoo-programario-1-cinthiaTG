package edu.upvictoria.fpoo.Problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCuatro extends Menu{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Se requiere conocer el área de un círculo eliga cómo calcular:");
        System.out.println("1) Ingresando el radio");
        System.out.println("2) Ingresando el diámetro");
        System.out.print("Escribe 1 o 2 para elegir: ");
        String entrada = bufferedReader.readLine();
        int opcion = Integer.parseInt(entrada);

        Menu obj =new Menu();
        obj.main(opcion);
        System.out.println(obj);

    }
}