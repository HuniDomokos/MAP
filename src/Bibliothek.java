import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Buch> Bucher;

    public Bibliothek(){
        this.Bucher = new ArrayList<Buch>(10);
    }

    public void addBuch(Buch buch){
        this.Bucher.add(buch);
    }

    public ArrayList getFromAuthor(String author){
        ArrayList<Buch> result = new ArrayList<Buch>(1);
        boolean isFound = false;
        for (Buch buch : this.Bucher){
            if (buch.getAutor().equals(author)){
                isFound = true;
                result.add(buch);
            }
        }
        if (!isFound){
            return null;
        }
        return result;
    }
    public double averagePages(){
        double totalPages = 0;
        for (Buch buch : this.Bucher){
            totalPages+=buch.getAnzahlSeiten();
        }
        return totalPages/this.Bucher.size();
    }

    public ArrayList<Buch> bucherImBuget(int buget){
        ArrayList<Buch> result = new ArrayList<Buch>(1);
        for (Buch buch : this.Bucher){
            if (buch.getPreis()<=buget){
                result.add(buch);
            }
        }
        return result;
    }
    public Buch teuerstesBuch(){
        int maxPreis = 0;
        Buch teuerstesBuch = null;
        for (Buch buch : this.Bucher){
            if (buch.getPreis()>maxPreis){
                maxPreis = buch.getPreis();
                teuerstesBuch = buch;
            }
        }
        return teuerstesBuch;
    }
    public ArrayList<Buch> bucherMindestSeitenAnzahl(int anzahl){
        ArrayList<Buch> result = new ArrayList<Buch>(1);
        for (Buch buch : this.Bucher){
            if (buch.getAnzahlSeiten()>=anzahl){
                result.add(buch);
            }
        }
        return result;
    }
    public ArrayList<Buch> zweiBucherImBuget(int buget){
        ArrayList<Buch> result = new ArrayList<Buch>(2);
        Buch currentMax1 = null;
        Buch currentMax2 = null;
        int currentMaxPrice = -1;
        int currentMaxPages = -1;

        for (int i = 0; i < this.Bucher.size() - 1; i++){
            Buch buch1 = this.Bucher.get(i);
            for (int j = i + 1; j < this.Bucher.size(); j++){
                Buch buch2 = this.Bucher.get(j);
                int totalPrice = buch1.getPreis() + buch2.getPreis();
                int totalPages = buch1.getAnzahlSeiten() + buch2.getAnzahlSeiten();

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
            return null;
        }

        result.add(currentMax1);
        result.add(currentMax2);
        return result;
    }
}
