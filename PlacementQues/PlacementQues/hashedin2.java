package PlacementQues;

public class hashedin2 {
    public static int profit(int[] prices) {
        int buy = prices[0];
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy = Math.min(prices[i], buy);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 4, 7, 1, 8, 2, 9 };
        System.out.println(profit(prices));
    }
}
