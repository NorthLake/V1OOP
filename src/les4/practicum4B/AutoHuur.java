package les4.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {}

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public String getGehuurdeAuto() {
        return gehuurdeAuto.toString();
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (huurder != null && gehuurdeAuto != null) {
            return gehuurdeAuto.getPrijsPerDag() * aantalDagen * (1 - huurder.getKorting() / 100);
        } else {
            return 0;
        }
    }

    public String toString() {
        String resultaat = "  ";
        if (gehuurdeAuto == null) {
            resultaat += "er is geen auto bekend\n";
        } else {
            resultaat += gehuurdeAuto + "\n";
        }
        if (huurder == null) {
            resultaat += "  er is geen huurder bekend";
        } else {
            resultaat += "  op naam van: " + huurder;
        }
        return resultaat + "\n  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}
