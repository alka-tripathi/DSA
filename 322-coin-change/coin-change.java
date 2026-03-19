class Solution {
    public static int solution(int i,int arr[],int target){
        if(i==0){
            if(target%arr[0]==0) return target/arr[0];
            else return Integer.MAX_VALUE-1;
        }

        int not_take=solution(i-1,arr,target);
        int take=Integer.MAX_VALUE;
        if(target>=arr[i]){
            take=1+solution(i,arr,target-arr[i]);
         
                //take=1+res;
            
        }
        return Math.min(take,not_take);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;

          if (amount == 0) return 0;
        if (coins.length == 0) return -1;

        //int ans= solution(n-1,coins,amount);
       // return (ans==Integer.MAX_VALUE-1)?-1:ans;
       int dp[][]= new int[n][amount+1];

       for(int i=0;i<=amount;i++){
        if(i % coins[0]==0) dp[0][i]=i/coins[0];
        else dp[0][i]=Integer.MAX_VALUE-1;
       }
       for(int i=1;i<n;i++){
        for(int j=0;j<=amount;j++){
            int not_take=0+dp[i-1][j];
            int take=Integer.MAX_VALUE-1;
            if(j>=coins[i]){
                take=1+dp[i][j-coins[i]];
            }
            dp[i][j]=Math.min(take,not_take);
        }
       }
       return (dp[n-1][amount]>=Integer.MAX_VALUE-1)?-1:dp[n-1][amount];
        
    }
}