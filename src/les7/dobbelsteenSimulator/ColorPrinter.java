package les7.dobbelsteenSimulator;

public class ColorPrinter implements PrettyPrinter {
    public void print(String message) {
        System.out.println("\033[31m" + message + "\033[0m");
    }
}
