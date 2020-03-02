package les4.opdracht4_1;

public class Eigenaar {
    private String naam;
    private int giroNr;

    public Eigenaar(String nm) {
        this.naam = nm;
    }

    public void setGiroNr(int nr) {
        this.giroNr = nr;
    }

    public int getGiroNr() {
        return giroNr;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam + " heeft giro " + giroNr;
    }
}
