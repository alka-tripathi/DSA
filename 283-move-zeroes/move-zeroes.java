class Solution {
    public static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {

        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(nums[j]==0){
                    swap(j,j+1,nums);
                }
            }
        }
        
    }
}