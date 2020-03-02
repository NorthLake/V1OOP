package les6.practicum6A;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        return Math.floor(nieuwprijs * Math.pow(0.7, LocalDate.now().getYear() - releaseJaar) * 100) / 100;
    }

    @Override
    public boolean equals(Object andereObject) {
        return this == andereObject;  // Niet goed, maar voorkomt error.
    }

    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + nieuwprijs + " nu voor: €" + huidigeWaarde();
    }
}
