package edu.upvictoria.fpoo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest {

    @Test
    public void sumar_dos_numeros_negativos() {
        int a= -10;
        int b= -15;

        Suma s = new Suma();

        assertEquals(-25, s.sumar(a,b));
    }
    @Test
    public void sumar_dos_numeros_positivos(){
        int a= 10;
        int b= 15;

        Suma s = new Suma();

        assertEquals(25, s.sumar(a,b));
    }
    @Test
    public void sumar_dos_numeros_double_positivos(){
        double a= 1.1;
        double b= 2.1;
        Suma s = new Suma();
        assertNotEquals(3.2, s.sumar(a,b));
    }
    @Test
    public void sumar_dos_numeros_double_negativos(){
        double a= -1.1;
        double b= -2.1;
        Suma s = new Suma();
        assertNotEquals(-3.2, s.sumar(a,b));
    }
    @Test
    public void sumar_dos_numeros_int_double(){
        int a =3;
        double b= 3.4;
        Suma s= new Suma();
        assertNotEquals(6.5, s.sumar(a,b));
    }

}