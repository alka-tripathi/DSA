class Solution {
    public static int  direction[][]={{1,0},{-1,0},{0,1},{0,-1}};
    public static void dfs(int image[][],int i,int j,int color,int curr){
        if(i>=image.length || j>=image[0].length || i<0 || j<0){
            return;
        }
        if(image[i][j]!=curr)return;
       
        image[i][j]=color;
        for(int k=0;k<4;k++){
            int new_i=direction[k][0]+i;
            int new_j=direction[k][1]+j;
            if(new_i>=0 && new_i<image.length && new_j>=0 && new_j<image[0].length && image[new_i][new_j]==curr && image[new_i][new_j]!=color){
                dfs(image,new_i,new_j,color,curr);
            }
        }
      

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int n=image.length;
    int m=image[0].length;
    int curr=image[sr][sc];
       
                     dfs(image,sr,sc,color,curr);
                     return image;
                

            
        }
    
        
    }
    
