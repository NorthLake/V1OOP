package les4.practicum4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leeftijd = lft;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString() {
        return "Persoon.toString() wordt niet gebruikt.";
    }
}
