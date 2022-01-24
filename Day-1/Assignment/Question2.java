import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        for (int i = 1; i <= p; i++) {
            int a = scn.nextInt();
            LL.insertLast(a);
        }
        System.out.println("Output is: ");
        LL.print();
    }
}

class LinkedList {

    class Node {
        public Node(int value) {
            this.data = value;
            this.next = null;
        }

        int data;
        Node next;
    }

    public Node head = null;

    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void print() {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}
