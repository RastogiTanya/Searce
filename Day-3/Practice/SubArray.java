
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        // ollenting input
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        // enteries in array
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        // traversing array
        for (int i = 0; i < n; i++) {
            // System.out.println(i + " i is ");

            // traversing for printing
            for (int j = i + 1; j <= n; j++) {
                // System.out.println(j + " j ");

                // printing whole line
                for (int k = i; k < j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

// Sample input
// 3
// 10
// 20
// 30

// Sample output
// 10
// 10 20
// 10 20 30
// 20
// 20 30
// 30