public class Buch {
    private final String titel;
    private final String autor;
    private final int preis;
    private final int anzahlSeiten;

    public Buch(String titel, String autor, int preis, int anzahlSeiten) {
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public int getPreis() {
        return preis;
    }

    public int getAnzahlSeiten() {
        return anzahlSeiten;
    }

    @Override
    public String toString() {
        return titel + "(" + preis + " Euro)";
    }
}