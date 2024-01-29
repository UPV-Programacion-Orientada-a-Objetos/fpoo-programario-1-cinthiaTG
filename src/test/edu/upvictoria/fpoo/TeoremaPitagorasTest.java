import edu.upvictoria.fpoo.Problema6.TeoremaPitagoras;
import org.junit.Assert;
import org.junit.Test;
public class TeoremaPitagorasTest {
    @Test
    public void Calcular_cateto_opuesto_ints(){
        int cateto_ady =2;
        int hipotenusa =2;
        Assert.assertEquals(2.8284, TeoremaPitagoras.calcular_hipotenusa(cateto_ady, hipotenusa), 0.001);
    }
    @Test
    public void Calcular_cateto_opuesto_double(){
        double cateto_ady =2.3;
        double hipotenusa =2.2;
        Assert.assertEquals(3.1827, TeoremaPitagoras.calcular_hipotenusa(cateto_ady, hipotenusa), 0.001);
    }
    @Test
    public void Calcular_hipotenusa_double(){
        double ca_opuesto= 4;
        double ca_adyacente= 8;
        Assert.assertEquals(32.0,TeoremaPitagoras.calcular_hipotenusa(ca_opuesto,ca_adyacente),0.001);
    }
}
