package les8.practicum8A;

import java.util.ArrayList;
import les9.practicum9A.Utils;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g) {
        if (!alleGoederen.contains(g)) {
            if (g.huidigeWaarde() < budget) {
                budget -= g.huidigeWaarde();
                alleGoederen.add(g);
            } else {
                System.out.println("\u001b[31m" + "Er is te weinig budget." + "\u001b[0m");
            }
        } else {
            System.out.println("\u001b[31m" + "Dit product is al aangeschaft." + "\u001b[0m");
        }
    }

    @Override
    public String toString() {
        String string = "Huidig budget: " + Utils.euroBedrag(budget);
        for (Goed goed : alleGoederen) {
            string += "\n" + goed.toString();
        }
        return string;
    }
}
