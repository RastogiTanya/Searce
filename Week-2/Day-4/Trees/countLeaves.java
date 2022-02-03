import java.util.*;

public class countLeaves {
    Node root;

    public static void main(String[] args) {
        countLeaves cL = new countLeaves();
        cL.addNode(5);
        cL.addNode(4);
        cL.addNode(6);
        cL.addNode(3);
        cL.addNode(7);
        cL.addNode(1);
        cL.inOrderTraversal(cL.root);
        System.out.println(countLeave(cL.root));
    }

    public static int countLeave(Node root) {
        // Your code
        if (root == null)
            return 0;

        int count = 0;

        if (root.left == null && root.right == null) {
            count++;
        }
        count += countLeave(root.left);
        count += countLeave(root.right);
        return count;
    }

    int minValue(Node node) {
        if (node == null) {
            return -1;
        }
        if (node.left == null) {
            return node.data;
        }
        return minValue(node.left);
    }

    public void addNode(int key) {
        Node newNode = new Node(key);
        if (root == null) {

            root = newNode;

        } else {

            Node focusNode = root;

            Node parent;
            while (true) {

                parent = focusNode;

                if (key < focusNode.key) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = newNode;
                        return;
                    }

                }
            }
        }
    }

    public void inOrderTraversal(Node focusNode) {
        if (focusNode != null) {

            inOrderTraversal(focusNode.left);
            System.out.println(focusNode.key);
            inOrderTraversal(focusNode.right);
        }
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}
