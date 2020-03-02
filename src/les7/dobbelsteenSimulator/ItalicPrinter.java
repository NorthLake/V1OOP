package les7.dobbelsteenSimulator;

public class ItalicPrinter implements PrettyPrinter {
    @Override
    public void print(String message) {
        System.out.println("\033[3m" + message + "\033[0m");
    }
}
