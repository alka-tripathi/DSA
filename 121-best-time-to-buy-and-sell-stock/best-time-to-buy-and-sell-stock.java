class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int n=prices.length;
        int maxp=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            if(buy!=prices[i]){
                maxp=Math.max(maxp,prices[i]-buy);
            }
        }
        return maxp==Integer.MIN_VALUE?0:maxp;
        
    }
}