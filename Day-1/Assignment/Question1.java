import java.util.*;

public class Question1 {
    public static int[] reverseArray(int[] arr) {
        int j = 0;
        for (int i = arr.length - 1; i > j; i--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Q = scn.nextInt();
        int[] P = new int[Q];
        for (int i = 0; i < Q; i++) {

            P[i] = scn.nextInt();
        }
        reverseArray(P);
        for (int i = 0; i < Q; i++) {
            System.out.print(P[i] + " ");
        }

    }

}