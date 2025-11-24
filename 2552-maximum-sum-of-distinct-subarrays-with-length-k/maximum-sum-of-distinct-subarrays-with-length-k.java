class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum=0;
        long maxsum=0;
        int r=0;
        int l=0;
        int n=nums.length;
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
          sum+=nums[r];
            while(r-l+1>k){
                  map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                sum-=nums[l];
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                 l++;
            }
            if(r-l+1==k && map.size()==k){
                maxsum=Math.max(maxsum,sum);
            }
            r++;
        }
        return maxsum;
        
    }
}