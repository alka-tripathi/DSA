class Solution {

public static int subarrayAtMost(int nums[],int k){
    HashMap<Integer,Integer> map = new HashMap<>();
    int n=nums.length;
    int r=0;
    int count=0;
    int l=0;
    while(r<n){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
      while(map.size()>k){
        map.put(nums[l],map.getOrDefault(nums[l],0)-1);
        if(map.get(nums[l])==0){
            map.remove(nums[l]);
        }
        l++;
      }
      if(map.size()<=k){
        count+=(r-l+1);
      }
      r++;

    }
    return count;
}
    public int subarraysWithKDistinct(int[] nums, int k) {
      
      return subarrayAtMost(nums,k)-subarrayAtMost(nums,k-1);

        
    }
}