import java.util.*;

public class KthFactor {
    public static int factor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        if (n < 0 || k <= 0) {
            return -1;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (k > list.size()) {
            return -1; // If k is greater than the number of factors, return -1
        }

        return list.get(k - 1); // k-1 because list is 0-indexed
    }

    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        System.out.println("The value is " + factor(n, k));
    }
}
