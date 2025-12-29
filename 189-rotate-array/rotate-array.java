class Solution {
    //reverse function
    public static void reverse(int nums[],int s,int e){
        int l=s;
        int r=e;
        while(l<=r){
            //swap
            int temp=nums[l];
            nums[l] = nums[r];
            nums[r]=temp;
            l++;
            r--;

        }

    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k<n){
            reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        }
        
        
    }
}