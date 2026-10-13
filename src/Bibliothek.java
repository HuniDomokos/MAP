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
    public double averagePages(){
        double totalPages = 0;
        for (Buch buch : this.Bucher){
            totalPages+=buch.getAnzahlDerSeiten();
        }
        return totalPages/this.Bucher.size();
    }

    public void bucherImBuget(int buget){
        for (Buch buch : this.Bucher){
            if (buch.getAnzahlDerSeiten()<=buget){
                System.out.println(buch.getAutor());
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
        System.out.println(teuerstesBuch.getPreis()+"("+teuerstesBuch.getPreis()+" Euro)");
    }
    public void bucherMindestSeitenAnzahl(int anzahl){
        for (Buch buch : this.Bucher){
            if (buch.getAnzahlDerSeiten()>=anzahl){
                System.out.println(buch.getPreis()+"("+buch.getPreis()+" Euro)");
            }
        }
    }
    public void zweiBucherImBuget(int buget){
        Buch buch1;
        Buch buch2;
        Buch currentMax1 = null;
        Buch currentMax2 = null;
        for(int i = 0; i < this.Bucher.size(); i++){
            buch1 = this.Bucher.get(i);
            for (int j= i; j<this.Bucher.size();j++){
                buch2 = this.Bucher.get(j);
                if (buch1.getPreis() + buch2.getPreis() > buget) continue;
                if(buch1.getPreis() + buch2.getPreis() < buget && buch1.getPreis() + buch2.getPreis() < currentMax1.getPreis() + currentMax2.getPreis()){
                    currentMax1 = buch1;
                    currentMax2 = buch2;
                }
                if (buch1.getPreis() + buch2.getPreis()== currentMax1.getPreis()+currentMax2.getPreis()){
                    if (buch1.getAnzahlDerSeiten() + buch2.getAnzahlDerSeiten() > currentMax1.getAnzahlDerSeiten() + currentMax2.getAnzahlDerSeiten()){
                        currentMax1 = buch1;
                        currentMax2 = buch2;
                    }
                }
            }
        }
        System.out.println(currentMax1.getTitel() + " + " + currentMax2.getTitel());
        System.out.println("Gesamtpreis: " + (currentMax1.getPreis() + currentMax2.getPreis()) + " Euro");
    }
}
