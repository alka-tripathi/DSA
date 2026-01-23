class Solution {
    public static int solution(int arr[]){
        int n=arr.length;
        if(n==1) return arr[0];
        int prev=arr[0];
        int prev2=0;
        int curr=0;
        for(int i=1;i<arr.length;i++){
            int take=arr[i]+prev2;
            int nottake=0+prev;
            curr=Math.max(take,nottake);
            prev2=prev;
            prev=curr;
        }
        return curr;
    }
    public int rob(int[] nums) {
        //not tale last element
        int n=nums.length;
        if(n==1) return nums[0];
        int temp1[]=new int[n-1];
         int temp2[]=new int[n-1];
         int idx1=0;
         int idx2=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
              temp1[idx1++]=nums[i];
            }
            if(i!=(n-1)){
                temp2[idx2++]=nums[i];
            }
        }
        int ans1=solution(temp1);
        int ans2=solution(temp2);
        return Math.max(ans1,ans2);

        
    }
}