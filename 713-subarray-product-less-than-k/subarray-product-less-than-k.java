class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int n=nums.length;
        int prod=1;
        int i=0;
        int j=0;
        int count=0;
        while(j<n){
            prod*=nums[j];
            while(i<=j && prod>=k){
                prod/=nums[i];
                System.out.println(prod);
                i++;
            }
            if(prod<k){
                count+=(j-i+1);
            }
            j++;
        }
        return count;
        
    }
}