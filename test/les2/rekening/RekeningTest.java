package les2.rekening;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RekeningTest {
    private Rekening r1;

    @BeforeEach
    public void init() {
        r1 = new Rekening(12345678);
    }
    @Test
    public void testStortenPositieveBedragen() {
        r1.stort(100);
        double nieuwSaldo = r1.getSaldo();
        assertEquals(100, nieuwSaldo);
    }

    @Test
    public void testStortenNegatiefBedrag() {
        r1.stort(-50);
        double nieuwSaldo = r1.getSaldo();
        assertEquals(0, nieuwSaldo);
    }

    @Test
    public void testOpnemenPositieveBedragen() {
        r1.stort(100);
        double nieuwSaldo = r1.getSaldo();
        assertEquals(100, nieuwSaldo);
    }

    @Test
    public void testOpnemenNegatiefBedrag() {
        r1.stort(-50);
        double nieuwSaldo = r1.getSaldo();
        assertEquals(0, nieuwSaldo);
    }
}