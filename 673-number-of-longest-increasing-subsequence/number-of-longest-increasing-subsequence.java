class Solution {
    public int findNumberOfLIS(int[] nums) {

        int n=nums.length;
        int count[]= new int[n];
        int dp[]= new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int lastI=1;
       int maxlen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]) {
                if(dp[i]==dp[j]+1){  //same mill gya
                  count[i]+=count[j]; //peeche se bhi add hoga
                }else if(dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    count[i]=count[j];
                }
                }
            }
           if(maxlen<dp[i]){
            maxlen=dp[i];
            lastI=i;
           }
        }
//maxlen ka hi count nikalna hai

        
        int ans=0;
        for(int i=0;i<n;i++){
            if(dp[i]==maxlen){
                ans+=count[i];
            }
        }
        return ans;
    }
}