/*
 * Refaktorálás Zsiga Gergely, Szoft/II/1/E, 2024-02-25.
 */

public class Koltseg {
    Double szallitas;
    Double uzlet;
    Double javitas;

    public Koltseg(String szallitas, String uzlet, String javitas) {
        this.szallitas = Double.parseDouble(szallitas);
        this.uzlet = Double.parseDouble(uzlet);
        this.javitas = Double.parseDouble(javitas);
    }

}
