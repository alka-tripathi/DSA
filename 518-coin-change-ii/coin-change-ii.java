class Solution {
    public static int sol(int i,int arr[],int amount,int dp[][]){
    if(amount==0)return 1;
      if(i==0){
        if(amount%arr[0]==0)return 1;
        return 0;
      }

if(dp[i][amount]!=-1)return dp[i][amount];
        int nt=sol(i-1,arr,amount,dp);
        int t=0;
        if(arr[i]<=amount){
            t=sol(i,arr,amount-arr[i],dp);
        }
        return dp[i][amount]=nt+t;
    }
    public int change(int amount, int[] coins) {

    int n=coins.length;
    int dp[][]= new int[n][amount+1];
    for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
    }
  return sol(n-1,coins,amount,dp);

        
        
    }
}