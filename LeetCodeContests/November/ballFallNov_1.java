package LeetCodeContests.November;

public class ballFallNov_1 {
    public static int dfs(int[][] grid, int i, int j) {
        if (i == grid.length)
            return j;

        if (j < 0 || j >= grid[0].length)
            return -1;

        if (grid[i][j] == 1 && j + 1 < grid[0].length && grid[i][j + 1] == 1)
            return dfs(grid, i + 1, j + 1);

        else if (grid[i][j] == -1 && j - 1 >= 0 && grid[i][j - 1] == -1)
            return dfs(grid, i + 1, j - 1);

        return -1;
    }

    public static int[] findBall(int[][] grid) {
        int m = grid[0].length;
        int[] ar = new int[m];

        for (int j = 0; j < m; j++)
            ar[j] = dfs(grid, 0, j);

        return ar;
    }

    public static int[] findBall1(int[][] grid) {
        int m = grid.length, n = grid[0].length, res[] = new int[n];
        for (int i = 0; i < n; ++i) {
            int i1 = i, i2;
            for (int j = 0; j < m; ++j) {
                i2 = i1 + grid[j][i1];
                if (i2 < 0 || i2 >= n || grid[j][i2] != grid[j][i1]) {
                    i1 = -1;
                    break;
                }
                i1 = i2;
            }
            res[i] = i1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 1, -1, -1 }, { 1, 1, 1, -1, -1 }, { -1, -1, -1, 1, 1 }, { 1, 1, 1, 1, -1 },
                { -1, -1, -1, -1, -1 } };
        int[] res = findBall(grid);
        for (int i : res)
            System.out.print(i + ", ");
        System.out.println();
        int[] res1 = findBall1(grid);
        for (int i : res1)
            System.out.print(i + ", ");
    }
}
