package les4.practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public String getHuisbaas() {
        return huisbaas.getNaam() + "; leeftijd " + huisbaas.getLeeftijd() + " jaar";
    }

    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + getHuisbaas();
    }
}
