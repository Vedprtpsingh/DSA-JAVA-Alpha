public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 0;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
            curr.freq++;
        }

        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) {
        if (root == null) return;

        if (root.eow) {
            System.out.println("Prefix for " + ans + ": " + ans);
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                if (root.children[i].freq == 1) {
                    System.out.println( ans + (char) (i + 'a') + ": " + ans + (char) (i + 'a'));
                } else {
                    findPrefix(root.children[i], ans + (char) (i + 'a'));
                }
            }
        }
    }

    public static void main(String args[]) {
        String[] arr = {"zebra", "dog", "duck", "dove", "dogi"};

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        findPrefix(root, "");
    }
}