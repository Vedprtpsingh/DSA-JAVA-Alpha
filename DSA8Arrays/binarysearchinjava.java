package DSA8Arrays;


public class binarysearchinjava {
    public static int BinarySearch(int Numbers[],int key) {
        int Start=0;
        int End=Numbers.length-1;
            while (Start<=End) {
                int mid=(Start+End)/2;
                if(key==Numbers[mid]){
                    return mid;
                }
                if(Numbers[mid]<key){
                    Start=mid+1;
                }else{
                    End=mid-1;
                }
                
            }
            return -1;
        }
    public static void main(String[] args) {
        int array[]={1,2,5,7,10,11,15,19,20,23,29,30,34,40,45,49,51};
        int key=7;
        System.out.println(BinarySearch(array, key));
    }
}