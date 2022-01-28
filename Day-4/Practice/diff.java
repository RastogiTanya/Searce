import java.util.*;

public class diff {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long[] a = new long[(int) n];
        for (int i = (long) 0; i < n; i++)
            a[i] = scn.nextLong();
        long r = findDiff(a, n);
        System.out.println(r);
    }

    public static long findDiff(long arr[], long n) {
        HashMap<Long, Integer> hm = new HashMap<>();

        // inserting in hashmap the array value and its count
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i]))
                hm.put(arr[i], hm.get(arr[i]) + 1);

            else
                hm.put(arr[i], 1);

        }
        long MAX = Long.MIN_VALUE;
        long MIN = Long.MAX_VALUE;
        long res = (long) 0;

        // finding max and min
        for (Map.Entry<Long, Integer> m : hm.entrySet()) {
            if (m.getValue() > MAX) {
                MAX = m.getValue();
            }
            if (m.getValue() < MIN) {
                MIN = m.getValue();
            }
            res = MAX - MIN;
        }
        return res;
    }
}
