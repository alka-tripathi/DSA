class Solution {
    public static int sol(int n,int dp[]){
        if(n==1)return 1;
        if(n==2)return 2;
        if(dp[n]!=-1)return dp[n];

        return dp[n]=sol(n-1,dp)+sol(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[]=new int[46];
       Arrays.fill(dp,-1);

        return sol(n,dp);
        
    }
}