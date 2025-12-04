class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        HashMap<Integer,Integer> map = new HashMap<>();
map.put(0,1);
    int r=0;
    int ans=0;
    int n=nums.length;
    while(r<n){
        if(nums[r]%2!=0){
            odd++;
        }
        if(map.containsKey(odd-k)){
            ans+=map.get(odd-k);
        }
        map.put(odd,map.getOrDefault(odd,0)+1);
        r++;
    }
    return ans;
        
    }
}