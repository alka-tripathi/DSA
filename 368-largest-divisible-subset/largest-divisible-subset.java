class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,1);
        int prev[]= new int[n];
        Arrays.fill(prev,-1);

        int lastI=0;
        int lis=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 ){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        prev[i]=j;
                    }
                }
                if(lis<dp[i]){
                   lis=dp[i];
                    lastI=i;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(lastI!=-1){
            ans.add(nums[lastI]);
            lastI=prev[lastI];
        }
        Collections.reverse(ans);
        return ans;
    }
}