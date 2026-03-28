class Solution {
    public static int solution(int arr[],int target){
        int n= arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[l]<=arr[mid]){   //left side sorted
                if(target>=arr[l] && target<=arr[mid]) r=mid-1;
                 else l=mid+1;

            }else{
                  if(target>=arr[mid] && target<=arr[r]) l=mid+1;
                  else r=mid-1;

            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {

    return solution(nums,target);
        
    }
}