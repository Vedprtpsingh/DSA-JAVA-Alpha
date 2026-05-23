package DSA18ArrayList;

import java.util.ArrayList;

public class pairSum2program {
    public static boolean pair(ArrayList<Integer> list,int target) {
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                System.out.println(list.get(rp)+","+list.get(lp));
                lp=(lp+1)%n;
                rp=(n+rp-1)%n;
                //return true;
            }
            if(sum<target){
                lp=(lp+1)%n;
            }
            if(sum>target){
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        pair(list,16);
    }
}
