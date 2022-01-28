import java.util.*;

public class anytoany {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int a = getValueIndecimal(n, sourceBase);
        int b = getValueInBase(a, destBase);
        System.out.print(b);
    }

    public static int getValueInBase(int n, int b) {
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

    public static int getValueIndecimal(int n, int sourceBase) {

        int p = 1;// Power variable - increases places
        int rs = 0;// Return value - stores answer
        while (n > 0) {
            int d = n % 10;
            rs += p * d;
            n = n / 10;
            p = p * sourceBase;
        }
        return rs;
    }
}
