class Solution {
    public boolean canJump(int[] nums) {

        int n=nums.length;
        int maxI=0;

        if(n==1)return true;

        for(int i=0;i<n;i++){
                 if (i > maxI) return false;
        maxI=Math.max(maxI,nums[i]+i);
        if(maxI>=n-1)return true;
       // if(nums[maxI]==0)return false;
        }
        return false;

        // for(int i=0;i<n;i++){
        //     int idx=nums[i]+i;
        //     if(maxI<idx){
        //         maxI=idx;
        //         if(maxI>=n-1)return true;
        //         if(nums[maxI]==0)return false;
        //     }
        // }
       // return false;
        
    }
}