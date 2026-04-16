class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       Arrays.sort(nums);
        int n=nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,1);
        int prevIdx[]= new int[n];
        Arrays.fill(prevIdx,-1);

        int lastIdx=-1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prevIdx[i]=j;
                }
            }
            if(maxi<dp[i]){
                maxi=Math.max(maxi,dp[i]);
                lastIdx=i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while(lastIdx!=-1){
            ans.add(nums[lastIdx]);
            lastIdx=prevIdx[lastIdx];
        }
        Collections.reverse(ans);
        return ans;
        
        
    }
}