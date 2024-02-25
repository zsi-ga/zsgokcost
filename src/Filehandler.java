/*
 * Refaktorálás Zsiga Gergely, Szoft/II/1/E, 2024-02-25.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filehandler {

    public void writeToFile(Koltseg k) {

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("adat.txt", true));
            pw.write(k.szallitas.toString());
            pw.write(":");
            pw.write(k.uzlet.toString());
            pw.write(":");
            pw.write(k.javitas.toString());
            pw.write("\n");
            pw.close();

        } catch (IOException e) {
            System.err.println("Hiba a fájl írásakor!" + e.getMessage());
        }
    }

}