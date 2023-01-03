package PlacementQues;

public class coinChange2 {
    public static int coinChange(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = sum + 1;
        }
        for (int i = 1; i <= sum; i++) {
            for (int c : coins) {
                if (i - c < 0) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[i - c] + 1);
            }
        }
        return dp[sum] != sum + 1 ? dp[sum] : -1;
    }

    public static void main(String[] args) {
        int[] coins = { 1, 3, 4, 5 };
        int sum = 7;
        System.out.println(coinChange(coins, sum));
    }
}
