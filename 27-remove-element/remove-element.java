class Solution {
    public int removeElement(int[] nums, int val) {
        // 1 3 2 3 1
        int n=nums.length;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                //swap with k
               
                System.out.print(k+" ");
              if(i!=k && k<n){
                  int tem=nums[i];
                nums[i]=nums[k];
                nums[k]=tem;
              }
               k++;
                

                
            }
        }
        return k;
        
    }
}