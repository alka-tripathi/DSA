class Solution {

    //down jaa sakte hai or diagonal jaa sakte hai
    public static int sol(int i,int j,List<List<Integer>> list,int dp[][]){
        if(i==list.size()-1)return list.get(i).get(j);

        if(dp[i][j]!=-1)return dp[i][j];
        
        int down=list.get(i).get(j)+sol(i+1,j,list,dp);
        int dia=list.get(i).get(j)+sol(i+1,j+1,list,dp);
        return dp[i][j]=Math.min(down,dia);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(0).size();
       int dp[][]= new int[n][n];
    //    for(int i=0;i<n;i++){
    //     Arrays.fill(dp[i],-1);


    //    }


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
        // return sol(0,0,triangle,dp);
        return dp[0][0];

        
    }
}