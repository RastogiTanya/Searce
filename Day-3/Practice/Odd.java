import java.util.*;

public class Odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // size of array
        int n = scn.nextInt();
        int[] arr = new int[n];

        // enteries of array
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        //
        System.out.print(getOddOccurrence(arr, n));
    }

    public static int getOddOccurrence(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getValue() % 2 != 0) {
                i = m.getKey();
            }
        }
        return i;
    }
}
