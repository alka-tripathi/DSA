class Solution {
    public static int solution(int arr[]){
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid+1]>arr[mid]){
                l=mid+1;
            }else{
                h=mid;
            }
           
        }
        return l;
    }
    public int findPeakElement(int[] nums) {
        return solution(nums);
        
    }
}