package ArshSheet.arrays;

/*
 * https://leetcode.com/problems/subarray-sums-divisible-by-k/discuss/217962/Java-Clean-O(n)-Number-Theory-%2B-Prefix-Sums
 */
public class subarraySumDivide10 {
    static int sovler(int[] A, int K) {
        int[] map = new int[K];
        map[0] = 1;
        int count = 0, sum = 0;
        for (int a : A) {
            sum = (sum + a) % K;
            if (sum < 0)
                sum += K; // Because -1 % 5 = -1, but we need the positive mod 4
            count += map[sum];
            map[sum]++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        int count = sovler(arr, k);
        System.out.println(count);
    }
}
