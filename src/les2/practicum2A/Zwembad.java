package les2.practicum2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public Zwembad() {}

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public String toString() {
        return String.format("Dit zwembad is %.1f meter breed, %.1f meter lang, en %.1f meter diep", breedte, lengte, diepte);
    }
}
