class Solution {
    public static int solution(int arr[],int target){
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public int searchInsert(int[] nums, int target) {

        return solution(nums,target);
        
    }
}