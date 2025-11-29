class Solution {
    public static int reverse(int n){
        int ans=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            ans=ans*10+rem;
            n=n/10; 
        }
        return ans;
    }
    public int countNicePairs(int[] nums) {
        
        HashMap<Long,Long> map = new HashMap<>();
        long count=0;
        long mod=1000000007;
    
        for(int i=0;i<nums.length;i++){
            long a=nums[i]-reverse(nums[i]);
          
            if(map.containsKey(a)){
                count+=map.get(a);
            }
              map.put(a,map.getOrDefault(a,0L)+1L);
        }
        return (int)(count % mod);
    }
}