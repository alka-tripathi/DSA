class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
       // map.put(0,0);
        int ps=0;
        for(int i=0;i<nums.length;i++){
           int c=target-nums[i];
            if(map.containsKey(c)){
               return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        
    }
}