package ArshSheet.arrays;

public class countSubArray16 {
    static int sovler(int[] arr, int k) {
        int res = 0;
        int n = arr.length;
        int[] sums = new int[n + 1];
        sums[0] = 0;
        for (int i = 1; i <= n; i++) {
            sums[i] = arr[i - 1] + sums[i - 1];
        }
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (sums[j] - sums[i] == k) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 3;
        System.out.println(sovler(arr, k));
    }
}
