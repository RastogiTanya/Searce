public class StacKLL {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(12);
        obj.push(11);
        obj.push(10);

        int p = obj.pop();
        System.out.println(p);
    }

}

class MyStack {
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode newNode = new StackNode(a);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;

    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if (top == null) {
            return -1;
        }
        int d = top.data;
        top = top.next;
        return d;

    }
}

class StackNode {
    int data;
    StackNode next;

    StackNode(int value) {
        this.data = value;
        this.next = null;
    }

}
