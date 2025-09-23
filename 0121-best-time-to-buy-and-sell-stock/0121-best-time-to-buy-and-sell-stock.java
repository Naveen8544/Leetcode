class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) return 0;

        int min_v = prices[0];
        int max_v = 0;

        for (int i = 0; i < n; i++) {
            if (prices[i] < min_v) {
                min_v = prices[i];
            } else {
                int profit = prices[i] - min_v;
                if (profit > max_v) {
                    max_v = profit;
                }
            }
        }

        return max_v;
    }
}
