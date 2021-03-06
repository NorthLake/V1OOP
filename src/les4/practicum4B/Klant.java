package les4.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
