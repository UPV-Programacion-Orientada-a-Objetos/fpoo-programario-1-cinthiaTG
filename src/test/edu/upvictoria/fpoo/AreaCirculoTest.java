import edu.upvictoria.fpoo.Problema4.AreaCirculo;
import org.junit.Assert;
import org.junit.Test;

public class AreaCirculoTest {

    @Test
    public void calcular_Area_Circulo_Radio_Int() {
        int radio = 4;
        Assert.assertEquals(50.2655, AreaCirculo.calcularAreaCirculo(radio), 0.001);
    }

    @Test
    public void calcular_Area_Circulo_Radio_Double() {
        double radio = 4.2;
        Assert.assertEquals(55.417694, AreaCirculo.calcularAreaCirculoConDiametro(radio), 0.001);
    }

    @Test
    public void calcular_Area_Circulo_Diametro_Int() {
        int diametro = 8;
        Assert.assertEquals(50.2655, AreaCirculo.calcularAreaCirculoConDiametro(diametro), 0.001);
    }

    @Test
    public void calcular_Area_Circulo_Diametro_Double() {
        double diametro = 8.4;
        Assert.assertEquals(55.417694, AreaCirculo.calcularAreaCirculoConDiametro(diametro), 0.001);
    }
}
