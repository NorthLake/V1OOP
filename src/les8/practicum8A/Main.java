package les8.practicum8A;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("Long Long", 50000);
        Computer pc1 = new Computer("Dell XPS 13", "AB:CD:EF:12:34:56", 1300, 2015);
        Computer pc2 = new Computer("Dell XPS 13", "AB:CD:EF:12:34:56", 1300, 2015);
        Computer pc3 = new Computer("Razer Blade Stealth 13", "12:34:56:AB:CD:EF",1500, 2018);
        Auto auto1 = new Auto("Opel Astra", 25000, 2015, "AB-CD-12");
        Auto auto2 = new Auto("Opel Astra", 25000, 2015, "AB-CD-12");
        Auto auto3 = new Auto("Tesla Model X", 100000, 2015, "3-GCF-54");
        Fiets fiets1 = new Fiets("Batavus", 550, 2017);
        Fiets fiets2 = new Fiets("Batavus", 550, 2017);
        Fiets fiets3 = new Fiets("Gazelle", 450, 2016);
        inventaris.schafAan(pc1);
        inventaris.schafAan(pc2);
        inventaris.schafAan(pc3);
        inventaris.schafAan(auto1);
        inventaris.schafAan(auto2);
        inventaris.schafAan(auto3);
        inventaris.schafAan(fiets1);
        inventaris.schafAan(fiets2);
        inventaris.schafAan(fiets3);
        Auto auto4 = new Auto("Tesla Model Y", 1500000, 2013, "4-GHG-78"); // Over budget
        inventaris.schafAan(auto4);
        System.out.println(inventaris);
    }
}
