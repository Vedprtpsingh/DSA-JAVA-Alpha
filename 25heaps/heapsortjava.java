public class heapsortjava {
    public static void heapSort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(i,n);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
    }
}