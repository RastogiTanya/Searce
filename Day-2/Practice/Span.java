
import java.util.*;

public class Span {

    public static void main(String[] args) {
        // write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        for (int i = 0; i < size; i++) {
            int input = scn.nextInt();
            if (input > max) {
                max = input;

            }
            if (input < min) {
                min = input;
            }
        }
        int res = max - min;
        System.out.println(res);

    }

}
