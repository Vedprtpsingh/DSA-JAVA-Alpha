package DSA12bitManipulation;

public class EvenOddjava {
    public static void evenOrOdd(int num) {
        int bitMass=1;
        if((num & bitMass)==0){
            System.out.println("Number is Even:");
        }else{
            System.out.println("Number is Odd:");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(1);
        evenOrOdd(2);
        evenOrOdd(3);
        evenOrOdd(4);
    }
}
