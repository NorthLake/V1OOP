package les2.rekening;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nr) {
        nummer = nr;
        saldo = 0;
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
        return "Op rekening " + nummer + " staat " + saldo;
    }
}
