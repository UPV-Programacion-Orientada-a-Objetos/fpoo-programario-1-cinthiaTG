import edu.upvictoria.fpoo.Problema2.Promedio;
import org.junit.Assert;
import org.junit.Test;

public class PromedioTest {
    @Test
    public void promedio_4_calificaiones_numeros_enteros(){
        int[] calificaciones = {7, 6, 9, 10};
        Assert.assertEquals(8, Promedio.promediar(calificaciones), 0.001);
    }
    @Test
    public void promedio_4_calificaiones_numeros_doule(){
        double[] calificaciones = {0.95, 0.88, 0.75, 0.83};
        Assert.assertEquals(0.8525, Promedio.promediar(calificaciones), 0.001);
    }
}
