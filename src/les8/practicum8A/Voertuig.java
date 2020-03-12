package les8.practicum8A;

public abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jaar) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jaar;
    }

    public String getType() {
        return type;
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
        return "Voertuig: " + type + ", gebouwd in " + bouwjaar + " heeft een waarde van: €" + String.format("%.2f", huidigeWaarde());
    }
}
