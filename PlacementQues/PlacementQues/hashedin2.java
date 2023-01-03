package PlacementQues;

/*
 * Buy and sell profit
 * initialize buy at first day value and profit at minimum possible
 * now traverse the prices while updating buy as minimum between current and today price
 * and profit as maximum between current profit and today price - buy
 * return profit
 */
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
