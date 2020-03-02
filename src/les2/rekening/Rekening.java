package les2.rekening;

public class Rekening {
    private int nummer;
    private double saldo;
    private Klant rekeninghouder;

    public Rekening(int nr) {
        nummer = nr;
        saldo = 0;
    }

    public void setRekeninghouder(Klant rekeninghouder) {
        this.rekeninghouder = rekeninghouder;
    }

    public Klant getRekeninghouder() {
        return rekeninghouder;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stort(double bedrag) {
        if (bedrag > 0) {
            saldo += bedrag;
        }
    }

    public void neemOp(double bedrag) {
        if (bedrag < 0) {
            saldo -= bedrag;
        }
    }

    public String toString() {
        String resultaat = "Op rekening " + nummer + " staat €" + saldo;
        if (rekeninghouder != null) {
            resultaat += ", en de rekeninghouder is: " + rekeninghouder.getNaam();
        }
        return resultaat;

//        return "Op rekening " + nummer + " staat " + saldo + (rekeninghouder == null ? "" : "");
    }
}
