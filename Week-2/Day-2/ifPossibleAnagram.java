import java.util.*;

public class ifPossibleAnagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(isPossible(str));
    }

    public static boolean isPossible(String S) {
        // your code here
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (hm.containsKey(S.charAt(i))) {
                hm.put(S.charAt(i), hm.get(S.charAt(i)) + 1);
            } else {
                hm.put(S.charAt(i), 1);
            }
        } // based on string length possibility of becoming a palindrom is depended
        if (S.length() % 2 == 0) {
            // System.out
            for (Map.Entry<Character, Integer> m : hm.entrySet()) {
                if (m.getValue() % 2 != 0) {
                    return 0;
                }
            }
            return 1;
        } else {

            int odd = 0;
            // there should be only 1 number in the string repeating odd times.
            for (Map.Entry<Character, Integer> m : hm.entrySet()) {
                if (m.getValue() % 2 != 0) {
                    odd++;
                }

            }
            if (odd == 1) {
                return 1;
            } else {
                return 0;
            }
        }

    }
}
