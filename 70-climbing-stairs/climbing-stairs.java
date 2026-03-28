class Solution {
    public static int solution(int i,int n,int dp[]){
        if(i>=n-1) return 1;

        if(dp[i]!=-1) return dp[i];

        int first=solution(i+1,n,dp);
        int second = solution(i+2,n,dp);


        return dp[i]=first + second;
    }
    public int climbStairs(int n) {
        int dp[]= new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }

        return solution(0,n,dp);
        
    }
}