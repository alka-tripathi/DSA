class Solution {
    public int maxProfit(int[] prices) {

        int buy=prices[0];
        int profit=0;
        int n=prices.length;
        int maxProfit=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            buy=Math.min(buy,prices[i]);
            profit=prices[i]-buy;
            maxProfit=Math.max(maxProfit,profit);

        }
        return maxProfit==Integer.MIN_VALUE?0:maxProfit;
        
    }
}