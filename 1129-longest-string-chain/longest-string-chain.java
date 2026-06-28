class Solution {
    public static boolean isPredecessor(int i,int j,String s1,String s2){
        if(s1.length()-s2.length()!=1)return false;

          if (j == s2.length())
        return true;
        if(i==s1.length())return false;

       
            if(s1.charAt(i)==s2.charAt(j)){
return isPredecessor(i+1,j+1,s1,s2);
            }
            return isPredecessor(i+1,j,s1,s2);
        
    }
    public int longestStrChain(String[] words) {
        int n=words.length;
        int dp[]=new int[n];
        Arrays.fill(dp, 1);
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int len=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
            int diff=words[i].length()-words[j].length();
            if(diff==1 && isPredecessor(0,0,words[i],words[j])){
                if(dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        

            }
                len=Math.max(len,dp[i]);
                
        }
        return len;
        
    }
}