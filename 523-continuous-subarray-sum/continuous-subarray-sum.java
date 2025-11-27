class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
       
        int ps=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            if(map.containsKey(ps%k)){
                int index=map.get(ps%k);
            if(i-index >= 2){
                return true;
            }
            }else{
                map.put(ps%k,i);
            }
        }
        return false;
        
    }
}