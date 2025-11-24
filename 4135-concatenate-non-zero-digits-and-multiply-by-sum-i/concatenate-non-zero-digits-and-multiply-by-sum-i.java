class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
       StringBuilder str = new StringBuilder();
       long rem=0;
       long sum=0;
        while(n!=0){
            rem=n%10;
            if(rem!=0){
                str.append(rem);
            }
            sum+=rem;
            n=n/10;
        }
        String str1=str.reverse().toString();
        long ans=Long.parseLong(str1);
        return ans*sum;
        
    }
}