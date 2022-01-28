import java.util.*;

public class multiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {

        int con1 = getDecimalValue(n1, b);
        int con2 = getDecimalValue(n2, b);
        int con = con1 * con2;
        return getBaseValue(con, b);
    }

    public static int getDecimalValue(int n, int b) {
        int p = 1;
        int rs = 0;
        while (n > 0) {
            int d = n % 10;
            rs += p * d;
            n = n / 10;
            p = p * b;
        }
        return rs;
    }

    public static int getBaseValue(int n, int b) {
        int p = 1; // Power variable - increases places
        int rv = 0; // Return value - stores answer
        while (n > 0) {
            int dig = n % b; // Digit-stores remainder at each step
            rv += (dig * p); // placing digit at right place
            p *= 10; // increasing power; to the next place
            n = n / b; // dividing the number by base number
        }
        return rv;
    }
}
