class Solution {
    public static int solution(int arr[]){
        int n=arr.length;
        int l=1;
        int r=n-2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid] != arr[mid+1] && (arr[mid] != arr[mid-1])) return arr[mid];
            else if(mid%2==0){
                if(arr[mid]==arr[mid-1]){
                    r=mid-1;

                }else{
                    l=mid+1;
                }
            }else{
                if(arr[mid-1]==arr[mid]){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        return solution(nums);
        
    }
}