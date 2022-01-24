import java.util.*;

class customStack {

    protected int[] data;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.print("Stack is full");
        }
        data[++ptr] = value;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("Stack is empty");
        }
        return data[ptr--];
    }

    public boolean isFull() {
        if (ptr == data.length - 1)
            return true;

        else
            return false;
    }

    public boolean isEmpty() {
        if (ptr == -1)
            return true;
        else
            return false;
    }
}

public class Stack {
    public static void main(String[] args) {
        customStack stack = new customStack(5);
        stack.push(1);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        System.out.println(stack.pop());
    }
}
