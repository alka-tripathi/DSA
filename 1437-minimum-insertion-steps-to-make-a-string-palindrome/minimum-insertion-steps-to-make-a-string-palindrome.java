class Solution {
    public static String reverse(String str){
        char charArray[]=str.toCharArray();
        int l=0;
        int r=str.length()-1;
        while(l<=r){
            //swap l and r
            char temp=charArray[l];
            charArray[l]=charArray[r];
            charArray[r]=temp;
            l++;
            r--;
        }
        return new String(charArray);
    }

    //longest palindrome string
    public static int LCSP(int i,int j,String s,String rev){
           if(i>=s.length() || j>=rev.length()){
            return 0;
           }
        if(s.charAt(i)==rev.charAt(j)){
         return 1+LCSP(i+1,j+1,s,rev);
        }
        return Math.max(LCSP(i+1,j,s,rev),LCSP(i,j+1,s,rev));

    }
    public int minInsertions(String s) {
        int n=s.length();
       String rev=reverse(s);
        //int n1=LCSP(0,0,s,rev);
        int m=rev.length();
        int dp[][]= new int[n+1][m+1];

    for(int i=0;i<=n;i++){
        dp[0][i]=0;
    }
    for(int j=0;j<=m;j++){
        dp[j][0]=0;
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(s.charAt(i-1)==rev.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    int n1=dp[n][m];

        return n-n1;
        
    }
}