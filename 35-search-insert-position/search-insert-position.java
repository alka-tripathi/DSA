class Solution {
    public static int solution(int arr[],int target){
        int l=0;
        int n=arr.length;
        int h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]>=target){
                ans=mid;
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