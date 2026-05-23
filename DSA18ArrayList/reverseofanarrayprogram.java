package DSA18ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseofanarrayprogram {
    // public static void reverse(ArrayList list) {
    //     for(int i=list.size()-1;i>=0;i--){
    //         System.out.print(list.get(i)+" ");
    //     }
    //     System.out.println();
    // }
    // public static void swap(ArrayList<Integer> list,int m,int n) {
    //     int temp=list.get(m);
    //     list.set(m,list.get(n));
    //     list.set(n, temp);
    // }
    
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
}