class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<n;i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<n;j++){
                if( j>i+1 && nums[j]==nums[j-1])continue;
            
                   int diff=nums[j]-nums[i];
                if(diff==k){
                    ans++;
                   
                }else if(diff>k){
                    break;
                }

             
            }
        }
        return ans;
    }
}