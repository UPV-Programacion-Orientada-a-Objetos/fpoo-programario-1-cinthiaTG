package edu.upvictoria.fpoo.Problema2;

public class Promedio {
    /**
     *Un estudiante realiza cuatro exámenes durante el semestre,
     *los cuales tienen la misma ponderacion
     */

    public static double promediar(int[] calificaciones) {
        double totalCalificaciones = 0;

        for (double calificacion : calificaciones) {
            totalCalificaciones += calificacion;
        }

        double promedio = totalCalificaciones / calificaciones.length;
        System.out.println("El promedio de los exámenes es: " + promedio);
        return promedio;
    }
    public static double promediar(double[] calificaciones){
        double totalCalificaciones = 0;

        for (double calificacion : calificaciones) {
            totalCalificaciones += calificacion;
        }

        double promedio = totalCalificaciones / calificaciones.length;
        System.out.println("El promedio de los exámenes es: " + promedio);
        return promedio;
    }



}
