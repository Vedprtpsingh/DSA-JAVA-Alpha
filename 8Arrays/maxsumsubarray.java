public class maxsumsubarray {
    public static void maxSubarraySum(int Numbers[]) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<Numbers.length;i++){
            for(int j=i;j<Numbers.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum=currSum+Numbers[k];
                }
                //System.out.println(currSum);
                if (maxSum<currSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int num[]={1,2,-3};
        maxSubarraySum(num);
    }
}