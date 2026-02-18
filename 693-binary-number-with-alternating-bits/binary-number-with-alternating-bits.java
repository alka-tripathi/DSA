class Solution {
    public static boolean convertToBinary(int n){

        StringBuilder ans = new StringBuilder();
        while(n!=0){
            ans.append(n%2);
            n=n/2;
        }
        ans.append(n);
        for(int i=ans.length()-1;i>0;i--){
            if(ans.charAt(i)==ans.charAt(i-1)){
return false;
            }
        }
     return true;

    }
    public boolean hasAlternatingBits(int n) {

        return convertToBinary(n);
        
    }
}