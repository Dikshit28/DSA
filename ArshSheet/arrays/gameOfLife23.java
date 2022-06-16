package ArshSheet.arrays;

public class gameOfLife23 {
    // Original | New | State
    // 0 | 0 | 0
    // 1 | 0 | 1
    // 0 | 1 | 2
    // 1 | 1 | 3

    // Time complexity: O(m*n)
    // Space complexity: O(1)

    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = liveNeighbors(board, m, n, i, j);

                if (board[i][j] == 1) {
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        board[i][j] = 3;
                    }
                } else if (liveNeighbors == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2 || board[i][j] == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public int liveNeighbors(int[][] board, int m, int n, int i, int j) {
        int lives = 0;

        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                if (board[x][y] == 1 || board[x][y] == 3) {
                    lives++;
                }
            }
        }

        if (board[i][j] == 1 || board[i][j] == 3) {
            lives--;
        }

        return lives;
    }
}
