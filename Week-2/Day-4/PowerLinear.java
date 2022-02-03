
import java.io.*;
import java.util.*;

// supports the logic x^n= x * x *x ..... n times
// Therefore time complexity is n
public class PowerLinear {

    public static void main(String[] args) {
        // x raised to power of n
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int a = power(x, n - 1);
        return x * a;

    }

}