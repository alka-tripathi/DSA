class Solution {
    public static int peak(int arr[],int l,int r){
       while(l<r){
         int mid=(l+r)/2;
        if((mid > 0 && mid < arr.length - 1
) && arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            return mid;
        }
        if(arr[mid]<arr[mid+1]){
            l=mid+1;
        }else{
            r=mid-1;
        }
       }
        return l;
    }
    public int peakIndexInMountainArray(int[] arr) {

    int l=0;
    int h=arr.length-1;
    return peak(arr,l,h);
        
    }
}