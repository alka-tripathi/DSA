class Solution {
    public static boolean subsetSum(int i,int arr[],int target,Boolean dp[][]){
        if(target==0)return true; //target found
        if(i<0) return false;

        if(dp[i][target]!=null){
            return dp[i][target];
        }
        
boolean take=false;
        if(arr[i]<=target){
            take=subsetSum(i-1,arr,target-arr[i],dp);
        }
        boolean nottake=subsetSum(i-1,arr,target,dp);
        dp[i][target]= take|| nottake;
        return dp[i][target];

    }
    public boolean canPartition(int[] nums) {
        //first find the total sum of an array
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
          if(sum%2!=0) return false;
        int target=sum/2;
        
        Boolean dp[][]=new Boolean[n+1][target+1];
        dp[0][0]=true;
        for(int i=1;i<=target;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<=n;i++){
            dp[i][0]=true;
        }
        return subsetSum(n-1,nums,sum/2,dp);
        
    }
}