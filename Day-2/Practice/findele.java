import java.util.*;

public class findele {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        int number = scn.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                System.out.println(i);
                break;
            } else if (i == size - 1) {
                System.out.println(-1);
            }
        }

    }
}
