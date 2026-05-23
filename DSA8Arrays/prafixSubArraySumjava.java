package DSA8Arrays;

public class prafixSubArraySumjava {
    public static void PrefixSum(int Numbers[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[Numbers.length];
        prefix[0]=Numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+Numbers[i];
        }
        for(int i=0;i<Numbers.length;i++){
            for(int j=i;j<Numbers.length;j++){
                currSum=i==0?prefix[i]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int array[]={1,3,-5,6,8};
        PrefixSum(array);
    }
}
