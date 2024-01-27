package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProblemaUno {
    /*
   constructorde la clase
   */
    /*
     *crear una suma de dos numeros usarndo el bufer reader
     * */
    public String color;
    int a,b;
    public ProblemaUno(){
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int x;
        int y;
        String entrada;
        String cadena;
        System.out.println("Escribe un valor: ");
        entrada = bufer.readLine();
        x = Integer.parseInt(entrada);
        System.out.println("Escribe un valor: ");
        entrada = bufer.readLine();
        y = Integer.parseInt(entrada);
        System.out.println(Suma.sumar(x,y));
    }

}
