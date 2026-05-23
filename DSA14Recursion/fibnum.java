package DSA14Recursion;

public class fibnum {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fOn=fib(n-1)+fib(n-2); 
        return fOn;
    }
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}
