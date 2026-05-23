import java.util.PriorityQueue;

public class slidingWindow {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val; // max-heap based on values
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // Add first k elements to the priority queue
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val; // Store the maximum for the first window

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove elements that are out of the current window
            while (!pq.isEmpty() && pq.peek().idx <= (i - k)) {
                pq.poll(); // Use poll() to remove the head of the queue
            }
            // Add the new element to the priority queue
            pq.add(new Pair(arr[i], i));
            // The maximum for the current window
            res[i - k + 1] = pq.peek().val;
        }

        // Print the results
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}