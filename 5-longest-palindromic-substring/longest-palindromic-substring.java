class Solution {
    public static boolean isP(int i,int j,String str,int dp[][]){
        if(i>=j)return true;
        if(dp[i][j]!=-1) return dp[i][j]==1;
        if(str.charAt(i)==str.charAt(j)){
            boolean ans=isP(i+1,j-1,str,dp);
            dp[i][j]=ans?1:0;
            return ans;
        }
        dp[i][j]=0;
        return false;
    }

    public String longestPalindrome(String s) {
        String ans="";
        int n=s.length();
        int dp[][]= new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isP(i,j,s,dp)){
                    if(j-i+1>ans.length()){
                        ans=s.substring(i,j+1);
                    }
                }

            }

        }
        return ans;

        
    }

}