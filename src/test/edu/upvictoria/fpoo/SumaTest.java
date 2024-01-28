import edu.upvictoria.fpoo.Problema1.Suma;
import org.junit.Assert;
import org.junit.Test;

public class SumaTest {
    @Test
    public void sumar_dos_numeros_double_positivos(){
        double a = 1.1;
        double b = 2.1;
        Suma s = new Suma();
        double resultado = s.sumar(a, b);
        double margenDeError = 0.001;

        Assert.assertEquals(3.2, resultado, margenDeError);
    }

    @Test
    public void sumar_dos_numeros_double_negativos(){
        double a = -1.1;
        double b = -2.1;
        Suma s = new Suma();
        double resultado = s.sumar(a, b);
        double margenDeError = 0.001;

        Assert.assertEquals(-3.2, resultado, margenDeError);
    }

    @Test
    public void sumar_dos_numeros_int_double(){
        int a = 3;
        double b = 3.4;
        Suma s = new Suma();
        double resultado = s.sumar(a, b);
        double margenDeError = 0.001;

        Assert.assertEquals(6.4, resultado, margenDeError);
    }
}
