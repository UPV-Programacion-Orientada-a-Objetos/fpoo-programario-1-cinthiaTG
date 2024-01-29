package edu.upvictoria.fpoo.Problema15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaQuince {
    /**
     * Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
     * utilizan. Considere que el cobro es con base en las horas que lo disponen y que las
     * fracciones de hora se toman como completas
     * */
    public ProblemaQuince() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int minutos_entrada, hora_entrada, hora_salida,minutos_salida;
        double cobro, duracion, tarifa;
        String entrada;
        System.out.println("ingrese la tarifa por hora: ");
        entrada= bufer.readLine();
        tarifa= Double.parseDouble(entrada);

        System.out.println("dime la hora de entrada (solo hora");
        entrada= bufer.readLine();
        hora_entrada= Integer.parseInt(entrada);
        System.out.println("con cuantos minutos? (solo minutos");
        entrada= bufer.readLine();
        minutos_entrada= Integer.parseInt(entrada);

        System.out.println("dime la hora de salida (solo hora");
        entrada= bufer.readLine();
        hora_salida= Integer.parseInt(entrada);
        System.out.println("con cuantos minutos? (solo minutos");
        entrada= bufer.readLine();
        minutos_salida= Integer.parseInt(entrada);

        duracion=DuracionHoras.calcularDuracionHoras(hora_entrada,minutos_entrada,hora_salida,minutos_salida);
        System.out.println("duracion en horas: "+ duracion);
        cobro= duracion *  tarifa;
        System.out.println("total a pagar: " + cobro);
    }
}
