class Solution {
    public static int atMost(int arr[],int k){
        int r=0;
        int l=0;
        int sum=0;
        int count=0;
        int n=arr.length;
        while(r<n){
            sum+=arr[r];
            while(l<=r && sum >k){
                sum-=arr[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
}