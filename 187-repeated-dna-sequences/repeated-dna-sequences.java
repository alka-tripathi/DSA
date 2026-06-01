class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
         List<String> res= new ArrayList<>();
         int n=s.length();
         if(n<10)return res;
         String sub=s.substring(0,10);
         HashMap<String,Integer> map = new HashMap<>();
         map.put(sub,1);
         int l=1;
         int r=10;
         while(r<n){
            String sub1=s.substring(l,r+1);
            if(!map.containsKey(sub1)){
                map.put(sub1,1);
            }else{
                 map.put(sub1,map.getOrDefault(sub1,0)+1);
            }
            l++;
            r++;
         }

      for(String key:map.keySet()){
        int f=map.get(key);
        if(f>=2){
            res.add(key);
        }
      }
      return res;
        
    }
}