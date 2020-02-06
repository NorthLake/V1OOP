package les2.product;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("iPad", "1234AB", 614.00);
        pr1.setBTW(19.0);
        pr1.verhoogPrijsMet(2.5);
        System.out.println("Eerste product: " + pr1);

        Product pr2 = new Product("Paracetamol", "5678CD");
        pr2.setPrijs(1.90);
        pr2.setBTW(6.0);
        pr2.verhoogPrijsMet(-10);
        System.out.println("Tweede product: " + pr2);
        System.out.println();
        System.out.println("BTW percentage: " + pr2.getBTW());
        System.out.println("Betaalde btw: " + pr2.btwBedrag());
        System.out.println("Prijs: " + pr2.getPrijs());
    }
}
