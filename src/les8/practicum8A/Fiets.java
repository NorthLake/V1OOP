package les8.practicum8A;

import java.util.Calendar;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr) {
        super(tp, pr, jr);
    }

    @Override
    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.9, Calendar.getInstance().get(Calendar.YEAR) - bouwjaar);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fiets) {
            Fiets fiets = (Fiets)obj;
            return fiets.framenummer == this.framenummer && super.equals(fiets);
        }
        return false;
    }
}
