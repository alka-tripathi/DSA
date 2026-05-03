class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        int n=nums.length;

        int l=0;
        int count=0;
        int sum=0;
        map.put(0,1);
        while(l<n){
            sum+=nums[l];
            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
           map.put(sum,map.getOrDefault(sum,0)+1);
            l++;
        }
        return count;
        
    }
}