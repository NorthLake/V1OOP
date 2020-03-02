package les4.opdracht4_2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        this.naam = nm;
    }

    public void setBeestje(Huisdier hd) {
        this.beestje = hd;
    }

    public Huisdier getBeestje() {
        return beestje;
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
        String resultaat = naam + " heeft giro " + giroNr + ". En is het baasje van ";
        if (beestje == null) {
            resultaat += "null";
        } else {
            resultaat += beestje;
        }
        return resultaat;
    }
}
