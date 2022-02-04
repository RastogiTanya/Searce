import java.util.Scanner;

public class fakeProfile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String a = solve(s);
        System.out.println(a);
    }

    public static String solve(String a) {
        // code here
        String s = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                continue;
            } else if (hm.containsKey(a.charAt(i))) {
                hm.put(a.charAt(i), hm.get(a.charAt(i)) + 1);
            } else {
                hm.put(a.charAt(i), 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> m : hm.entrySet()) {
            count++;
        }
        if (count % 2 != 0) {
            s += "HE!";
            return s;
        }
        s += "SHE!";
        return s;
    }

}
