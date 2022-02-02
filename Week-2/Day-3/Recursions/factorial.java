import java.util.*;

public class factorial {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int a = factorial(n - 1);
        return a * n;
    }
}
