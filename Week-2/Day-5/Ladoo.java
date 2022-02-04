import java.util.*;

public class Ladoo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }
        int numberOfFriendsRemaining = divideLadoo(N, A);
        System.out.println(numberOfFriendsRemaining);
    }

    static int divideLadoo(int N, int[] A) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {

            if (m.getValue() > 1) {
                count += m.getValue() - 1;
            }
        }
        return A.length - count;
    }
}
