public class Aufgabe2 {
    public int min(int Zahlen[]){
        int min =Zahlen[0];
        for(int j=1;j<Zahlen.length;j++){
            if (Zahlen[j]<min) min = Zahlen[j];
        }
        return min;
    }

    public int max(int Zahlen[]){
        int max =Zahlen[0];
        for(int j=1;j<Zahlen.length;j++){
            if (Zahlen[j]>max) max = Zahlen[j];
        }
        return max;
    }

    public int maxSum(int Zahlen[]){
        int sum=0;
        for(int j=0;j<Zahlen.length;j++){
            sum+=Zahlen[j];
        }
        return sum-min(Zahlen);
    }

    public int minSum(int Zahlen[]){
        return maxSum(Zahlen)+min(Zahlen)-max(Zahlen);
    }
}
