import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Universitat U = new Universitat();
        int[] Noten = new int[] {29, 37, 38, 41, 84, 67};
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(U.nichtAusreichendeNoten(Noten)));
        System.out.printf("Durchschnitt: %.2f%n" ,U.Durchschnitt(Noten));
        System.out.println("Abgerundete Noten: " + Arrays.toString(U.Abgerundet(Noten)));
        System.out.println("Maximale abgerundete Note: " + U.maxAbgerundet(Noten));
        int[] Zahlen = new int[] {4, 8, 3, 10, 17};
        Aufgabe2 aufg2 = new Aufgabe2();
        System.out.println("Maximale Zahl: " + aufg2.max(Zahlen));
        System.out.println("Minimale Zahl: " + aufg2.min(Zahlen));
        System.out.println("Maximale Summe von n-1 Zahlen : " + aufg2.maxSum(Zahlen));
        System.out.println("Minimale Summe von n-1 Zahlen: " + aufg2.minSum(Zahlen));
    }
}