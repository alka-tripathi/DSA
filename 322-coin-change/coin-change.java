class Solution {
    public static int solution(int i,int arr[],int target,int dp[][]){
      if(target==0)return 0;
      if(i>=arr.length)return Integer.MAX_VALUE;

      if(dp[i][target]!=-1)return dp[i][target];

        int nt=solution(i+1,arr,target,dp);
        int take=Integer.MAX_VALUE;
        if(target>=arr[i]){
            int ans=solution(i,arr,target-arr[i],dp);
          if(ans!=Integer.MAX_VALUE){
            take=ans+1;
          }
        }
        return dp[i][target]=Math.min(take,nt);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]= new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=amount;j++){
            dp[i][j]=-1;
            }
        }
        return solution(0,coins,amount,dp)==Integer.MAX_VALUE?-1:solution(0,coins,amount,dp);
        
    }
}