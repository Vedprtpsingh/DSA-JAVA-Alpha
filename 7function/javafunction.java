public class javafunction {
    // print hello word
    public static void helloworld() {
        System.out.println("hello World");
    }
    // sum of two numbers
    public static void sum(int a,int b) {
        System.out.println(a+b);
    }
    // mul of two numbers
    public static void mul(int a,int b) {
        System.out.println(a*b);
    }
    // factriol
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int BinomialCoeffficient(int n,int r){
        int nfact=fact(n);
        int rfact=fact(r);
        int nrfact=fact(n-r);
        int BC=nfact/(rfact*nrfact);
        return BC;
    }



    public static void main(String[] args) {
        helloworld();
        sum(2, 6);
        mul(34, 54);
        System.out.println(fact(5));
        System.out.println(BinomialCoeffficient(10,9));
        

    }
}
