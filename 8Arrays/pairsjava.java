public class pairsjava {
    public static void pairs(int Numbers[]) {
        for(int i=0;i<Numbers.length;i++){
            for(int j=i+1;j<Numbers.length;j++){
                System.out.print("("+Numbers[i]+","+Numbers[j]+")"+" ");
            }
        }
    }
    public static void main(String[] args) {
        int Num[]={2,32,3,7,6,879,57,47};
        pairs(Num);
    }
}
