package DSA8Arrays;

public class linerasrch {
    public static int linearSearch(int key,int array[]) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={6,5,34,4,56,34,43,42,234};
        System.out.println(linearSearch(42,array));
    }
}
