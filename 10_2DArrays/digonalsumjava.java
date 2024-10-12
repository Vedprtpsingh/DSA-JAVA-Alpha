public class digonalsumjava {
    public static void digonalSum(int matrix[][]) {
        int n=matrix[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            if(i!=n-i-1){
                sum+=matrix[i][n-i-1];
            }
        }
        System.out.println("Digonal Sum :"+sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        digonalSum(matrix);
    }
}
