package les4.opdracht4_2;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;

    public Huisdier(String nm, String r) {
        this.naam = nm;
        this.ras = r;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
    }
}
