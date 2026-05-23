package DSA13OOPs;

public class OOPsjava1 {
    public static void main(String[] args) {
        Pen p1=new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow ");
        System.out.println(p1.color);
        BankAccount myAcc= new BankAccount();
        myAcc.username="vedprtpsingh";
        myAcc.setPassword("asdasdsasdd");
        
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percenntage;
    void calcPercentage(int phy,int chem,int math){
        percenntage=(phy*chem*math)/3;
    }
} 