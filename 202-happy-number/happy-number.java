class Solution {
    public static int getSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getSum(n);
        }

return (n==1)? true:false;

    }
}