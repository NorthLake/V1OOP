package les8.practicum8A;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g) {
        if (!alleGoederen.contains(g) && g.huidigeWaarde() < budget) {
            budget -= g.huidigeWaarde();
            alleGoederen.add(g);
        }
    }
}
