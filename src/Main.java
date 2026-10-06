import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Universitat U = new Universitat();
        int[] Noten = new int[] {29, 37, 38, 41, 84, 67};
        System.out.println("Nicht ausreichende Noten: " + Arrays.toString(U.nichtAusreichendeNoten(Noten)));
        System.out.printf("Durchschnitt: %.2f%n" ,U.Durchschnitt(Noten));
        System.out.println("Abgerundete Noten: " + Arrays.toString(U.Abgerundet(Noten)));
        System.out.println("Maximale abgerundete Note: " + U.maxAbgerundet(Noten));
    }
}