package les4.practicum4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur ah;

    @BeforeEach
    public void init() {
        ah = new AutoHuur();
    }

    @Test
    public void testTotaalPrijsNiks() {
        assertEquals(0, ah.totaalPrijs(), "Bij geen huurder en geen auto is de totaalprijs niet 0.");
    }

    @Test
    public void testTotaalPrijsGeenKlant() {
        ah.setGehuurdeAuto(new Auto("Ferrari", 3500));
        assertEquals(0, ah.totaalPrijs(), "Bij een auto en geen huurder is de totaalprijs niet 0.");
    }

    @Test
    public void testTotaalPrijsGeenAuto() {
        ah.setHuurder(new Klant("Jan"));
        assertEquals(0, ah.totaalPrijs(), "Bij een huurder een geen auto is de totaalprijs niet 0.");
    }

    @Test
    public void testAantalDagen() {
        ah.setAantalDagen(10);
        assertEquals(10, ah.getAantalDagen(), "Het aantal dagen klopt niet.");
        assertThrows(IllegalArgumentException.class, () -> ah.setAantalDagen(-1), "Er wordt geen error gegeven bij een negatief aantal dagen.");
        assertThrows(IllegalArgumentException.class, () -> ah.setAantalDagen(0), "Er wordt geen error gegeven bij 0 dagen.");
    }

    @Test
    public void testTotaalPrijs() {
        Klant huurder = new Klant("Jan");
        huurder.setKorting(10);
        ah.setHuurder(huurder);
        ah.setGehuurdeAuto(new Auto("Ferrari", 3500));
        ah.setAantalDagen(4);
        assertEquals(12600, ah.totaalPrijs(), "De berekende totaalprijs is niet correct.");
    }

    @Test
    public void testGehuurdeAuto() {
        ah.setGehuurdeAuto(new Auto("Ferrari", 3500));
        assertEquals("Ferrari met prijs per dag: 3500.0", ah.getGehuurdeAuto().toString(), "Het declareren van de gehuurde auto gaat niet goed.");
    }

    @Test
    public void testHuurder() {
        ah.setHuurder(new Klant("Jan"));
        assertEquals("Jan (korting: 0.0%)", ah.getHuurder().toString(), "Het declareren van de huurder gaat niet goed.");
    }

    @Test
    public void testToStringNiks() {
        assertEquals("  er is geen auto bekend\n" +
                              "  er is geen huurder bekend\n" +
                              "  aantal dagen: 0 en dat kost 0.0", ah.toString(), "De toString-methode zonder auto en huurder geeft:\n" + ah.toString());
    }

    @Test
    public void testToStringGeenKlant() {
        ah.setGehuurdeAuto(new Auto("Ferrari", 3500));
        assertEquals("  Ferrari met prijs per dag: 3500.0\n" +
                "  er is geen huurder bekend\n" +
                "  aantal dagen: 0 en dat kost 0.0", ah.toString(), "De toString-methode zonder huurder geeft:\n" + ah.toString());
    }

    @Test
    public void testToStringGeenAuto() {
        ah.setHuurder(new Klant("Jan"));
        assertEquals("  er is geen auto bekend\n" +
                "  op naam van: Jan (korting: 0.0%)\n" +
                "  aantal dagen: 0 en dat kost 0.0", ah.toString(), "De toString-methode zonder auto geeft:\n" + ah.toString());
    }

    @Test
    public void testToString() {
        Klant huurder = new Klant("Jan");
        huurder.setKorting(10);
        ah.setHuurder(huurder);
        ah.setGehuurdeAuto(new Auto("Ferrari", 3500));
        ah.setAantalDagen(4);
        assertEquals("  Ferrari met prijs per dag: 3500.0\n" +
                "  op naam van: Jan (korting: 10.0%)\n" +
                "  aantal dagen: 4 en dat kost 12600.0", ah.toString(), "De toString-methode met auto en huurder geeft:\n" + ah.toString());
    }
}