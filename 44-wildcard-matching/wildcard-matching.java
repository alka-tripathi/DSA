class Solution {
    public static boolean sol(int i,int j,String s,String p,Boolean dp[][]){
          // Both string and pattern finished
        if(i<0 && j<0)return true;

         // Pattern finished but string still left
        if(j<0 && i>=0)return false;

          // String finished but pattern left
        if(j>=0 && i<0){
            for(int k=0;k<=j;k++){
                if(p.charAt(k)!='*')return false;
            }
            return true;
        }
        if(dp[i][j]!=null)return dp[i][j];

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j]=sol(i-1,j-1,s,p,dp);
        }
        if(p.charAt(j)=='*'){
            return dp[i][j]=sol(i-1,j,s,p,dp) || sol(i,j-1,s,p,dp);
        }
        return false;
    }
    public boolean isMatch(String s, String p) {
int n=s.length();
int m=p.length();
Boolean dp[][]= new Boolean[n][m];
        return sol(n-1,m-1,s,p,dp);
        
    }
}