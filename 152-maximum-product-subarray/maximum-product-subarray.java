class Solution {
    public int maxProduct(int[] nums) {

        int preffixsum=1;
        int suffixsum=1;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(preffixsum==0)preffixsum=1;
            if(suffixsum==0)suffixsum=1;
              preffixsum=preffixsum*nums[i];
              suffixsum=suffixsum*nums[n-i-1];
              ans=Math.max(ans,Math.max(preffixsum,suffixsum));

        }
      
        return ans;
        
    }
}