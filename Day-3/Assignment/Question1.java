import java.util.*;
import java.beans.Customizer;
import java.io.*;

public class minAvgTime {

    // static void go() {
    // int n = in.nextInt();
    // Customer[] c = new Customer[n];
    // for (int i = 0; i < n; i++) {
    // c[i] = new Customer(in.nextInt(), in.nextInt());
    // }
    // Arrays.sort(c, Customer.Order.ByT.ascending());

    // PriorityQueue<Customer> q = new PriorityQueue<Customer>(n,
    // Customer.Order.ByL.ascending());
    // long time = c[0].t;
    // int idx = 0;
    // while (idx < n && c[idx].t <= time) {
    // q.add(c[idx]);
    // idx++;
    // }

    // long wait = 0;
    // while (q.size() > 0) {
    // Customer next = q.poll();
    // time += next.l;
    // wait += time - next.t;

    // if (idx < n && q.size() == 0 && time < c[idx].t) {
    // time = c[idx].t;
    // }
    // while (idx < n && c[idx].t <= time) {
    // q.add(c[idx]);
    // idx++;
    // }
    // }
    // out.println(wait / n);
    // }

    // public static class Customer implements Comparable<Customer> {
    // public Long t, l;

    // public Customer(long t1, long l1) {
    // this.t = t1;
    // this.l = l1;
    // }
    // public compareTo{

    // }
    // public static enum Order implements Comparator<Customer> {
    // ByT() {
    // public int compare(Customer c1, Customer c2) {
    // return c1.t.compareTo(c2.t);
    // }
    // },
    // ByL() {
    // public int compare(Customer c1, Customer c2) {
    // return c1.l.compareTo(c2.l);
    // }
    // };

    // public abstract int compare(Customer c1, Customer c2);

    // public Comparator ascending() {
    // return this;
    // }

    // public Comparator descending() {
    // return Collections.reverseOrder(this);
    // }
    // }
    // }

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
        Collections.sort(arr, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        int sum = 0;
        int currTime = 0;
        for (int j = 0; j < n; j++) {
            if (arr.get(j).get(0) > currTime) {
                currTime += arr.get(j).get(0);
            }
            int avgTime = currTime + arr.get(j).get(1) - arr.get(j).get(0);
            currTime += arr.get(j).get(1);
            sum += avgTime;
            // System.out.println(avgTime);
        }
        System.out.println(sum / n);
    }

}