import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SubscripcionTest {
	@Test
		public void testPrecioPorMes() {
			double esperado=100;
			Subscripcion s = new Subscripcion(200,2) ;
			double resultado = s.precioPorMes();
			assertEquals(esperado, resultado,0);
		}
	@Test
		public void testprecioPorMes2() {
			double esperado=66.67;
			Subscripcion s = new Subscripcion(200,3) ;
			double resultado= s.precioPorMes();
			assertEquals(esperado, resultado, 0) ;
	}
	@Test
    public void testPrecioPorMesConPeriodoCero() {
        double esperado = 0;
        Subscripcion s = new Subscripcion(200, 0);
        double resultado = s.precioPorMes();
        assertEquals(esperado, resultado, 0);
    }
	@Test
    public void testPrecioPorMesConPrecioCero() {
        double esperado = 0;
        Subscripcion s = new Subscripcion(0, 2);
        double resultado = s.precioPorMes();
        assertEquals(esperado, resultado, 0);
    }
	@Test
    public void testCancel() {
        Subscripcion s = new Subscripcion(200, 2);
        s.cancel();
        assertEquals(0, s.periodo);
	}
	
}