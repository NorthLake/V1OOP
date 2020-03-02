package les6.opdracht6_2;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vnm, String anm, String em) {
        this.voornaam = vnm;
        this.achternaam = anm;
        this.email = em;
    }

    @Override
    public boolean equals(Object andereObject) {
        boolean zelfde = false;
        if (andereObject instanceof Vriend) {
            Vriend andereVriend = (Vriend) andereObject;
            if (this.voornaam.equals(andereVriend.voornaam) &&
                    this.achternaam.equals(andereVriend.achternaam) &&
                    this.email.equals((andereVriend.email))) {
                zelfde = true;
            }
        }
        return zelfde;
    }

    @Override
    public String toString() {
        return voornaam + " " + achternaam + ", email: " + email;
    }
}