import java.util.*;

public class FirstLast {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        // the number whose indexes we have to find
        int n = scn.nextInt();
        int low = 0;
        int high = size - 1;
        int last_index = -1;
        int first_index = -1;

        // for last index applying binary search
        while (low <= high) {
            int mid = (high + low) / 2;
            if (n < arr[mid]) {
                high = mid - 1;
            } else if (n > arr[mid]) {
                low = mid + 1;
            } else {
                last_index = mid;
                low = mid + 1;
            }

        }
        // for first index
        low = 0;
        high = size - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (n < arr[mid]) {
                high = mid - 1;
            } else if (n > arr[mid]) {
                low = mid + 1;
            } else {
                first_index = mid;
                high = mid - 1;
            }

        }
        System.out.println(first_index);
        System.out.println(last_index);

    }

}
