import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class csTest {
    @Test
    public void testConstructor() {
        cs c = new cs(100, 12);
        assertEquals(100, c.precio);
        assertEquals(12, c.periodo);
    }

    @Test
    public void testPrecioPorMes() {
        cs c = new cs(100, 12);
        assertEquals(8.34, c.precioPorMes(), 0.01);

        c = new cs(100, 0);
        assertEquals(0, c.precioPorMes(), 0);

        c = new cs(0, 12);
        assertEquals(0, c.precioPorMes(), 0);

        c = new cs(200, 10);
        assertEquals(20.0, c.precioPorMes(), 0.01);

        c = new cs(300, 10);
        assertEquals(30.0, c.precioPorMes(), 0.01);

        c = new cs(250, 5);
        assertEquals(50.0, c.precioPorMes(), 0.01);
        
        c = new cs(250, 4);
        assertEquals(62.5, c.precioPorMes(), 0.01);
    }
    @Test
    public void testCancel() {
        cs c = new cs(100, 12);
        c.cancel();
        assertEquals(0, c.periodo);
    }
}
