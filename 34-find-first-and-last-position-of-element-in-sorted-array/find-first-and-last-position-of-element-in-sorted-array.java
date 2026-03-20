class Solution {
    //first occurence
    public static int first( int low,int high,int arr[],int target){
      
        int ans=-1;
       while(low<=high){
          int mid=low+(high-low)/2;
         if(arr[mid]==target){
            ans=mid;
            high=mid-1;
        }else if(arr[mid]>target){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
        return ans;
    }

    //last


     public static int last( int low,int high,int arr[],int target){
       
        int ans=-1;
       while(low<=high){
         int mid=low+(high-low)/2;
         if(arr[mid]==target){
            ans=mid;
            low=mid+1;
        }else if(arr[mid]>target){
            
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]= new int[2];
        int n=nums.length;
        int f=first(0,n-1,nums,target);
        int l=last(0,n-1,nums,target);

        ans[0]=f;
        ans[1]=l;
        return ans;
        
    }
}