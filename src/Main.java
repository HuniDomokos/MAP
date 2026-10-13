public class Main{
    public static void main(String[] args){
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addBuch(new Buch("Clean Code","Robert Martin",45,464));
        bibliothek.addBuch(new Buch("1984","George Orwell",18,328));
        bibliothek.addBuch(new Buch("Animal Farm","George Orwell",12,112));
        bibliothek.addBuch(new Buch("Java Basics","Max Müller",35,520));
        bibliothek.addBuch(new Buch("The Hobbit","J. R. R. Tolkien",28,310));

        System.out.println("Bucher von George Orwell: ");
        bibliothek.getFromAuthor("George Orwell");

        System.out.println("Durchschnittliche Seitenanzahl: ");
        bibliothek.averagePages();

        System.out.println("Bucher unter 30 Euro: ");
        bibliothek.bucherImBuget(30);

        System.out.println("Das teuerste Buch: ");
        bibliothek.teuerstesBuch();

        System.out.println("Bucher mit mindestens 300 Seiten: ");
        bibliothek.bucherMindestSeitenAnzahl(300);

        System.out.println("2 Bucher innerhalb von 55 Euro:");
        bibliothek.zweiBucherImBuget(55);
    }
}