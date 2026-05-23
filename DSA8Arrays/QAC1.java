package DSA8Arrays;

public class QAC1 {
    public static boolean dublicate(int Numbers[]) {
        for(int i=0;i<Numbers.length;i++){
            for(int j=i+1;j<Numbers.length;j++){
                if(Numbers[i]==Numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(dublicate(nums));
    }
}
