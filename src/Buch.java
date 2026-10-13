public class Buch {
    private String Titel;
    private String Autor;
    private int Preis;
    private int AnzahlDerSeiten;

    public Buch(String Titel, String Autor, int Preis, int AnzahlDerSeiten){
        this.Titel = Titel;
        this.Autor = Autor;
        this.Preis = Preis;
        this.AnzahlDerSeiten = AnzahlDerSeiten;
    }
    public String getTitel() {
        return Titel;
    }
    public String getAutor() {
        return Autor;
    }
    public int getPreis() {
        return Preis;
    }
    public int getAnzahlDerSeiten() {
        return AnzahlDerSeiten;
    }

}
