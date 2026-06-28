class Solution {
    //dfs used here
    public static int direction[][]={{0,-1},{-1,0},{1,0},{0,1}};
    public static void dfs(int image[][],int i,int j,int ogColor,int newColor){

        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=ogColor || image[i][j]==newColor){
            return;
        }

        image[i][j]=newColor;
        //now go to 4 direction
        for(int k=0;k<4;k++){
            int new_i=direction[k][0]+i;
            int new_j=direction[k][1]+j;

            if(new_i>=0 && new_j>=0 && new_j<=image.length && new_i<=image.length){
                dfs(image,new_i,new_j,ogColor,newColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int n=image.length;
         dfs(image,sr,sc,image[sr][sc],color);
         return image;
        
    }
}