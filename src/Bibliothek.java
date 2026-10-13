import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Buch> Bucher;

    public Bibliothek(){
        this.Bucher = new ArrayList<Buch>(10);
    }

    public void addBuch(Buch buch){
        this.Bucher.add(buch);
    }

    public void getFromAuthor(String author){
        boolean isFound = false;
        for (Buch buch : this.Bucher){
            if (buch.getAutor() == author){
                isFound = true;
                System.out.println(buch.getTitel());
            }
        }
        if (!isFound){
            System.out.println();
        }
    }
    public void averagePages(){
        double totalPages = 0;
        for (Buch buch : this.Bucher){
            totalPages+=buch.getAnzahlDerSeiten();
        }
        System.out.printf("%.2f%n",totalPages/this.Bucher.size());
    }

    public void bucherImBuget(int buget){
        for (Buch buch : this.Bucher){
            if (buch.getPreis()<=buget){
                System.out.println(buch.getTitel());
            }
        }
    }
    public void teuerstesBuch(){
        int maxPreis = 0;
        Buch teuerstesBuch = null;
        for (Buch buch : this.Bucher){
            if (buch.getPreis()>maxPreis){
                maxPreis = buch.getPreis();
                teuerstesBuch = buch;
            }
        }
        System.out.println(teuerstesBuch.getTitel()+"("+teuerstesBuch.getPreis()+" Euro)");
    }
    public void bucherMindestSeitenAnzahl(int anzahl){
        for (Buch buch : this.Bucher){
            if (buch.getAnzahlDerSeiten()>=anzahl){
                System.out.println(buch.getTitel());
            }
        }
    }
    public void zweiBucherImBuget(int buget){
        Buch currentMax1 = null;
        Buch currentMax2 = null;
        int currentMaxPrice = -1;
        int currentMaxPages = -1;

        for (int i = 0; i < this.Bucher.size() - 1; i++){
            Buch buch1 = this.Bucher.get(i);
            for (int j = i + 1; j < this.Bucher.size(); j++){
                Buch buch2 = this.Bucher.get(j);
                int totalPrice = buch1.getPreis() + buch2.getPreis();
                int totalPages = buch1.getAnzahlDerSeiten() + buch2.getAnzahlDerSeiten();

                if (totalPrice <= buget
                        && (totalPrice > currentMaxPrice
                        || (totalPrice == currentMaxPrice && totalPages > currentMaxPages))) {
                    currentMax1 = buch1;
                    currentMax2 = buch2;
                    currentMaxPrice = totalPrice;
                    currentMaxPages = totalPages;
                }
            }
        }

        if (currentMax1 == null) {
            System.out.println();
            return;
        }

        System.out.println(currentMax1.getTitel() + " + " + currentMax2.getTitel());
        System.out.println("Gesamtpreis: " + currentMaxPrice + " Euro");
    }
}
