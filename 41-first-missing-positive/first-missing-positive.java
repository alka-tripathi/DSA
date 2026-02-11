class Solution {
    public int firstMissingPositive(int[] nums) {
       int n=nums.length;
       boolean isOne=false;

       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
           isOne=true;
        }
        if(nums[i]<=0 || nums[i]>n){
            nums[i]=1;
        }
       }

       if(isOne==false){
        return 1;
       }

       for(int i=0;i<nums.length;i++){

             int  num=Math.abs(nums[i]);
            nums[num-1]=-Math.abs((nums[num-1]));
        
       }
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            return i+1;
        }
       }
        
        return n+1;
        
    }
}