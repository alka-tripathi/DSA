class Solution {
    public static   StringBuilder intToBinary(int n){
        StringBuilder ans = new StringBuilder();
        int rem=0;
        while(n!=0){
            rem=n%2;
            ans.append(rem);
            n=n/2;

        }
        return ans.reverse();
    }
    public int minimumFlips(int n) {
        StringBuilder binary=intToBinary(n);
        StringBuilder reverseS=new StringBuilder(binary).reverse();
        int len=binary.length();
        int count=0;
     for(int i=0;i<len;i++){
        if(binary.charAt(i) != reverseS.charAt(i)){
            count++;
        }
     }
        return count;

    }
}