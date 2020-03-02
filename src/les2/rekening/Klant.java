package les2.rekening;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;
    private Rekening mijnRekening;

    public Klant(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public String toString() {
        String s = naam + ", woont op " + adres + ", in " + plaats;
        if (mijnRekening == null) {
            //noinspection UnusedAssignment
            s += "; er is nog geen rekening bekend";
        }
        return naam + " woont aan " + adres + " in " + plaats;
    }
}
