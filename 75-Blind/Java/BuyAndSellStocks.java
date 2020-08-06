// Original two-pass solution
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int b = 0; b < prices.length; b++) {
            for (int s = b; s < prices.length; s++ ) {
                profit = Math.max(prices[s] - prices[b], profit);
            }
        }
        
        return profit;
    }
}

// One-pass solution
class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        
        return maxprofit;
    }
}
