class Solution {
    public int jump(int[] nums) {

        int n=nums.length;
        if(n==1)return 0;
        int maxreach=0;
        int endrange=0;
        int ans=0;
        for(int i=0;i<n;i++){
            maxreach=Math.max(maxreach,nums[i]+i);
            if(i==endrange){
                ans++;
                endrange=maxreach;
                if(endrange>=(n-1))break;
            }

        }
        return ans;
        
    }
}