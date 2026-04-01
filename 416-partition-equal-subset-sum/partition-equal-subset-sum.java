class Solution {
    public static boolean solution(int i,int arr[],int target){
        if(target==0) return true;
        if(i>=arr.length) return false;

        boolean nt=solution(i+1,arr,target);
        boolean take=false;
        if(target>=arr[i]){
            take=solution(i+1,arr,target-arr[i]);
        }
        return nt || take;
    }
    public boolean canPartition(int[] nums) {

        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2 !=0) return false;
        int target=sum/2;
        //return solution(0,nums,sum/2);
        boolean dp[][]= new boolean[n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean nt=dp[i-1][j];
                boolean take=false;
                if(nums[i-1]<=j){
                    take=dp[i-1][j-nums[i-1]];
                }

                dp[i][j]=take|| nt;

            }
        }
        return dp[n][target];
        
    }
}