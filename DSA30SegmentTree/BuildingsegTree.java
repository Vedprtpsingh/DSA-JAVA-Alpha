class BuildingsegTree {

    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    // Build Segment Tree
    public static int buildST(int arr[], int i, int start, int end) {

        if (start == end) {
            tree[i] = arr[start];
            return tree[i];
        }

        int mid = (start + end) / 2;

        int left = buildST(arr, 2 * i + 1, start, mid);
        int right = buildST(arr, 2 * i + 2, mid + 1, end);

        tree[i] = left + right;

        return tree[i];
    }

    // Public function
    public static int getSum(int arr[], int qi, int qj) {

        if (qi < 0 || qj >= arr.length || qi > qj) {
            System.out.println("Invalid Query");
            return -1;
        }

        return getSumUtil(0, 0, arr.length - 1, qi, qj);
    }

    // Utility function
    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {

        // No Overlap
        if (qj < si || qi > sj) {
            return 0;
        }

        // Complete Overlap
        if (qi <= si && sj <= qj) {
            return tree[i];
        }

        // Partial Overlap
        int mid = (si + sj) / 2;

        int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
        int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);

        return left + right;
    }


    public static void update(int arr[], int idx, int newVal) {

    int diff = newVal - arr[idx];
    arr[idx] = newVal;

    updateUtil(0, 0, arr.length - 1, idx, diff);
}


    public static void updateUtil(int i, int si, int sj, int idx, int diff) {

    // No overlap
    if (idx < si || idx > sj) {
        return;
    }

    // Update current node
    tree[i] += diff;

    // If not a leaf node
    if (si != sj) {
        int mid = (si + sj) / 2;

        updateUtil(2 * i + 1, si, mid, idx, diff);
        updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
    }
}
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        init(arr.length);

        buildST(arr, 0, 0, arr.length - 1);

        System.out.println("Segment Tree:");

        for (int i = 0; i < 15; i++) {
            System.out.print(tree[i] + " ");
        }

        System.out.println();

        System.out.println("Sum(2,5) = " + getSum(arr, 2, 5));
        System.out.println("Sum(0,7) = " + getSum(arr, 0, 7));
        System.out.println("Sum(3,3) = " + getSum(arr, 3, 3));
    }
}
