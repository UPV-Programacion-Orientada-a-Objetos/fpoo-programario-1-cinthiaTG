package edu.upvictoria.fpoo.Problema6;

public class TeoremaPitagoras {
    public static double calcular_cateto_opuesto(double base, double hipotenusa){
        double a = Math.pow(base, 2);//cateto ady
        double b = Math.pow(hipotenusa, 2);//hipotenusa
        double z = Math.sqrt(b-a);

        return z;
    }
    public static double calcular_hipotenusa(double ca_op, double ca_ady){
        double a = Math.pow(ca_ady,2);
        double b= Math.pow(ca_op,2);
        double z = Math.sqrt(a+b);
        return z;
    }
}
