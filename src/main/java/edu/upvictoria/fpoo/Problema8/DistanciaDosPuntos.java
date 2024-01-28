package edu.upvictoria.fpoo.Problema8;

public class DistanciaDosPuntos {
    public static double Calcular_Distancia(double x1,double x2, double y1, double y2){
        double pas1 = Math.pow((x2 - x1), 2);
        double pas2 = Math.pow((y2 - y1), 2);
        double pas3 = pas1 + pas2;
        double result = Math.sqrt(pas3);
        return result;
    }
}
