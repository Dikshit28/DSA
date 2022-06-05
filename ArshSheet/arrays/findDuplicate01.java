package ArshSheet.arrays;
// https://leetcode.com/problems/find-the-duplicate-number/

// time O(n)
// space O(n)

public class findDuplicate01 {

    static int finder(int[] arr, int n) {
        int[] cnt = new int[n + 1];
        int repeated = -1;
        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
            if (cnt[arr[i]] > 1) {
                repeated = arr[i];
                break;
            }
        }
        return repeated;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 1, 2, 3 };
        int n = arr.length;
        int repeated = finder(arr, n);
        if (repeated != -1) {
            System.out.println("repeated number = " + repeated);
        } else {
            System.out.println("No repeated number");
        }
    }
}
