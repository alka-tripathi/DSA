class Solution {
    public static int Maxfrequency(int arr[]){
        int maxF=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            maxF=Math.max(maxF,arr[i]);

        }
        return maxF;
    }
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int freq[]= new int[26];
        int maxlen=0;
        int l=0;
        int r=0;

        while(r<n){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            int maxFreq=Maxfrequency(freq);


            while((r-l+1)-maxFreq >k){
                //shrink;
                char c=s.charAt(l);
                freq[c-'A']--;
                 maxFreq=Maxfrequency(freq);
                 l++;

            }

            if((maxlen-maxFreq)<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;

        }
        return maxlen;
        
    }
}