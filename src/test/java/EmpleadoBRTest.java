import es.iesmz.TipoEmpleado;
import es.iesmz.EmpleadoBR;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class EmpleadoBRTest {
    @Before
    public void beforeEachTest() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    public void testCalculaSalarioBruto1() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f);
        assertEquals(1360.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto2() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500.0f, 3.0f);
        assertEquals(1260.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto3() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0.0f);
        assertEquals(1100.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto4() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1250.0f, 8.0f);
        assertEquals(1760.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto5() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1000.0f, 0.0f);
        assertEquals(1600.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto6() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99f, 3.0f);
        assertEquals(1560.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto7() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 500.0f, 0.0f);
        assertEquals(1500.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto8() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 0.0f, 8.0f);
        assertEquals(1660.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoNegativo1() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, -1.0f, 8.0f);
        assertEquals(-1.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoNegativo2() {
        float resultado = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.vendedor, 1500.0f, -1.0f);
        assertEquals(-1.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioBrutoNull() {
        float resultado = EmpleadoBR.calculaSalarioBruto(null, 1500.0f, 8.0f);
        assertEquals(-1.0f, resultado, 0.01);
    }

    // Tests para calculaSalarioNeto

    @Test
    public void testCalculaSalarioNeto1() {
        float resultado = EmpleadoBR.calculaSalarioNeto(2000.0f);
        assertEquals(1640.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto2() {
        float resultado = EmpleadoBR.calculaSalarioNeto(1500.0f);
        assertEquals(1230.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto3() {
        float resultado = EmpleadoBR.calculaSalarioNeto(1499.99f);
        assertEquals(1259.9916f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto4() {
        float resultado = EmpleadoBR.calculaSalarioNeto(1250.0f);
        assertEquals(1050.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto5() {
        float resultado = EmpleadoBR.calculaSalarioNeto(1000.0f);
        assertEquals(840.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto6() {
        float resultado = EmpleadoBR.calculaSalarioNeto(999.99f);
        assertEquals(999.99f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto7() {
        float resultado = EmpleadoBR.calculaSalarioNeto(500.0f);
        assertEquals(500.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto8() {
        float resultado = EmpleadoBR.calculaSalarioNeto(0.0f);
        assertEquals(0.0f, resultado, 0.01);
    }

    @Test
    public void testCalculaSalarioNetoNegativo() {
        float resultado = EmpleadoBR.calculaSalarioNeto(-1.0f);
        assertEquals(-1.0f, resultado, 0.01);
    }
}
