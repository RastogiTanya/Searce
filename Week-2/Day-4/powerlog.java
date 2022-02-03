
import java.io.*;
import java.util.*;

// supports the logic x^n= x^(n/2) * x^(n/2).
// Therefore time complexity is log (n)
public class powerlog {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnb2 = power(x, n / 2);
        int xn = xpnb2 * xpnb2;
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }

}