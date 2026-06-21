class Solution {
    public static int sol(int i,int arr[],int sum){
    
if(i==0){
    if(sum==0 && arr[i]==0)return 2;
    if(sum==0 || arr[i]==sum)return 1;
    return 0;
}
     
  int nt=sol(i-1,arr,sum);
  int t=0;
  if(sum>=arr[i]){
    t=sol(i-1,arr,sum-arr[i]);
  }
  return nt+t;

        
    }
    public int findTargetSumWays(int[] nums, int target) {
int n=nums.length;
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       }
       if((target+sum)%2!=0)return 0;

       return sol(n-1,nums,(target+sum)/2);
        
    }
}