class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; // dp[i] = min num coins needed to make amount i
        
        dp[0] = 0;
        
        Arrays.sort(coins); // sort if necessary
        
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE; // set to max
            for (int coin : coins) { // check each coin we have
                if (i == coin) {
                    dp[i] = 1;
                    break;
                } else if (i - coin > 0) {
                    if (dp[i - coin] == Integer.MAX_VALUE) { // couldn't make amt coin - i with the coins we have
                        continue;
                    }
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        
        if (dp[amount] == Integer.MAX_VALUE) { // couldn't make amount with the coins we have
            return -1;
        } else{
            return dp[amount];
        }
    }
}
