import java.util.*;
import java.io.*;

public class Queues {

    // Function to reverse the queue.
    public static Queue<Integer> rev(Queue<Integer> q) {
        // add code here.
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.remove());

        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());

        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(11);
        q.add(12);
        q.add(13);
        // while (!q.isEmpty()) {
        // System.out.print(q);
        // q.
        // }
        q = rev(q);
        while (!q.isEmpty()) {
            int element = q.peek();
            q.poll();
            System.out.print(element + " ");
        }
    }
}
