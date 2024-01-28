package edu.upvictoria.fpoo.Problema1;

import java.security.PublicKey;

public class Suma {
    /*
    *todo lo que tenga una ligaadura lo elimina la maq virt
    * con el static la clase ya no le pertenece a los objetos, solo a las clases
    * */

    public static int sumar (int a, int b){
        return  a+b;
    }
    public static double sumar (double a, double b){
        return a+b;
    }
    public  static double sumar (int a, double b){
        return a+b;
    }
    public static   double sumar (double a, int b){
        return a+b;
    }
}
