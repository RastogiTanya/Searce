import java.util.*;

public class firstKtimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int res = firstElementKTime(a, n, k);
        System.out.println(res);
    }

    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(a[i]))
                hm.put(a[i], hm.get(a[i]) + 1);
            else
                hm.put(a[i], 1);
            if (hm.get(a[i]) == k)
                return a[i];
        }
        return -1;
    }
}
