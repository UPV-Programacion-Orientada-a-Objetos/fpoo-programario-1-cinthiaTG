package edu.upvictoria.fpoo.Problema23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaVeintitres {
    /**
     * determinar cuánto pagará finalmente una persona por un artículo equis, considerando
     * que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
     * descuento y el precio final).
     * */
    public ProblemaVeintitres() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double precio_articulo, descuento =.20 , IVA= .15, art_desc, art_iva;
        System.out.println("Dime el precio del producto a comprar: ");
        entrada = bufer.readLine();
        precio_articulo = Double.parseDouble(entrada);
        art_desc = precio_articulo * descuento;
        art_iva = (precio_articulo - art_desc) * IVA;

        System.out.println("Producto con descuento: " + (precio_articulo - art_desc));
        System.out.println("Precio final con IVA: " + ((precio_articulo - art_desc) + art_iva));

    }
}
