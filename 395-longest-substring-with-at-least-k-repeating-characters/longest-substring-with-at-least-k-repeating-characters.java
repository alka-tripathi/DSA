class Solution {
    public static int helper(String s,int k){
        if(s.length()<k)return 0;

        HashMap<Character,Integer> map =new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
        for(char a:map.keySet()){
            if(map.get(a)<k){
                int maxlen=0;
                ///split krna hai
                String[] splitStrings=s.split(String.valueOf(a));
                for(String str:splitStrings){
                    maxlen=Math.max(maxlen,helper(str,k));
                }
                return maxlen;
            }
          
        }
          return s.length();
    }

    public int longestSubstring(String s, int k) {
        return helper(s,k);
    }
}