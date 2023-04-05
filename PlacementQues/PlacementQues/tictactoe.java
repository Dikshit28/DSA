package PlacementQues;

public class tictactoe {
    // Constructor
    public tictactoe() {
        char[][] grid = new char[3][3];
        // char turn = 'X';
        initializeGrid(grid);
    }

    public static void initializeGrid(char[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
    }

    /*
     * public static void initializeUser() {
     * Scanner sc = new Scanne
     * }
     */
    public static boolean checkWinner(char[][] grid, char turn) {
        boolean flag = true;
        // Checking rows
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != turn) {
                    flag = false;
                    break;
                }
            }
        }
        // checking columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[j][i] != turn) {
                    flag = false;
                    break;
                }
            }
        }
        // checking Diagonal 1
        for (int i = 0; i < 3; i++) {
            if (grid[i][i] != turn) {
                flag = false;
                break;
            }
        }
        // Checking diagonal 2
        for (int i = grid[0].length - 1; i > 0; i--) {
            if (grid[(grid.length - 1) - i][i] != turn) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
