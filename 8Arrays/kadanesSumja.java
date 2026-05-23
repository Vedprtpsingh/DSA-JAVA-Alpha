public class kadanesSumja {
    public static void kadan(int Numbers[]) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<Numbers.length;i++){
            currsum=currsum+Numbers[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        if(maxsum==0){
            int Mmaxsum=Integer.MIN_VALUE;
            for(int i=0;i<Numbers.length;i++){
                Mmaxsum=Math.max(Mmaxsum,Numbers[i]);
            }
            maxsum=Mmaxsum;
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int array[]={-3,-5,-4,-7,-1,-6};
        kadan(array);
    }
}
