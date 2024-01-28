import edu.upvictoria.fpoo.Problema3.AreaRectangulo;
import org.junit.Assert;
import org.junit.Test;

public class AreaRectanguloTest {
    @Test
    public void calcular_Area_Rectangulo_Double_Double() {
        double base = 4.2;
        double altura = 5.6;
        Assert.assertEquals(23.52, AreaRectangulo.calcularAreaRectangulo(base, altura), 0.001);
    }

    @Test
    public void calcular_Area_Rectangulo_Int_Int() {
        int base = 4;
        int altura = 5;
        Assert.assertEquals(20, AreaRectangulo.calcularAreaRectangulo(base, altura), 0.001);
    }
    @Test
    public void calcular_Area_Rectangulo_Int_Double(){
        int base = 4;
        double altura = 5.3;
        Assert.assertEquals(21.2, AreaRectangulo.calcularAreaRectangulo(base, altura), 0.001);
    }
    @Test
    public void calcular_Area_Rectangulo_Double_Int (){
        double base = 4.5;
        int altura = 5;
        Assert.assertEquals(22.5, AreaRectangulo.calcularAreaRectangulo(base, altura), 0.001);
    }
}
