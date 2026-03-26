class Solution {
    public static int solution(int i,int arr[],int buy,int dp[][]){
        if(i==arr.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];

        if(buy==1){
            return dp[i][buy]=Math.max(-arr[i]+solution(i+1,arr,0,dp),solution(i+1,arr,1,dp));
        }else{
            return dp[i][buy]=Math.max(arr[i]+solution(i+1,arr,1,dp),solution(i+1,arr,0,dp)); 
        }
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]= new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solution(0,prices,1,dp);
        
    }
}