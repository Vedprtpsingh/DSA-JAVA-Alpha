public class secondlargest {
    static int largest = Integer.MIN_VALUE;
    static int secondlargest = Integer.MIN_VALUE;
    public static int find(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest: " + find(arr));
    }
}
