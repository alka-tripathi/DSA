class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ps=0;
        int maxlen=0;

        for(int i=0;i<n;i++){
         if(nums[i]==0){
            ps+=(-1);
         }else{
            ps+=nums[i];
         }
         if(map.containsKey(ps)){
            maxlen=Math.max(maxlen,i-map.get(ps));
         }else{
            map.put(ps,i);
         }
        }
        return maxlen;
        
    }
}