package DSA8Arrays;


public class Reverce {
    public static void ReverceArray(int Array[]) {
        int first=0;
        int last=Array.length-1;
        while (first<last) {
            int temp=Array[first];
            Array[first]=Array[last];
            Array[last]=temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,66,77,78};
        ReverceArray(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
