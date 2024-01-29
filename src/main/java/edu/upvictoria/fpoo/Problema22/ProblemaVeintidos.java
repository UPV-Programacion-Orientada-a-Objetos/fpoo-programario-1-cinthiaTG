package edu.upvictoria.fpoo.Problema22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintidos {
    public ProblemaVeintidos() throws IOException{
        /**
         * La compañía de luz y sombras (CLS) requiere determinar el pago que debe realizar una
         * persona por el consumo de energía eléctrica, la cual se mide en kilowatts (KW).
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double consumido, precio, pago;
        System.out.println("cual es la cantidad de kw consumidos: ");
        entrada = bufer.readLine();
        consumido = Double.parseDouble(entrada);
        System.out.println("cual es el precio por kw consumido");
        entrada =bufer.readLine();
        precio = Double.parseDouble(entrada);
        pago = consumido * precio;
        System.out.println("El pago a realizar es de: $" + pago );


    }
}
