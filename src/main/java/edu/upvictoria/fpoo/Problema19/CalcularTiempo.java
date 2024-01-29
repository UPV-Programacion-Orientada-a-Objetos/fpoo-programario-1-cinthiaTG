package edu.upvictoria.fpoo.Problema19;

public class CalcularTiempo {
    public static double Calcular_tiempo_costante(double distancia, double velocidad){
        double tiempo = distancia/velocidad;
        return tiempo;
    }
    public static double Calcular_costo_por_tiempo(double tiempo, double costo_minuto){
        double costo = tiempo * costo_minuto;
        return costo;
    }
}
