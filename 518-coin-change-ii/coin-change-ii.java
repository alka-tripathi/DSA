class Solution {
    public static int solution(int i, int arr[], int target, int dp[][]) {
        //base case
        if (i == 0) {
            if (target % arr[0] == 0)
                return 1;
            else {
                return 0;
            }

        }
        if (dp[i][target] != -1) {
            return dp[i][target];
        }

        int take = 0;
        int nottake =  solution(i - 1, arr, target, dp);
        if (arr[i] <= target) {
            take = solution(i, arr, target - arr[i], dp);
        }
        dp[i][target] = take + nottake;
        return dp[i][target];

    }

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
       
     
        return  solution(n - 1, coins, amount, dp);
    }
}