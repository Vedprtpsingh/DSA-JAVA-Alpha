public class subarrayjava {
    public static void subarray(int Numbers[]) {
        for(int i=0;i<Numbers.length;i++){
            for(int j=i;j<Numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(Numbers[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,4};
        subarray(num);
    }
}
