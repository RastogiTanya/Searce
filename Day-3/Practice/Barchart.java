import java.util.*;

public class Barchart {
    public static void main(String[] args) {
        // collecting input from user

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // size of array
        int[] arr = new int[n];

        // enteries in array
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // finding maximum element in array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // traversing all the numbers till maximum
        for (int i = max; i >= 1; i--) {

            // traversing array
            for (int j = 0; j < n; j++) {

                // printing star if element in array is greater than max at that moment
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }

}
