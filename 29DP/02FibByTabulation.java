java
public class FibByTabulation {
    // 2. Tabulation Approach (Bottom-Up) - O(n)
    public static int fibTabulation(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n]; //ans
    }

    public static void main(String args[]) {
        int n = 5;
        // Running the Tabulation method as shown on screen
        System.out.println(fibTabulation(n));
    }
}
