package les8.opdracht8_1;

public class Gebouw {
    private int lengte;
    private int breedte;
    private int aantalVerdiepingen;
    public int laatsteRenovatie; // buiten

    public Gebouw() {

    }

    public Gebouw(int l, int b, int aV) {
        this.lengte = l;
        this.breedte = b;
        this.aantalVerdiepingen = aV;
    }

    public int oppervlakte() {
        return lengte * breedte;
    }

    public void renoveer(int jaarBuiten) {
        this.laatsteRenovatie = jaarBuiten;
    }

    public int berekenHuur() {
        return this.oppervlakte() * 75;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        this.breedte = breedte;
    }

    public void setAantalVerdiepingen(int aantalVerdiepingen) {
        this.aantalVerdiepingen = aantalVerdiepingen;
    }

    @Override
    public String toString() {
        return "Gebouw{" +
                "lengte=" + lengte +
                ", breedte=" + breedte +
                ", aantalVerdiepingen=" + aantalVerdiepingen +
                ", laatsteRenovatie=" + laatsteRenovatie +
                '}';
    }
}
