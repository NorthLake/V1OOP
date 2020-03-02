package les6.opdracht6_2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> vrienden;

    public FacebookAccount(String nm) {
        this.naam = nm;
        vrienden = new ArrayList<Vriend>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV) {
        if (!isVriendMet(nwV)) {
            vrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV) {
        if (isVriendMet(exV)) {
            vrienden.remove(exV);
            return true;
        }
        return false;
    }

    public boolean isVriendMet(Vriend v) {
        return vrienden.contains(v);
    }

    public int aantalVrienden() {
        return vrienden.size();
    }

    @Override
    public String toString() {
        String result = naam + " heeft " + aantalVrienden() + " vrienden:";
        for (Vriend v : vrienden) {
            result += "\n" + v;
        }
        return result;
    }
}
