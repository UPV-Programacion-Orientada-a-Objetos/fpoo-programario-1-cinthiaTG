package edu.upvictoria.fpoo.Problema25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeinticinco {
    /**
     * Una empresa desea determinar el monto de un cheque que debe proporcionar a uno de
     * sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey; los
     * gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros gasto.
     * */
    public ProblemaVeinticinco() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double gasto_hotel, gasto_comida, otros_gastos=100, dias_viaje, monto_cheque;
        System.out.println("Dime la cantidad de dias que se estara de viaje");
        entrada= bufer.readLine();
        dias_viaje= Double.parseDouble(entrada);
        System.out.println("Dime la cantidad de gastos en un dia del hotel");
        entrada= bufer.readLine();
        gasto_hotel= Double.parseDouble(entrada);
        System.out.println("Dime la cantidad de gastos en un dia de comida");
        entrada= bufer.readLine();
        gasto_comida= Double.parseDouble(entrada);
        monto_cheque =(gasto_comida+gasto_hotel+otros_gastos)*dias_viaje;
        System.out.println("El monto que se deria de proporcionar es de: $"+ monto_cheque);
    }
}

