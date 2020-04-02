package dict_rewrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pOud = Path.of("dictOud.txt");
        BufferedReader reader = Files.newBufferedReader(pOud);
        String lineOld = reader.readLine();
        ArrayList<String> input = new ArrayList<String>();
        while (lineOld != null) {
            input.add(lineOld);
            lineOld = reader.readLine();
        }
        reader.close();

        ArrayList<String> result = new ArrayList<String>();
        result.add("<component name=\"ProjectDictionaryState\">");
        result.add("  <dictionary name=\"martijn\">");
        result.add("    <words>");
        for (String lineNew : input) {
            result.add("      <w>" + lineNew + "</w>");
        }
        result.add("    </words>");
        result.add("  </dictionary>");
        result.add("</component>");

        Path pNieuw = Path.of("dictNieuw.txt");
        BufferedWriter writer = Files.newBufferedWriter(pNieuw);
        for (String lineNew : result) {
            writer.write(lineNew);
            writer.newLine();
            System.out.println(lineNew);
        }
        writer.close();
    }
}
