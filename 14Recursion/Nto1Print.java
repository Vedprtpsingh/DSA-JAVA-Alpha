public class Nto1Print {
    // public static void nTO1(int num){
    //     for(int i=num;i>=1;i--){
    //         System.out.println(i);
    //     }
    // }
    public static void printDec(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}
