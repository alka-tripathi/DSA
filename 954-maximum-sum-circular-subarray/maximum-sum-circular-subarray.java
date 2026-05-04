class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int maxsum=nums[0];
        int minsum=nums[0];
        int n=nums.length;
        int currmax=nums[0];
        int currmin=nums[0];
        int totalsum=nums[0];
        for(int i=1;i<n;i++){
            currmax=Math.max(nums[i],currmax+nums[i]);
            maxsum=Math.max(maxsum,currmax);

            currmin=Math.min(currmin+nums[i],nums[i]);
            minsum=Math.min(minsum,currmin);
            totalsum+=nums[i];
        }
 if(maxsum<0)return maxsum;

 return Math.max(totalsum-minsum,maxsum);
        
    }
}