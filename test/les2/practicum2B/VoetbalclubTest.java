package les2.practicum2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub vc;

    @BeforeEach
    public void maakVcAan() {
       vc = new Voetbalclub("FC Utrecht");
    }

    @Test
    public void testVoetbalclub() {
        assertEquals("FC Utrecht", vc.getNaam(), "De naam is niet correct gedeclareerd.");
        Voetbalclub vcLeeg = new Voetbalclub("");
        assertEquals("FC", vcLeeg.getNaam(), "De naam is niet FC als een lege string is opgegeven.");
    }

    @Test
    public void testVerwerkResultaatWin() {
        vc.verwerkResultaat('w');
        assertEquals(3, vc.aantalPunten(), "Het aantal punten wordt bij een gewonnen wedstrijd niet verhoogd met 3.");
    }

    @Test
    public void testVerwerkResultaatGelijk() {
        vc.verwerkResultaat('g');
        assertEquals(1, vc.aantalPunten(), "Het aantal punten wordt bij een gelijke uitslag niet verhoogd met 1.");
    }

    @Test
    public void testVerwerkResultaatVerloren() {
        vc.verwerkResultaat('v');
        assertEquals(0, vc.aantalPunten(), "Het aantal punten blijft bij een verloren wedstrijd niet gelijk.");
    }

    @Test
    public void testAantalPunten() {
        vc.verwerkResultaat('w');
        vc.verwerkResultaat('w');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('v');
        assertEquals(9, vc.aantalPunten(),"Het aantal punten klopt niet.");
        assertEquals(8, vc.aantalGespeeld(), "Het aantal gespeelde wedstrijden klopt niet.");
    }

    @Test
    public void testAantalGespeeld() {
        vc.verwerkResultaat('w');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');
        assertEquals(3, vc.aantalGespeeld(), "Het aantal gespeelde wedstrijden klopt niet.");
    }

    @Test void testVerwerkResultaatVerkeerdArg() {
        vc.verwerkResultaat('a');
        assertEquals(0, vc.aantalGespeeld(), "De functie verwerkResultaat accepteert volgens aantalGespeeld een verkeerd argument.");
        assertEquals(0, vc.aantalPunten(), "De functie verwerkResultaat accepteert volgens aantalPunten een verkeerd argument.");
    }

    @Test
    public void testToString() {
        vc.verwerkResultaat('w');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('v');
        vc.verwerkResultaat('v');
        assertEquals("FC Utrecht   6 1 2 3 5", vc.toString(), "De ToString methode werkt niet goed.");
    }
}