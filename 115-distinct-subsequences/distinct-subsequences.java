class Solution {
    public static int solution(int i,int j,String s ,String s2,int dp[][]){
        if(j<0)return 1; //found one string
        if(i<0 && j>=0)return 0;

        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==s2.charAt(j)){
           return dp[i][j]=solution(i-1,j-1,s,s2,dp)+solution(i-1,j,s,s2,dp);
        }
        return dp[i][j]=solution(i-1,j,s,s2,dp);

    }
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
return solution(n-1,m-1,s,t,dp);
        
    }
}