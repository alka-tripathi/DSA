class Solution {
    public static int solution(int i,int arr[],int buy,int k,int dp[][][]){
        if(i==arr.length || k==0 )return 0;

        if(dp[i][buy][k]!=-1)return dp[i][buy][k];

        if(buy==1){
            int take=-arr[i]+solution(i+1,arr,0,k,dp);
            int nt=solution(i+1,arr,1,k,dp);
            return dp[i][buy][k]=Math.max(take,nt);

        }else{

            return dp[i][buy][k]=Math.max(arr[i]+solution(i+1,arr,1,k-1,dp),solution(i+1,arr,0,k,dp));
        }
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][][]= new int[n][2][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int h=0;h<=k;h++){
                    dp[i][j][h]=-1;
                }
            }
        }
        return solution(0,prices,1,k,dp);
        
    }
}