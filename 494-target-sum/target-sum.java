class Solution {
    public static int solution(int i,int arr[],int target){
       
       if(i == 0){
            if(target == 0 && arr[0] == 0) return 2;
            if(target == 0 || target == arr[0]) return 1;
            return 0;
        }

           int not_take=solution(i-1,arr,target);

         int take=0;
       if(target>=arr[i]){
         take=solution(i-1,arr,target-arr[i]);
       }
     
        return take+not_take;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int a :nums) sum+=a;
        if((sum+target)%2!=0 ) return 0;
        int newT=(sum+target)/2;
        
        return solution(n-1,nums,newT);
        
    }
}