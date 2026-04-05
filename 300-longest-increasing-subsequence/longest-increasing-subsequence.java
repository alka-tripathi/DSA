class Solution {
    public static int solution(int prevI,int i,int arr[],int dp[][]){
        if(i>=arr.length)return 0;

        if(dp[i][prevI+1]!=-1)return dp[i][prevI+1];

        int nt=solution(prevI,i+1,arr,dp);
        int take=0;
        if(prevI==-1 || arr[prevI]<arr[i]){
            take=1+solution(i,i+1,arr,dp);
        }
        return dp[i][prevI+1]=Math.max(nt,take);

    }
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        int dp[][]= new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }

        return solution(-1,0,nums,dp);
        
    }
}