public class binaryTodec {
        public static void bintodec(int binNum){
            int mybin=binNum;
            int decnum=0;
            int pow=0;
            while (binNum>0) {
                int lastDigit=binNum%10;
                decnum=decnum+(lastDigit*(int)Math.pow(2, pow));
                pow++;
                binNum=binNum/10;
            }
            System.out.println("Decimal of "+mybin+" = "+decnum);
        }
        public static void main(String[] args) {
            bintodec(111001001);
        }
    
}