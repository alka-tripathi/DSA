class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0;
        int r=0;
        int n=s.length();
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
         while(l<r && set.contains(ch)){
            char c= s.charAt(l);
            set.remove(c);
            l++;
         }
        maxlen=Math.max(maxlen,r-l+1);
        set.add(ch);
         r++;
        }
        return maxlen==Integer.MIN_VALUE?0:maxlen;
        
    }
}