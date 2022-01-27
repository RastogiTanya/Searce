import java.util.*;
import java.beans.Customizer;
import java.io.*;

class pair implements Comparable<pair> {
    int t;
    int tp;

    pair(int t, int tp) {
        this.t = t;
        this.tp = tp;
    }

    public int compareTo(pair o) {
        return this.tp - o.tp;
    }
}

public class minAvgTime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            ArrayList<Integer> time = new ArrayList<>();
            time.add(scn.nextInt());
            time.add(scn.nextInt());
            arr.add(time);
        }
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        long sum = (long) 0;
        long currTime = (long) 0;
        PriorityQueue<pair> pq = new PriorityQueue<>();

        while (!pq.isEmpty() || !arr.isEmpty()) {
            if (pq.isEmpty()) {
                pq.add(new pair(arr.get(0).get(0), arr.get(0).get(1)));
                arr.remove(0);
            } else {
                pair x = pq.poll();
                if (x.t > currTime) {
                    currTime = (long) x.t;
                }

                long avgTime = currTime + (long) x.tp - (long) x.t;
                currTime = currTime + (long) x.tp;
                sum += avgTime;

                while (arr.size() > 0 && arr.get(0).get(0) <= currTime) {
                    pq.add(new pair(arr.get(0).get(0), arr.get(0).get(1)));
                    arr.remove(0);
                }
            }
        }
        System.out.println(sum / (long) n);
    }

}