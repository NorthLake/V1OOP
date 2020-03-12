package les8.practicum8A;

import java.util.Calendar;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    public double huidigeWaarde() {
        return nieuwprijs * Math.pow(0.7, Calendar.getInstance().get(Calendar.YEAR) - bouwjaar);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Auto auto = (Auto)obj;
            return auto.kenteken.equals(this.kenteken) && super.equals(auto);
        }
        return false;
    }
}
