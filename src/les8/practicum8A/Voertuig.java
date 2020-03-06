package les8.practicum8A;

import java.util.Calendar;

public abstract class Voertuig {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jaar) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jaar;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Voertuig) {
            Voertuig voertuig = (Voertuig)obj;
            return voertuig.type.equals(this.type) &&
                    voertuig.nieuwprijs == this.nieuwprijs &&
                    voertuig.bouwjaar == this.bouwjaar;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" +
                (nieuwprijs - nieuwprijs * Math.pow(this instanceof Auto ? 0.7 : 0.9, Calendar.YEAR - bouwjaar));
    }
}
