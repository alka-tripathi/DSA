class Solution {
    public static int solution(int arr[],int i){
        if(i==0) return arr[0];
        if(i<0) return 0;
        int take=arr[i]+solution(arr,i-2);
        int nottake=0+solution(arr,i-1);
        return Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int curr=0;
        int prev=nums[0];
        int prev2=0;

   for(int i=1;i<n;i++){
    int take=nums[i]+prev2;
    int nottake=0+prev;
    curr=Math.max(take,nottake);
        prev2=prev;
  prev=curr;


   }
      return curr;  
    }
}