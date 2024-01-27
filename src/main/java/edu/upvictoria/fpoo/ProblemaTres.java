package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaTres extends AreaRectangulo {
    int largo=0, ancho=0;
    public ProblemaTres(){
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double base;
        double altura;
        String entrada;
        System.out.println("Escribe un valor: ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);
        System.out.println("Escribe un valor: ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);
        System.out.println(AreaRectangulo.calcularAreaRectangulo(base, altura));
    }
}
