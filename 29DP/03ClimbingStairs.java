// same as it is fib

class ClimbingStairs
{
    public static int steps(int n,int dp[]){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=steps(n-1,dp)+steps(n-2,dp);
        return dp[n];
    }
	public static void main (String[] args)
	{
	    int n=5;
        int dp[]=new int [n+1];
	    System.out.println(steps(n,dp));
	}
}
