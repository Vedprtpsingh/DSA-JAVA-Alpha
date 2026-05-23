import java.util.HashSet;

public class UandI {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        
        //Union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union of Array is: "+set);
        set.clear();
        
        //Intersection
        HashSet<Integer> iset=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if (set.contains(arr2[i])) {
                set.remove(arr2[i]);
                iset.add(arr2[i]);
            }
        }
        System.out.println("Intersection of Array is: "+iset);
    }
}
