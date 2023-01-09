package LeetCodeContests.January;

public class max_ice_cream_6 {
    public static int maxIceCream(int[] costs, int coins) {
        int max = costs[0];
        for (int i = 1; i < costs.length; i++) {
            max = Math.max(max, costs[i]);
        }
        int[] buckets = new int[max + 1];
        for (int i : costs) {
            buckets[i]++;
        }
        int ans = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (coins < i) {
                break;
            }
            if (buckets[i] > 0) {
                ans += Math.min(buckets[i], coins / i);
                coins -= Math.min(coins, i * buckets[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 4 };
        int coins = 7;
        System.out.println(maxIceCream(arr, coins));
    }
}
