package les4.opdracht4_1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        this.naam = nm;
        this.ras = r;
    }

    public void setBaasje(Eigenaar e) {
        this.baasje = e;
    }

    public Eigenaar getBaasje() {
        return baasje;
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
        String resultaat =  naam + ", de " + ras + " weegt " + gewicht + " kg.\nEn de eigenaar is: ";
        if (baasje == null) {
            resultaat += "null";
        } else {
            resultaat += baasje;
        }
        return resultaat;
    }
}
