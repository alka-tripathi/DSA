class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        boolean single=true;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            single=true;
            for(int j=0;j<n;j++){
                if ( i!=j && ch==s.charAt(j)){
                    single=false;
                    break;
                }

            }
             if(single){
                return i;
            }
           
        }
        return -1;
        
    }
}