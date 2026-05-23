import java.util.Scanner;
public class create {
    public static boolean find(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("The Element is at Position ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("the element is not found");
        return false;
    }
    public static int largest(int matrix[][]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }
    public static int smallest(int matrix[][]) {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            System.out.print("[");
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("]");
        }
        System.out.println("enter the key element: ");
        int key=sc.nextInt();
        find(matrix, key);
        System.out.println("largest element is :"+largest(matrix));
        System.out.println("smallest element is :"+smallest(matrix));
    }
}