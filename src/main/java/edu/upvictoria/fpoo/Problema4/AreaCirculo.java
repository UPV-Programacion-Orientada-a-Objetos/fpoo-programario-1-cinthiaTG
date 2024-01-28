package edu.upvictoria.fpoo.Problema4;

public class AreaCirculo {
    static public double calcularAreaCirculo(int radio) {
        return Math.PI * radio * radio;
    }

    static public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    static public double calcularAreaCirculoConDiametro(int diametro) {
        double radio = diametro / 2;
        return Math.PI * radio * radio;
    }
    static public double calcularAreaCirculoConDiametro(double diametro) {
        double radio = diametro / 2;
        return Math.PI * radio * radio;
    }
}
