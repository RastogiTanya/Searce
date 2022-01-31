import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

    }

    public int findUnique(int a[], int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // System.out.print(i);
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            // System.out.println(m.getKey()+"......"+m.getValue());
            if (m.getValue() % k != 0) {
                return m.getKey();
            }
        }
        return -1;
    }
}
