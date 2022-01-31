import java.util.*;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String a = reverseString(str);
        System.out.println(a);
    }

    public static String reverseString(String s) {
        // code here.
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            // System.out.println(i);
            if (hm.containsKey(s.charAt(i)) || s.charAt(i) == ' ') {
                // System.out.print(".......");
                continue;
                // sb.append(s.charAt(i));
                // return sb.toString();
            } else {
                hm.put(s.charAt(i), 1);
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
