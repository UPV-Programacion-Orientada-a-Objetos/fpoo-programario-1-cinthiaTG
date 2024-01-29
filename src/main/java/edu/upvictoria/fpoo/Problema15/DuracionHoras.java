package edu.upvictoria.fpoo.Problema15;

public class DuracionHoras {
    public static int calcularDuracionHoras(int horaEntrada, int minutoEntrada, int horaSalida, int minutoSalida) {
        int duracionMinutos = (horaSalida * 60 + minutoSalida) - (horaEntrada * 60 + minutoEntrada);
        int duracionHoras = duracionMinutos / 60;
        if (duracionMinutos % 60 > 0) {
            duracionHoras++;
        }
        return duracionHoras;
    }
}
