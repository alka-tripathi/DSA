class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]= new int[26];

        int n=s.length();
        int m=t.length();
        if(n!=m)return false;
        for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        freq[s.charAt(i)-'a']++;
           freq[t.charAt(i)-'a']--;
        }
       for(int a:freq){
        if(a!=0)return false;
       }
        return true;
        
    }
}