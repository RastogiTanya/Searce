import java.util.*;

public class repea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char result = firstRep(str);
        System.out.println(result);
    }

    public static char firstRep(String S) {
        // your code here
        int[] freq = new int[256];
        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i)]++;
        }
        for (int i = 0; i < S.length(); i++) {
            if (freq[S.charAt(i)] > 1) {
                return S.charAt(i);
            }
        }

        return '#';
    }
}
