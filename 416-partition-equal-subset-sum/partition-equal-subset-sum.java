class Solution {
    public boolean canPartition(int[] nums) {

     int sum=0;
     int n=nums.length;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }
     if(sum%2!=0)return false;
     int target=sum/2;

        boolean dp[][]= new boolean[n][target+1];

        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=target;j++){
                boolean nt=dp[i-1][j];
                boolean t=false;
                if(nums[i]<=j){
                    t=dp[i-1][j-nums[i]];
                }
                dp[i][j]=t || nt;
            }
        }
        return dp[n-1][target];

        
    }
}