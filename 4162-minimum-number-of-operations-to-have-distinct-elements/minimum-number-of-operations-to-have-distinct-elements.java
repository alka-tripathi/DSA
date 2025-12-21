class Solution {
    public int minOperations(int[] nums) {

       HashSet<Integer> set = new HashSet<>();
        int to=0;
        for(int i=nums.length-1;i>=0;i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                to=i+1;
                break;
            }
        }
        return (int)(Math.ceil(to/3.0));
        
    }
}