class Solution {
    public static int sol(int i,int j,List<List<Integer>> arr){
       if(i==arr.size()-1) return arr.get(i).get(j);

       int down=arr.get(i).get(j)+sol(i+1,j,arr);
       int dia=arr.get(i).get(j)+sol(i+1,j+1,arr);
       return Math.min(down,dia);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
       // return sol(0,0,triangle);
       int dp[][]= new int[n][n];
       for(int i=0;i<n;i++){
        dp[n-1][i]=triangle.get(n-1).get(i);
       }
       for(int i=n-2;i>=0;i--){
        for(int j=i;j>=0;j--){
            int down=triangle.get(i).get(j)+dp[i+1][j];
            int dia=triangle.get(i).get(j)+dp[i+1][j+1];
            dp[i][j]=Math.min(down,dia);
        }
       }
       return dp[0][0];
        
    }
}