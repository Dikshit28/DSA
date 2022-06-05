package ArshSheet.arrays;

import java.util.Arrays;

public class setMatrixZero04 {
    static void solver(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean flagcol = false;
        boolean flagrow = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    if (i == 0) {
                        flagcol = true;
                    }
                    if (j == 0) {
                        flagrow = true;
                    }
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // dealing with columns except first
        for (int i = 1; i < n; i++) {
            if (arr[0][i] == 0) {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = 0;
                }
            }
        }
        // dealing with rows
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // dealing with 0,0
        if (arr[0][0] == 0 && flagcol && flagrow) {
            for (int i = 1; i < m; i++) {
                arr[i][0] = 0;
            }
        }
        if (flagcol) {
            for (int i = 0; i < n; i++) {
                arr[0][i] = 0;
            }
        }
        if (flagrow) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }

    static void optimal(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, k = 0;
        // First row has zero?
        while (k < n && matrix[0][k] != 0)
            ++k;
        // Use first row/column as marker, scan the matrix
        for (int i = 1; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (matrix[i][j] == 0)
                    matrix[0][j] = matrix[i][0] = 0;
        // Set the zeros
        for (int i = 1; i < m; ++i)
            for (int j = n - 1; j >= 0; --j)
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
        // Set the zeros for the first row
        if (k < n)
            Arrays.fill(matrix[0], 0);
    }

    public static void main(String[] args) {
        int[][] matrix = { { -4, -2147483648, 6, -7, 0 }, { -8, 6, -8, -6, 0 }, { 2147483647, 2, -9, -6, -10 } };
        // { { 1 }, { 0 }, { 3 } };
        // { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 0, 10, 11, 12 }, { 13, 14, 15, 0 } };
        // { { 0, 1 } };
        // { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } }
        solver(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int[][] matrix1 = { { -4, -2147483648, 6, -7, 0 }, { -8, 6, -8, -6, 0 }, { 2147483647, 2, -9, -6, -10 } };
        // { { 1 }, { 0 }, { 3 } };
        // { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 0, 10, 11, 12 }, { 13, 14, 15, 0 } };
        // { { 0, 1 } };
        // { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } }
        optimal(matrix1);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
    }
}
