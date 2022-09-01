package PlacementQues;

public class search2DMatrix {
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static int[] acquireRow(int[][] orig, int row) {
        int[] ret = new int[orig[row].length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = orig[row][i];
        }
        return ret;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean val = false;
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if (target <= matrix[i][m - 1]) {
                int l = 0, r = m - 1;
                val = binarySearch(acquireRow(matrix, i), l, r, target) == -1 ? false : true;
                return val;
            }
        }
        return val;
    }

    public static boolean searchMatrixOptimal(int[][] matrix, int target) {

        int row_num = matrix.length;
        int col_num = matrix[0].length;

        int begin = 0, end = row_num * col_num - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;
            int mid_value = matrix[mid / col_num][mid % col_num];

            if (mid_value == target) {
                return true;

            } else if (mid_value < target) {
                // Should move a bit further, otherwise dead loop.
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 10;
        System.out.println(searchMatrix(matrix, target));
        System.out.println(searchMatrixOptimal(matrix, target));
    }
}
