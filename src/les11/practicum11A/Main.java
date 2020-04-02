package les11.practicum11A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);  // Zorgt voor . ipv , bij decimalen
        boolean oudeFileGoed = false;
        while (!oudeFileGoed) {
            try {
                System.out.print("Bestandsnaam oude gegevens: ");
                Scanner oldFilenameScanner = new Scanner(System.in);
                String oldFile = oldFilenameScanner.nextLine();
                Path oldPath = Path.of(oldFile);
                BufferedReader oldFileReader = Files.newBufferedReader(oldPath);

                boolean nieuweFileGoed = false;
                while (!nieuweFileGoed) {
                    try {
                        System.out.print("Bestandsnaam nieuwe gegevens: ");
                        Scanner newFilenameScanner = new Scanner(System.in);
                        String newFile = newFilenameScanner.nextLine();
                        Path newPath = Path.of(newFile);
                        BufferedWriter writer = Files.newBufferedWriter(newPath, StandardOpenOption.CREATE_NEW);

                        boolean geldigeWaarde = false;
                        while (!geldigeWaarde) {
                            try {
                                System.out.print("De waarde van 1 US dollar in Eurocenten: ");
                                Scanner currencyScanner = new Scanner(System.in);
                                double currency = Double.parseDouble(currencyScanner.nextLine());
                                geldigeWaarde = true;
                                Scanner oldFileScanner = new Scanner(oldFileReader);
                                oldFileScanner.useDelimiter("( : )|\\r?\\n");
                                ArrayList<String> result = new ArrayList<String>();
                                try {
                                    while (oldFileScanner.hasNext()) {
                                        result.add(oldFileScanner.next() + " : " +
                                                String.format("%.2f", Double.parseDouble(oldFileScanner.next()) * currency / 100));
                                    }

                                    for (int i = 0; i < result.size(); i++) {
                                        writer.write(result.get(i));
                                        if (i != result.size() - 1) {
                                            writer.newLine();
                                        }
                                    }
                                    writer.close();
                                } catch (NoSuchElementException e) {
                                    System.out.println("Dit is een ongeldig bestand.");
                                    writer.flush();
                                    writer.close();
                                    Files.delete(newPath);
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Dat is geen geldige waarde. Probeer het nog eens.");
                            }
                        }
                        nieuweFileGoed = true;
                    } catch (FileAlreadyExistsException e) {
                        System.out.println("Er bestaat al een bestand met die naam. Probeer het nog eens.");
                    } catch (IOException e) {
                        System.out.println("Er is een onbekende fout opgetreden: " + e.getLocalizedMessage());
                    }
                }
                oudeFileGoed = true;
            } catch (AccessDeniedException e) {
                System.out.println("Je hebt geen toegang om dit bestand te lezen.");
            } catch (NoSuchFileException e) {
                System.out.println("Dat bestand bestaat niet. Probeer het nog eens.");
            } catch (IOException e) {
                System.out.println("Er is een onbekende fout opgetreden: " + e.getLocalizedMessage());
            }
        }
    }
}