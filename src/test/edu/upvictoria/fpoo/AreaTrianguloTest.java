import edu.upvictoria.fpoo.Problema5.AreaTriangulo;
import org.junit.Assert;
import org.junit.Test;
public class AreaTrianguloTest {
    @Test
    public void Calcular_Area_Triangulo_int_int(){
        int base=2;
        int altura =5;
        Assert.assertEquals(5, AreaTriangulo.calcularAreaTriangulo(base,altura),0.001);
    }
    @Test
    public void Calcular_Area_Triangulo_int_double(){
        int base= 8;
        double altura = 4.1;
        Assert.assertEquals(16.4, AreaTriangulo.calcularAreaTriangulo(base, altura),0.001);
    }
    @Test
    public void Calcular_Area_Triangulo_double_double(){
        double base= 4.2;
        double altura =4.2;
        Assert.assertEquals(8.82, AreaTriangulo.calcularAreaTriangulo(base, altura),0.001);
    }
    @Test
    public void Calcular_Area_numeros_enteros_negativos(){
        int base = -2;
        int altura = -6;
        Assert.assertEquals(6,AreaTriangulo.calcularAreaTriangulo(base,altura),0.001);
    }
    @Test
    public void Calcular_Area_numero_int_neg_positivo(){
        int base =-8;
        int altura =2;
        Assert.assertEquals(-8,AreaTriangulo.calcularAreaTriangulo(base, altura), 0.001);
    }
    @Test
    public void Calcular_Area_numero_double_neg_positivo(){
        double base =-8;
        double altura =2;
        Assert.assertEquals(-8.0,AreaTriangulo.calcularAreaTriangulo(base, altura), 0.001);
    }
    @Test
    public void Calcular_Area_numeros_double_negativos(){
        double base = -2;
        double altura = -6;
        Assert.assertEquals(6.0,AreaTriangulo.calcularAreaTriangulo(base,altura),0.001);
    }
}
