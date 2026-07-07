class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int n=fruits.length;
        int r=0;
        int l=0;
        int maxlen=0;
        while(r<n){
   map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2 && l<r){
               map.put(fruits[l],map.getOrDefault(fruits[l],0)-1);
               if(map.get(fruits[l])==0){
                map.remove(fruits[l]);
               }
                l++;
            }
         
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        // int ans=0;
        // for(int val:map.values()){
        //     ans+=val;
        // }
        return maxlen;
        
    }
}