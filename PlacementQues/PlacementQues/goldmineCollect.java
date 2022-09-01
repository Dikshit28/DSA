package PlacementQues;

public class goldmineCollect {
    // Java program to solve Gold Mine problem
    public static int getMaxGold(int[][] gold, int n, int m) {
        int[][] dp = new int[n][m];
        for (int j = gold[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < gold.length; i++) {
                if (j == gold[0].length - 1) {
                    dp[i][j] = gold[i][j];
                } else if (i == 0) {
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == gold.length - 1) {
                    dp[i][j] = gold[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = gold[i][j] + Math.max(dp[i + 1][j + 1], Math.max(dp[i][j + 1], dp[i - 1][j + 1]));
                }
            }
        }
        int max = dp[0][0];
        for (int i = 1; i < dp.length - 1; i++) {
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] gold = { { 1, 3, 1, 5 },
                { 2, 2, 4, 1 },
                { 5, 0, 2, 3 },
                { 0, 6, 1, 2 } };
        int m = 4, n = 4;
        System.out.println(getMaxGold(gold, n, m));
    }
}