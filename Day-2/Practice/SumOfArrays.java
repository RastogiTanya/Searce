
import java.util.*;

public class SumOfArrays {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        // creating array 1
        int size1 = scn.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scn.nextInt();
        }
        // System.out.println(size1);

        // creating array 2
        int size2 = scn.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scn.nextInt();
        }
        // System.out.println(size2);
        int c = 0; // carry element

        // creating the array containing sum of elements of 2 arrays
        int[] sum = new int[size1 > size2 ? size1 : size2];
        int i = size1 - 1;
        int j = size2 - 1;
        int k = sum.length - 1;

        // till sum array is there
        while (k >= 0) {
            int d = c;

            // till the first array finishes
            if (i >= 0) {
                d += array1[i];
            }
            if (j >= 0) {
                d += array2[j];
            }
            // establishing carry
            c = d / 10;
            d = d % 10;

            // adding value to the array
            sum[k] = d;
            j--;
            k--;
            i--;

        }

        // printing carry if present at the end of the loop
        if (c != 0) {
            System.out.println(c);
        }

        for (int p = 0; p < sum.length; p++) {
            System.out.println(sum[p]);
        }

    }

}
