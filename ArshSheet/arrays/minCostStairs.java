package ArshSheet.arrays;

public class minCostStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];
        for (int i = cost.length - 1; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }
        return Math.min(dp[0], dp[1]);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 20 };
        System.out.println(minCostClimbingStairs(arr));
    }
}
