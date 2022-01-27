import java.util.*;

public class Equality {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scn.nextLong();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scn.nextLong();
        }
        System.out.println(check(A, B, N));
    }

    public static boolean check(long[] A, long[] B, int N) {

        HashMap<Long, Integer> hm = new HashMap<>();

        // Going through the First Array and increasing the number of occurences by 1
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], +1);
            }
        }

        // Going through the Second Array and decreasing the number of occurences by 1
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(B[i])) {
                hm.put(B[i], hm.get(B[i]) - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry<Long, Integer> m : hm.entrySet()) {
            if (m.getValue() != 0) {
                return false;
            }
        }
        return true;

    }
}
