import java.util.ArrayList;

public class Bibliothek {
    private ArrayList<Buch> Bucher;

    public Bibliothek(){
        this.Bucher = new ArrayList<Buch>(10);
    }

    public void addBuch(Buch buch){
        this.Bucher.add(buch);
    }
}
