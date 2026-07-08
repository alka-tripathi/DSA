class Solution {
    public static int maxFreq(int arr[]){
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max_value=Math.max(arr[i],max_value);
        }
        return max_value;
    }

    public int characterReplacement(String s, int k) {

        int n=s.length();
        int hash[]= new int[26];
        int l=0;
        int r=0;
        int maxF=0;
        int maxlen=0;

        while(r<n){
            char ch=s.charAt(r);
            hash[ch-'A']++;
            maxF=maxFreq(hash);
           
            while((r-l+1)-maxF>k){
                hash[s.charAt(l)-'A']--;
              
                //now update the maxFrequency

               maxF=maxFreq(hash);
               l++;

                
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;

        }
        return maxlen;
        
    }
}