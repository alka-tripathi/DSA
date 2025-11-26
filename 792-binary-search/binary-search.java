class Solution {
    public static int bs(int nums[],int target,int l,int r){
        if(l>r) return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]>target){
            return bs(nums,target,l,mid-1);
        }else if(nums[mid]<target){
            return bs(nums,target,mid+1,r);
        }
        return mid;
    }
    public int search(int[] nums, int target) {
        int n=nums.length-1;
    

        return bs(nums,target,0,n);
        
    }
}