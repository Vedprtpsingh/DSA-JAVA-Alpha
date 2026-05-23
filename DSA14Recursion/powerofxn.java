package DSA14Recursion;

public class powerofxn {
    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
public static int pow(int x,int n) {
    if(n==0){
        return 1;
    }
    int HalfPower=pow(x, n/2);
    int HalfPowerSq=HalfPower*HalfPower;
    if(n%2!=0){
        return x*HalfPowerSq;
    }
        return HalfPowerSq;
    
}
    //othet with time complexcty log(n);
    public static void main(String[] args) {
        System.out.println(power(2, 30));
        System.out.println(pow(2, 25));
    }
}