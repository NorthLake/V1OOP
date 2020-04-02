package les11.opdracht11_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path p1 = Path.of("opdracht11_1.txt");
        for (String line : Files.readAllLines(p1)) {
            System.out.println(line);
        }

        System.out.println("\n");

        Path p2 = Path.of("opdracht11_1.txt");
        BufferedReader reader = Files.newBufferedReader(p2);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
