package les8.practicum8A;

import java.util.Calendar;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public String getType() {
        return type;
    }

    @Override
    public double huidigeWaarde() {
        return aanschafPrijs  * Math.pow(0.6, Calendar.getInstance().get(Calendar.YEAR) - productieJaar);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Computer) {
            Computer pc = (Computer)obj;
            return pc.type.equals(type) &&
                   pc.macAdres.equals(macAdres) &&
                   pc.aanschafPrijs == aanschafPrijs &&
                   pc.productieJaar == productieJaar;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Computer: " + type + ", geproduceerd in " + productieJaar + " heeft een waarde van: €" + String.format("%.2f", huidigeWaarde());
    }
}
