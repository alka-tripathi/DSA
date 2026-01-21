class Solution {
    public boolean judgeCircle(String moves) {
        int totalX=0;
        int totalY=0;
        int [][]direction={{1,0},{-1,0},{0,1},{0,-1}};
         int x=0;
            int y=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
           
            if(ch=='U'){
                x+=direction[0][0];
                y+=direction[0][1];

            }
            else if(ch=='D'){
                  x+=direction[1][0];
                y+=direction[1][1];

            }
            else if(ch=='R'){
            x+=direction[2][0];
                y+=direction[2][1];
            }else{
                  x+=direction[3][0];
                y+=direction[3][1];
            }
        }
     if(x==0 && y==0) return true;
     return false; 
        
    }
}