class Solution {
     public static boolean isSafe(int row,int col,char arr[][]){
      
        int n=arr.length;
       int i=row-1;
       int j=col-1;
       while(i>=0 && j>=0  ){
        if(arr[i][j]=='Q'){
            return false;
        }
        i--;
        j--;
       }

       i=row-1;
       j=col+1;
       while(i>=0 && j<n){
        if(arr[i][j]=='Q'){
            return false;
        }
        i--;
        j++;
       }


       //now top
       for(int k=row-1;k>=0;k--){
        if(arr[k][col]=='Q')return false;
       }
       return true;
     }



      public static void nQueen(char board[][],int n,List<List<String>> result,int row,int col){
        if(row==n){
            List<String> list = new ArrayList<>();
        
            for(int i=0;i<n;i++){
               list.add(new String(board[i]));
            }
          
        result.add(list);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(row,i,board)){
                board[row][i]='Q';
                nQueen(board,n,result,row+1,i);
                board[row][i]='.';
            }
        }

    }


    public int totalNQueens(int n) {
 char board[][]= new char[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='.';
        }
    }
    
    List<List<String>> result=new ArrayList<>();
    nQueen(board,n,result,0,0);
    return result.size();
        
        
    }
}