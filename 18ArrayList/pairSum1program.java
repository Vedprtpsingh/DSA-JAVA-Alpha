import java.lang.reflect.Array;
import java.util.ArrayList;

public class pairSum1program {
    public static boolean pair(ArrayList<Integer> list,int target) {
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                System.out.println(list.get(rp)+","+list.get(lp));
                lp++;
                rp--;
                //return true;
            }
            if(sum<target){
                lp++;
            }
            if(sum>target){
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        pair(list, 5);
    }
}
