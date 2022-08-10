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
        boolean check = true;
        while (i <= k) {
            // k values should be distinct
            for (int j = i; j < k - 1; j++) {
                if (nums[j] == nums[j + 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                res = Math.max(res, tot[n] - (tot[n - k + i] - tot[i]));
            }
            i++;
        }

        return res;
    }

    static int maxSum(int arr[], int n, int k) {
        // n must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            int j = 0;
            while(j<)
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
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
        int[] nums = { 1, 2, 7, 7, 4, 3, 6 };
        int k = 3;
        int out = solver(nums, k);
        System.out.println(out);
        int out1 = optimal(nums, k);
        System.out.println(out1);
        int out2 = maxSum(nums, nums.length, k);
        System.out.println(out2);
    }
}
