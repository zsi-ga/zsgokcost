/*
 * Refaktorálás Zsiga Gergely, Szoft/II/1/E, 2024-02-25.
 */

import java.util.Scanner;

public class MainConsole {

    String szallitas = "";
    String uzlet = "";
    String javitas = "";

    public MainConsole() {

        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("──────────────────────────────────────────");
            System.out.print("Szállítási költség: ");
            szallitas = scanner.nextLine();

            System.out.println("──────────────────────────────────────────");
            System.out.print("Üzleti költség: ");
            uzlet = scanner.nextLine();

            System.out.println("──────────────────────────────────────────");
            System.out.print("Javítási költség: ");
            javitas = scanner.nextLine();
        }

        Koltseg k = new Koltseg(szallitas, uzlet, javitas);
        Filehandler filehandler = new Filehandler();
        filehandler.writeToFile(k);
    }

}
