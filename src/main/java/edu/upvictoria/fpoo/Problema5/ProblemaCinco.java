package edu.upvictoria.fpoo.Problema5;
import edu.upvictoria.fpoo.Problema3.AreaRectangulo;
import edu.upvictoria.fpoo.Problema3.ProblemaTres;
import edu.upvictoria.fpoo.Problema4.Menu;
import edu.upvictoria.fpoo.Problema4.ProblemaCuatro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaCinco extends ProblemaTres{

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double A,B,C;

        System.out.println("obtener el área respectiva de un terreno de medidas de cualquier valor, teniendo como entradas");
        System.out.println("valor de A");
        String entrada = bufer.readLine();
        A = Double.parseDouble(entrada);
        System.out.println("valor de B");
        entrada = bufer.readLine();
        B = Double.parseDouble(entrada);
        System.out.println("valor de C");
        entrada = bufer.readLine();
        C = Double.parseDouble(entrada);
        double rectangulo= AreaRectangulo.calcularAreaRectangulo(B,C);//rectangulo de abajo
        double triangulo = AreaTriangulo.calcularAreaTriangulo(B,(A-C));//tringulo de arriba
        double resultado= triangulo+rectangulo;
        System.out.println(resultado);
    }
}
