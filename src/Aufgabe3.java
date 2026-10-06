public class Aufgabe3 {

    public int[] summe(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int s = num1[i] + num2[i] + carry;
            result[i + 1] = s % 10;
            carry = s / 10;
        }
        result[0] = carry;
        return result;
    }


    public int[] differenz(int[] num1, int[] num2) {
        int n = num1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int d = num1[i] - num2[i] - borrow;
            if (d < 0) {
                d += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = d;
        }
        return result;
    }
    public int[] multiplikation(int[] num, int ziffer) {
        int n = num.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int p = num[i] * ziffer + carry;
            result[i + 1] = p % 10;
            carry = p / 10;
        }
        result[0] = carry;
        return result;
    }

    public int[] division(int[] num, int ziffer) {
        int[] result = new int[num.length];
        int rest = 0;

        for (int i = 0; i < num.length; i++) {
            int cur = rest * 10 + num[i];
            result[i] = cur / ziffer;
            rest = cur % ziffer;
        }
        return result;
    }
}