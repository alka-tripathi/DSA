class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<>();
    long maxsum=0;
    long sum=0;
    int r=0,l=0;
    while(r<nums.length){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        sum+=nums[r];
        if(r-l+1 > k){
            sum-=nums[l];
          map.put(nums[l],map.getOrDefault(nums[l],0)-1);
          if(map.get(nums[l])==0){
            map.remove(nums[l]);
          }
          l++;
        }
      if(r-l+1==k){
          if(map.size()==k){
            maxsum=Math.max(maxsum,sum);
             //map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        }
      }
        r++;
    }
        return maxsum;
    }
}