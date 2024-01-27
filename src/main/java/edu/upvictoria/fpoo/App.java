package edu.upvictoria.fpoo;
public class App
{
    public static void main( String[] args )
    {
        ProblemaUno obj;
        obj = new ProblemaUno();
        System.out.println(Suma.sumar(obj.a, obj.b));
        obj.a=12;
        obj.b=100;
        System.out.println(Suma.sumar(obj.a, obj.b));
        System.out.println(Suma.sumar(2.33,1));
    }
}
