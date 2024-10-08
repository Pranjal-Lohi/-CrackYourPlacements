public class KnightDialer {
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int[] dp = new int[n+1];
       Arrays.fill(dp, -1);
       return solve(n, x, y, z, dp) < 0 ? 0 : dp[n];
    }
    
    public int solve(int n, int x, int y, int z, int[] dp) {
        if(n == 0) {
            return 0;
        }
        
        if(n<0) {
            return Integer.MIN_VALUE;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        
        int a = 1 + solve(n - x, x, y, z, dp);
        int b = 1 + solve(n - y, x, y, z, dp);
        int c = 1 + solve(n - z, x, y, z, dp);
        
        int ans = Math.max(a, Math.max(b, c));
        
        dp[n] = ans;
        
        return dp[n];
        
        
    }

