package DSA8Arrays;

public class largest {
    public static int large(int array[]) {
        int Largest_Num=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i]>Largest_Num){
                Largest_Num=array[i];
            }
        }
        return Largest_Num;
    }
    public static void main(String[] args) {
        int arr[]={4,54,43,32,242,53,3,4,232,43};
            System.out.println("Largest Number is "+large(arr));
    }
}
