import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = scn.nextInt();
        int result = doUnion(a, n, b, m);
        System.out.println(result);
    }

    public static int doUnion(int a[], int n, int b[], int m) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(a[i]);

        for (int i = 0; i < m; i++)
            set.add(b[i]);
        return set.size();

    }
}