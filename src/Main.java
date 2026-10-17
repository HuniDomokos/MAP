import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addBuch(new Buch("Clean Code", "Robert Martin", 45, 464));
        bibliothek.addBuch(new Buch("1984", "George Orwell", 18, 328));
        bibliothek.addBuch(new Buch("Animal Farm", "George Orwell", 12, 112));
        bibliothek.addBuch(new Buch("Java Basics", "Max Müller", 35, 520));
        bibliothek.addBuch(new Buch("The Hobbit", "J. R. R. Tolkien", 28, 310));

        System.out.println("1. Bücher von George Orwell:");
        gebeBuecherAus(bibliothek.getFromAuthor("George Orwell"));

        System.out.println("\n1. Bücher von einem unbekannten Autor:");
        gebeBuecherAus(bibliothek.getFromAuthor("Unbekannt"));

        System.out.println("\n2. Durchschnittliche Seitenanzahl:");
        System.out.printf("%.2f%n", bibliothek.averagePages());

        System.out.println("\n3. Bücher bis 30 Euro:");
        gebeBuecherAus(bibliothek.bucherImBuget(30));

        System.out.println("\n4. Teuerstes Buch:");
        Buch teuerstesBuch = bibliothek.teuerstesBuch();
        if (teuerstesBuch == null) {
            System.out.println("Keine Bücher vorhanden.");
        } else {
            System.out.println(formatiereBuch(teuerstesBuch));
        }

        System.out.println("\n5. Bücher mit mindestens 300 Seiten:");
        gebeBuecherAus(bibliothek.bucherMindestSeitenAnzahl(300));

        System.out.println("\n6. Zwei Bücher mit Budget 55 Euro:");
        gebeBuchPaarAus(bibliothek.zweiBucherImBuget(55));

        System.out.println("\n6. Zwei Bücher mit Budget 20 Euro:");
        gebeBuchPaarAus(bibliothek.zweiBucherImBuget(20));
    }

    private static void gebeBuecherAus(ArrayList<Buch> buecher) {
        if (buecher == null || buecher.isEmpty()) {
            System.out.println("Keine Bücher gefunden.");
            return;
        }
        for (Buch buch : buecher) {
            System.out.println(formatiereBuch(buch));
        }
    }

    private static void gebeBuchPaarAus(ArrayList<Buch> paar) {
        if (paar == null) {
            System.out.println("Keine zwei Bücher innerhalb des Budgets gefunden.");
            return;
        }
        Buch erstes = paar.get(0);
        Buch zweites = paar.get(1);
        System.out.println(erstes.getTitel() + " + " + zweites.getTitel());
        System.out.println("Gesamtpreis: " + (erstes.getPreis() + zweites.getPreis()) + " Euro");
    }

    private static String formatiereBuch(Buch buch) {
        return buch.getTitel() + " (" + buch.getPreis() + " Euro)";
    }
}