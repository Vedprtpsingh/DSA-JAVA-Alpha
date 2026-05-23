import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx; // Compare by index if soldiers are equal
            }
            return this.soldiers - r2.soldiers; // Compare by number of soldiers
        }
    }
    public static void main(String[] args) {
        int[][] army = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0; // Count soldiers
            }
            pq.add(new Row(count, i)); // Add Row object to the priority queue
        }
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.remove().idx); // Print the indices of the weakest soldiers
        }
    }
}