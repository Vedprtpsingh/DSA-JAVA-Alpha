package DSA7function;

public class DecemalTObinary {
    public static void DecTOBin(int Dec) {
        int Bin=0;
        int i=0;
        while(Dec>0){
            int BitNum=Dec%2;
            Bin=Bin+(BitNum*(int)Math.pow(10, i));
            Dec=Dec/2;
            i++;
        }
            System.out.print(Bin);
    }
    public static void main(String[] args) {
        DecTOBin(16);
    }
}
