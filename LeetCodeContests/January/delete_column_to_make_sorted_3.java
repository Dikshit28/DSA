package LeetCodeContests.January;

public class delete_column_to_make_sorted_3 {
    public static int minDeletionSize(String[] strs) {
        int min = 0;
        int n = strs.length;
        int k = strs[0].length();
        for (int col = 0; col < k; col++) {
            for (int row = 1; row < n; row++) {
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    min++;
                    break;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String[] arr = { "cba", "daf", "ghi" };
        System.out.println(minDeletionSize(arr));
    }
}
