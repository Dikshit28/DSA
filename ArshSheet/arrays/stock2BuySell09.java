package ArshSheet.arrays;

public class stock2BuySell09 {
    static int optimal(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            profit += Math.max(0, prices[i + 1] - prices[i]);
        }
        return profit;
    }

    static int solver(int[] prices) {
        int prof = 0;
        int buy = Integer.MAX_VALUE, sell = 0;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            int midsell = prices[i] - buy;
            if (sell > midsell) {
                prof = prof + sell;
                buy = prices[i];
                sell = 0;
            } else {
                sell = midsell;
            }
        }
        prof = prof + sell;
        return prof;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int profit = solver(arr);
        System.out.println(profit);
        int prof = optimal(arr);
        System.out.println(prof);
    }
}
