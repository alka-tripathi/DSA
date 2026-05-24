class Solution {
    public static int firstP(int arr[],int target){
        int n=arr.length;
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>=target){
                 if (arr[mid] == target) {
                    ans = mid;
                }
                h=mid-1;
               
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

    public static int lastP(int arr[],int target){
         int n=arr.length;
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<=target){
                  if (arr[mid] == target) {
                    ans = mid;
                }
               
                l=mid+1;
                
            }else{
                h=mid-1;
            }
        }
        return ans;

    }
    public int[] searchRange(int[] nums, int target) {
        int f=firstP(nums,target);
        int l=lastP(nums,target);
        return new int[]{f,l};
        
    }
}