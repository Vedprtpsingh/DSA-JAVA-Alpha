public class pattern {
    public static void main(String[] args) {
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // *
        // **
        // ***
        // ****



        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=(4-i+1);j++){
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // ****
        // ***
        // **
        // *



        // int n=2;
        // char ch='A';
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // A
        // BC
        // DEF
        // GHIJ


        //int row=4;
        //int col=5;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=col;j++){
        //         if(i==1||i==row||j==1||j==col)
        //         System.out.print("* ");
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // * * * * * 
        // *       *
        // *       *
        // * * * * *



        // int row=4;
        // int col=4;
        // for(int i =1; i<=row;i++){
        //     for(int j=1;j<=col;j++){
        //         if((i+j-1)<col){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }



        // int row =5;
        // int col =5;
        // for(int i =1;i<=row;i++){
        //     for(int j =1;j<=col;j++){
        //     if((i+j-1)<=row){
        //         System.out.print(j+" ");
        //     }
        //     else{
        //         System.out.print("  ");
        //     }
        //     }
        //     System.out.println();
        // }


        // int row =5;
        // int col =5;
        // int a=1;
        // for(int i =1;i<=row;i++){
        //     for(int j =1;j<=i;j++){
        //         System.out.print(a+" ");
        //         a++;
        // }
        //     System.out.println();
        // }
        

        // int row=5;
        // int col =5;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1 ");
        //         }
        //         else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }



        // int n=4;
        // for(int i=1;i<=n;i++){
        //     // * print
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print("    ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     // * print
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print("    ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=2*(n-i)+1;j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=2*(n-i)+1;j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         if (j==1||j==n||i==1||i==n) {
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }





        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=2*(n-i)+1;j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<i*2;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=2*(n-i)+1;j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<i*2;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        




        // int n=9;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<n;j++){
        //         if((i+j)<n+1){
        //             System.out.print("  ");
        //         }
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+"   ");
        //     }
        //     System.out.println();
        // }




        
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if((i+j)<n+1){
                    System.out.print("  ");
                }
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
