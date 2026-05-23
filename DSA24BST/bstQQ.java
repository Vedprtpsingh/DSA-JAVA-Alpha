package DSA24BST;

import java.util.ArrayList;

public class bstQQ {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorderArr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorderArr);
        inorderArr.add(root.data);
        getInorder(root.right, inorderArr);
    }
    public static Node createBSt(ArrayList<Integer> inorderArr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorderArr.get(mid));
        root.left = createBSt(inorderArr, st, mid - 1);
        root.right = createBSt(inorderArr, mid + 1, end);
        return root; 
    }

    public static Node balanceBST(Node root) {
        //inorder seq
        ArrayList<Integer> inorderArr = new ArrayList<>();
        getInorder(root, inorderArr);
        // sorted inorder-> balanced BST
        root = createBSt(inorderArr, 0, inorderArr.size() - 1);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root=balanceBST(root);
        preorder(root);
    }
}