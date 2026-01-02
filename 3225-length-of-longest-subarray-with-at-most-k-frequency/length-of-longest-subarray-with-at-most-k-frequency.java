class Solution {
    public static boolean isPossible(HashMap<Integer,Integer> map,int k){
        for(int a:map.keySet()){
            if(map.get(a)>k){
                return false;
            }
        }
        return true;
    }
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen=0;
        
        int l=0;
        int r=0;
        while(r<nums.length){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        while(map.get(nums[r])>k){
            //shrik from left
            map.put(nums[l],map.get(nums[l])-1);
            l++;
            
        }
        maxlen=Math.max(maxlen,r-l+1);
        r++;
        
        }
        return maxlen;
    }
}