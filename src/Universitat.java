import java.util.Arrays;

public class Universitat{
    public int[] nichtAusreichendeNoten(int Noten[]){
     int tmp[] = new int[Noten.length];
     int index=0;
     for (int i=0; i<Noten.length; i++){
         if (Noten[i] < 40) {
            tmp[index++] = Noten[i];
         }
     }
     return Arrays.copyOf(tmp, index);
    }

    public double Durchschnitt(int Noten[]){
        int count =0;
        int sum =0;
        for (int i=0; i<Noten.length; i++){
            sum+=Noten[i];
            count++;
        }
        return (double)sum/count;
    }

    public int[] Abgerundet(int Noten[]){
        int tmp[] = new int[Noten.length];
        for (int i=0; i<Noten.length; i++){
            if (Noten[i] < 38) {
                tmp[i] = Noten[i];
                continue;
            }
            int rest = Noten[i]%5;
            if(rest != 0 && 5-rest<3){
                tmp[i] = Noten[i] + 5-rest;
            }
            else {
                tmp[i] = Noten[i];
            }
        }
        return tmp;
    }

    public int maxAbgerundet(int Noten[]){
        int[] tmp = Abgerundet(Noten);
        int max =-1;
        for (int i=0; i<tmp.length; i++){
            if (tmp[i]>max) max = tmp[i];
        }
        return max;
    }
}
