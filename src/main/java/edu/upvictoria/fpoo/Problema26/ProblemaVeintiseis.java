package edu.upvictoria.fpoo.Problema26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintiseis {
    public ProblemaVeintiseis() throws IOException{
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
        System.out.println("El monto para el hotel los "+ dias_viaje + "dias, es de: "+ (gasto_hotel*dias_viaje));
        System.out.println("El monto para la comida los "+ dias_viaje + "dias, es de: "+ (gasto_comida*dias_viaje));
        System.out.println("El monto para los otros gastos los "+ dias_viaje + "dias, es de: "+ (otros_gastos*dias_viaje));
    }
}
