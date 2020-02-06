package les1.practicum1_5;

public class Main {
    public static void main(String[] args) {
        boolean dubbelS = true;
        for (int i=0;i<10;i++) {
            if (dubbelS) {
                System.out.println("ss");
                dubbelS = false;
            } else {
                System.out.println("s");
                dubbelS = true;
            }
        }
    }
}
