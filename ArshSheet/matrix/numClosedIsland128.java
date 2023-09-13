package ArshSheet.matrix;

public class numClosedIsland128 {
    public static int closedIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length, count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0 && dfs(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean dfs(int[][] grid, int i, int j) {
        int rows = grid.length, cols = grid[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols) {
            return false;
        }
        if (grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 1; // mark as visited
        boolean left = dfs(grid, i, j - 1), right = dfs(grid, i, j + 1),
                up = dfs(grid, i - 1, j), down = dfs(grid, i + 1, j);
        return left && right && up && down;
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 1, 1, 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 1, 0 }, { 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 0 } };
        int res = closedIsland(grid);
        System.out.println(res);
    }
}
