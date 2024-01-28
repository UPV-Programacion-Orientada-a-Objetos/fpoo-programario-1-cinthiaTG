package edu.upvictoria.fpoo.Problema7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSiete {
    public ProblemaSiete()throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingresa la cantidad de leche que se fabrico en litros: ");
        String entrada = bufer.readLine();
        double litros = Double.parseDouble(entrada);
        double galon = litros/3.785;

        System.out.println("ingresa el precio por galon: ");
        entrada = bufer.readLine();
        double precioGalon = Double.parseDouble(entrada);
        double pago = galon * precioGalon;

        System.out.println("La cantidad de leche en galones es: " + galon);
        System.out.println("El pago deberia de ser de: $" + pago);

    }
}
