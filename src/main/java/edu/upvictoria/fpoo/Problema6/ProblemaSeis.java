package edu.upvictoria.fpoo.Problema6;

import edu.upvictoria.fpoo.Problema4.AreaCirculo;
import edu.upvictoria.fpoo.Problema5.AreaTriangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaSeis {
    /**
     * Aqui se usa el teorema de pitagoras de a²+b²=c² donde c=hipotenusa y b= radio
     * osea a²=c^2-b²
     * */
    public void ProblemaSeis() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double hipotenusa;
        double radio;
        String entrada;
        System.out.println("dime el valor de la Hipotenusa");
        entrada= bufer.readLine();
        hipotenusa= Double.parseDouble(entrada);
        System.out.println("dime el valor del Radio");
        entrada= bufer.readLine();
        radio= Double.parseDouble(entrada);
        double altura = TeoremaPitagoras.calcular_cateto_opuesto(radio,hipotenusa);
        double areaTriangulo= AreaTriangulo.calcularAreaTriangulo((radio*2), altura);
        double areaSemicirculo = AreaCirculo.calcularAreaCirculo(radio) / 2;

        System.out.println(areaSemicirculo);
        System.out.println(areaTriangulo);

        double resultado= areaTriangulo+ areaSemicirculo;
        System.out.println(resultado);

    }

}
