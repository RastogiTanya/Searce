import java.util.*;

public class D2b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        getValueInBase(n, b);

        // int dn = getValueInBase(n, b);
        // System.out.println(dn);
    }

    public static void getValueInBase(int n, int b) {
        // write code here

        int q = n / b;
        // System.out.print(q + "q");
        int r = n % b;
        if (q != 0) {

            getValueInBase(q, b);

        }
        System.out.print(r);
    }
}
