class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int r=0;
        int l=0;
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            while(map.containsKey(ch)){
                char c= s.charAt(l);
                map.put(c,map.getOrDefault(c,0)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
              map.put(ch,map.getOrDefault(ch,0)+1);
              r++;

        }
        return maxlen;
        
    }
}