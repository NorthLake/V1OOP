package les2.rekening;

public class Main {
    public static void main(String[] args) {
        Rekening r1 = new Rekening(12345678);
        Rekening r2 = new Rekening(13578642);
        Rekening r3 = new Rekening(33444555);

        r1.neemOp(45.88);
        r2.stort(250.00);
        r2.neemOp(210.00);
        r2.neemOp(50.00);
        r3.stort(5987654.98);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3);

        Klant k1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
        Klant k2 = new Klant("Wim", "Nijenoord 340", "Utrecht");

        r1.setRekeninghouder(k1);
        r2.setRekeninghouder(k2);

        System.out.println();
        System.out.println(r1);
        System.out.println(r1.getRekeninghouder());
        System.out.println(r2);
        System.out.println(r2.getRekeninghouder());
    }
}
