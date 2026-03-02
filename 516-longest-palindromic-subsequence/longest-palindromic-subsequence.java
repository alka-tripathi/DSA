class Solution {
    public static String reverse(String s){
        char charS[]=s.toCharArray();
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<=r){
            //swapdono ko
            char temp=charS[r];
            charS[r]=charS[l];
            charS[l]=temp;
            l++;
            r--;
        }
        return new String(charS);

    }
    public static int LCS(int i,int j,String s1,String s2){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
 if(s1.charAt(i)==s2.charAt(j)){
    return 1+LCS(i+1,j+1,s1,s2);
 }
 return Math.max(LCS(i+1,j,s1,s2),LCS(i,j+1,s1,s2));
    }
    public int longestPalindromeSubseq(String s) {
        String rev= reverse(s);
        //return LCS(0,0,s,rev);
        int n=rev.length();
        int m=s.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }

            }
        }
        return dp[n][m];
        
    }
}