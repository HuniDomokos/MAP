import java.util.Arrays;

public class Elektronik_shop {
    public int[] Tastatur;
    public int[] USB;
    
    public int billigste_tastatur(){
        int min = Tastatur[0];
        for(int i =1;i< Tastatur.length;i++){
            if (min > Tastatur[i]) min = Tastatur[i];
        }
        return min;
    }
    public int teuerster_gegenstand(){
        int max = Tastatur[0];
        for(int i =1;i< Tastatur.length;i++){
            if (max < Tastatur[i]) max = Tastatur[i];
        }
        for(int i =0;i< USB.length;i++){
            if (max < USB[i]) max = USB[i];
        }
        return max;
    }
    public int teuerstes_usb(int budget){
        int max = -1;
        for(int i =0;i< USB.length;i++){
            if (max < USB[i] && USB[i]<budget) max = USB[i];
        }
        return max;
    }
    public int max_ausgeben(int budget) {
        Arrays.sort(Tastatur);
        Arrays.sort(USB);
        int i = Tastatur.length - 1;
        int j = USB.length-1;
        while (i >= 0) {
            while(Tastatur[i] + USB[j]> budget && j>0){
                j--;
            }
            if(Tastatur[i]+USB[j]<=budget) return Tastatur[i]+USB[j];
            else{
                i--;
                j= USB.length-1;
            }
        }
        return -1;
    }
}
