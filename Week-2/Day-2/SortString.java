import java.util.*;

public class SortString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        sort(str);

    }

    public static void sort(String str) {

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(String.valueOf(arr));
    }
}