package DSA8Arrays;

public class QAC2 {

    public static int indextargetSerch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;   // target mil gaya to index return
            }
        }
        return -1; // target nahi mila
    }

    public static void main(String[] args) {
        int Numbers[] = {4,5,6,7,0,1,2};
        int target = 4;

        System.out.println(indextargetSerch(Numbers, target));
    }
}