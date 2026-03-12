class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
         if(map.get(nums[i])==1){
               if(!map.containsKey(nums[i]-1) && !map.containsKey(nums[i]+1)){
                ans.add(nums[i]);

            }
         }
        }
        return ans;
        
    }
}