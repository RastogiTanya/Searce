import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        Stack stack = new Stack(size);
        for (int i = 0; i < size; i++) {
            int a = scn.nextInt();
            switch (a) {
                case 1:
                    int num = scn.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int res = stack.getMax();
                    if (res == Integer.MIN_VALUE) {
                        System.out.println("Stack is empty");

                    } else {
                        System.out.println(res);
                    }
                    break;
                default:
                    break;
            }

        }
    }
}

class Stack {
    int[] data;
    int ptr = -1;

    public Stack(int size) {
        this.data = new int[size];
    }

    public void push(int v) {
        if (ptr == data.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        data[++ptr] = v;

    }

    public void pop() {
        if (ptr == -1) {
            System.out.println("Stack is empty");
            return;
        }
        ptr--;
    }

    public int getMax() {

        int max = Integer.MIN_VALUE;
        if (ptr != -1) {
            for (int j = 0; j <= ptr; j++) {
                if (max < data[j]) {
                    max = data[j];
                }
            }
        }
        return max;
    }

}
