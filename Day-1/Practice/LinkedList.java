
public class LinkedList {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertFirst(2);
        LL.insertFirst(22);
        LL.insertFirst(23);
        LL.insertFirst(24);
        LL.print();
        LL.insertLast(100);
        LL.print();
    }

    class Node {
        public Node(int value) {
            this.data = value;
            this.next = null;
        }

        int data;
        Node next;
    }

    public Node head = null;

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertLast(int value) {
        // System.out.println("ffff");

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
        // System.out.println("Nodes are as");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
