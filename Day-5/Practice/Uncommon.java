import java.util.*;

public class Uncommon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A = scn.nextLine();
        String B = scn.nextLine();
        String str = UncommonChars(A, B);
        System.out.println(str);
    }

    public static String UncommonChars(String A, String B) {
        // code here
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (hm.containsKey(A.charAt(i))) {
                hm.put(A.charAt(i), hm.get(A.charAt(i)) + 1);
            } else {
                hm.put(A.charAt(i), 1);
            }
        }
        for (int i = 0; i < B.length(); i++) {
            if (hm.containsKey(B.charAt(i))) {
                if (hm.get(B.charAt(i)) > 0)
                    hm.put(B.charAt(i), hm.get(B.charAt(i)) - 1);
                else
                    hm.put(B.charAt(i), 1);
            } else {
                hm.put(B.charAt(i), 1);
            }
        }

        TreeMap<Character, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(hm);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {

            if (entry.getValue() > 1) {

                int a = entry.getValue();
                while (a > 0) {
                    sb.append(entry.getKey());
                    a--;
                }
            } else {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();

    }
}
