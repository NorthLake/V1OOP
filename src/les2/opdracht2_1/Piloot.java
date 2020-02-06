package les2.opdracht2_1;

public class Piloot {
    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String naam) {
        this.naam = naam;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public void verhoogVliegurenMet(int uren) {
        this.vlieguren += uren;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public double getSalaris() {
        return salaris;
    }

    public String toString() {
        return String.format("%s heeft %d vlieguren gemaakt en verdient %.2f", naam, vlieguren, salaris);
    }
}
