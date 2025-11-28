class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        long count=0;
        long tp=n*(n-1)/2;
        //System.out.print(tp);
        HashMap<Integer,Long> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]-i)){
                count+=map.get(nums[i]-i);
            }
            map.put(nums[i]-i,map.getOrDefault(nums[i]-i,0L)+1L);
        }
        return tp-count;

        
    }
}