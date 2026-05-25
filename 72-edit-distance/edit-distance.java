class Solution {
    public static int solution(int i,int j,String str1,String str2,int dp[][]){
        if(j<0)return i+1;
        if(i<0)return j+1;
        if(dp[i][j]!=-1)return dp[i][j];

        if(str1.charAt(i)==str2.charAt(j)){
            return dp[i][j]=solution(i-1,j-1,str1,str2,dp);
        }
        int minO=Math.min(1+solution(i-1,j,str1,str2,dp),1+solution(i,j-1,str1,str2,dp));
        return dp[i][j]=Math.min(minO,1+solution(i-1,j-1,str1,str2,dp));
    }
    public int minDistance(String word1, String word2) {
     int n=word1.length();
     int m=word2.length();
     int dp[][]= new int[n+1][m+1];
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            dp[i][j]=-1;
        }
     }
        return solution(n-1,m-1,word1,word2,dp);
        
    }
}