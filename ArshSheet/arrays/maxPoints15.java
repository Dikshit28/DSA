package ArshSheet.arrays;

public class maxPoints15 {
    static int solver(int[] nums, int k) {
        int n = nums.length;
        int[] tot = new int[n + 1];
        int res = 0;
        tot[0] = 0;
        tot[1] = nums[0];
        for (int i = 1; i < n; i++) {
            tot[i + 1] = nums[i] + tot[i];
        }
        int i = 0;
        while (i <= k) {
            res = Math.max(res, tot[n] - (tot[n - k + i] - tot[i]));
            i++;
        }

        return res;
    }

    static int optimal(int[] C, int K) {
        int total = 0;
        for (int i = 0; i < K; i++)
            total += C[i];
        int best = total;
        for (int i = K - 1, j = C.length - 1; i >= 0; i--, j--) {
            total += C[j] - C[i];
            best = Math.max(best, total);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 7, 7, 9, 7, 7, 9 };
        int k = 7;
        int out = solver(nums, k);
        System.out.println(out);
    }
}
