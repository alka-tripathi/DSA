class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ps=0;
        int count=0;
        for(int i=0;i<n;i++){
           ps+=nums[i];
      
            if(map.containsKey(ps-goal)){
                count+=map.get(ps-goal);
            }
                   map.put(ps,map.getOrDefault(ps,0)+1);
          
        }
        return count;
        
    }
}