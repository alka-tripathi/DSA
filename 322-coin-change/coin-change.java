class Solution {
    public static int solution(int i,int arr[],int target){
       if(i==0){
        if(target%arr[0]==0) return target/arr[0];
        return Integer.MAX_VALUE;
       }

        int nt=solution(i-1,arr,target);
        int take=Integer.MAX_VALUE;
        if(arr[i]<=target){
            int ans=solution(i,arr,target-arr[i]);
           if(ans!=Integer.MAX_VALUE){
            take=1+ans;
           }
        }
        return Math.min(take,nt);
    }
    public int coinChange(int[] coins, int target) {
   int n=coins.length;
        //return solution(n-1,coins,amount)==Integer.MAX_VALUE?-1:solution(n-1,coins,amount);

        int dp[][]= new int[n+1][target+1];
        for(int i=0;i<=target;i++){
            dp[0][i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<=n;i++){
            dp[i][0]=0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                int nt=dp[i-1][j];
                int take=Integer.MAX_VALUE;

                if(coins[i-1]<=j){
                    int ans=dp[i][j-coins[i-1]];
                    if(ans !=Integer.MAX_VALUE){
                        take=1+ans;
                    }
                  
                }
                dp[i][j]=Math.min(nt,take);
            }
        }
        return dp[n][target]==Integer.MAX_VALUE?-1:dp[n][target];
        
    }
}