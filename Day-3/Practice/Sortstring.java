import java.lang.*;
import java.util.*;

public class Sortstring {
    public static void main(String[] args) {
        // code
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> arr = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            arr.add(scn.next());
        }
        for (int i = 0; i < n; i++) {

            String str = arr.get(i);
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {

                char character = str.charAt(j); // This gives the character 'a'
                int ascii = (int) character;

                if (hm.containsKey(ascii)) {
                    hm.put(ascii, hm.get(ascii) + 1);
                } else {
                    hm.put(ascii, 1);
                }
            }
            TreeMap<Integer, Integer> tm = new TreeMap<>(hm);
            Iterator itr = tm.keySet().iterator();
            while (itr.hasNext()) {
                int key = (int) itr.next();
                char ch = (char) key;

                System.out.println("Roll no:  " + ch + "     name:   " + hm.get(key));
            }

        }

    }
}