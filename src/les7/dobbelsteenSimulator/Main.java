package les7.dobbelsteenSimulator;

public class Main {
    public static void main(String[] args) {
        PrettyPrinter printer = new ItalicPrinter();

        boolean doorgaan = true;

        while (doorgaan) {
            int random = (int)(Math.random() * 6) + 1;
            printer.print("worp: " + random);

            if (random != 6) {
                doorgaan = false;
            }
        }
    }
}
