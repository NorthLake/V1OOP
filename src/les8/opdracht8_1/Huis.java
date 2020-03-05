package les8.opdracht8_1;

import java.util.Calendar;

public class Huis extends Gebouw {
    public boolean isGeisoleerd;
    public int laatsteRenovatie; // binnen

    public Huis() {

    }

    public Huis(boolean isG) {
        this.isGeisoleerd = isG;
    }

    public Huis(int l, int b, int aV) {
        super.setLengte(l);
        super.setBreedte(b);
        super.setAantalVerdiepingen(aV);
    }

    public Huis(int l, int b, int aV, boolean isG) {
        super.setLengte(l);
        super.setBreedte(b);
        super.setAantalVerdiepingen(aV);
        this.isGeisoleerd = isG;
    }

    public void isoleer() {
        this.isGeisoleerd = true;
    }

    public void renoveer(int binnen) {
        this.laatsteRenovatie = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void renoveer(int binnen, int buiten) {
        this.laatsteRenovatie = Calendar.getInstance().get(Calendar.YEAR);
        super.laatsteRenovatie = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int berekenHuur() {
        return this.oppervlakte() * 100;
    }

    @Override
    public String toString() {
        return "Huis{" +
                "lengte=" + super.getLengte() +
                ", breedte=" + super.getBreedte() +
                ", isGeisoleerd=" + isGeisoleerd +
                ", laatsteRenovatie=" + laatsteRenovatie +
                ", laatsteRenovatie=" + laatsteRenovatie +
                '}';
    }
}
