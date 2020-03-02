package les5.practicum5A;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling l : leerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(nweCijfer);
                break;
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String result = "In klas " + klasCode + " zitten de volgende leerlingen:\n";
        for (Leerling l : leerlingen) {
            result += l + "\n";
        }
        return result;
    }
}
