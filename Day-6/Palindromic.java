import java.util.*;

import javax.security.auth.Subject;

public class Palindromic {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static void solution(String str) {
        // write your code here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }

    }

    public static boolean isPalindrome(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < j; i++) {
            if (str.charAt(i) == str.charAt(j)) {
                j--;
            } else {
                return false;
            }

        }
        return true;

    }
}
// abcc --> a b c cc