class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int ans=0;
        int freq[]= new int[26];
        while(r<n){
            char ch=s.charAt(r);
            freq[ch-'a']++;
           //now string is valid so uske peeche saari string valid hogi tph pura count krlo
           while(freq[0]>0 && freq[1]>0 && freq[2]>0){
            ans+=(n-r);
            freq[s.charAt(l)-'a']--;
            l++;
           }
           

           r++;
        }
        return ans;
        
    }
}