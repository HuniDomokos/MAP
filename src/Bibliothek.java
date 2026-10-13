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

}
