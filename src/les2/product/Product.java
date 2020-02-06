package les2.product;

public class Product {
    private String naam;
    private String code;
    private double prijs;
    private double btw;

    public Product(String naam, String code, double prijs) {
        this.naam = naam;
        this.code = code;
        this.prijs = prijs;
        this.btw = 0;
    }

    public Product(String naam, String code) {
        this.naam = naam;
        this.code = code;
        this.prijs = 0;
    }

    public void setBTW(double btw) {
        this.btw = btw;
    }

    public void verhoogPrijsMet(double perc) {
        this.prijs *= 1 + perc/100;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getBTW() {
        return prijs * btw / 100;
    }

    public double btwBedrag() {
        return prijs * btw;
    }

    public double getPrijs() {
        return prijs;
    }

    public String toString() {
        return String.format("%s heeft code %s en kost %.2f; de btw is %.1f%%", naam, code, prijs, btw);
//        return naam + " heeft code " + code + " en kost " + prijs + "; de btw is " + btw + "%";
    }
}
