package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Problema1.ProblemaUno;
import edu.upvictoria.fpoo.Problema1.Suma;
import edu.upvictoria.fpoo.Problema2.ProblemaDos;

public class Main {
    public static void main( String[] args )
    {
        ProblemaUno obj;
        obj = new ProblemaUno();
        ProblemaDos obj2;
        obj2= new ProblemaDos();
        System.out.println(Suma.sumar(1.2,4));
    }
}