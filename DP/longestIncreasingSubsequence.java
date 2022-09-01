package DP;

import java.util.Arrays;

public class longestIncreasingSubsequence {
    public static int LIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(prev, -1);
        Arrays.fill(dp, 1);
        int ans = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    prev[i] = j;
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                ans = Math.max(ans, dp[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 8, 3, 5 };
        System.out.println(LIS(nums));
    }
}
