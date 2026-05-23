package DSA14Recursion;

public class firstoccurence {
    public static int FirstOcc(int arr[], int key,int i) {
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcc(arr, key, i+1);
    }

    public static int lastOcc(int arr[],int key,int i) {
        if(i==(-1)){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOcc(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,7,3,6};
        int key =3; 
        System.out.println(FirstOcc(arr, key, 0));
        System.out.println(lastOcc(arr, key, arr.length-1));
    }
}
