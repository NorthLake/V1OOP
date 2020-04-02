package les2.practicum2A;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    public void testBerekendeInhoud() {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        double nieuweInhoud = z1.inhoud();
        assertEquals(16.5, nieuweInhoud, "De berekende inhoud is niet juist.");
    }

}