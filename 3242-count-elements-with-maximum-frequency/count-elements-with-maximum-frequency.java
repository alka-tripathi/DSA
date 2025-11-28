class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        int maxf=0;
        for(int a:map.values()){
            maxf=Math.max(maxf,a);
        }
        for(int a:map.values()){
            if(maxf==a){
                count+=a;
            }
        }
        
return count;
        
    }
}