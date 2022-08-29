package ArshSheet.matrix;

public class sortMatrix78 {
    public static int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int count = 0;// this keeps the count of elements in frst row & 1st col
        int m = mat[0].length;
        int i = 0, k = 0;
        // this while loop will be sending all the starting element-index of the
        // diagonal
        while (count < m + n) {
            if (i == n - 1 && k < m) {
                ++k;
            }
            if (i != n - 1) {
                i++;
            }

            pass(mat, n - 1 - i, k, n, m);
            count++;
        }
        return mat;
    }

    public static void pass(int[][] a, int row, int col, int n, int m) {

        // here we perform COUNT SORT IN EVERY DIAGONAL

        int[] arr = new int[101]; // Frequency Array
        int i = row, j = col;
        while (row < n && col < m) {
            arr[a[row++][col++]]++;
        }
        // SORTING ELEMENTS IN ORIGINAL ARAY DIAGONAL
        for (int k = 0; k < 101; k++) {
            if (arr[k] > 0) {
                while (arr[k] != 0) {
                    a[i++][j++] = k;
                    --arr[k];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
        int[][] res = diagonalSort(mat);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}
