package LeetCodeContests;

public class biWeekly85_1 {
    /*
     * 6156. Minimum Recolors to Get K Consecutive Black Blocks
     * 
     * You are given a 0-indexed string blocks of length n, where blocks[i] is
     * either 'W' or 'B', representing the color of the ith block. The characters
     * 'W' and 'B' denote the colors white and black, respectively.
     * 
     * You are also given an integer k, which is the desired number of consecutive
     * black blocks.
     * 
     * In one operation, you can recolor a white block such that it becomes a black
     * block.
     * 
     * Return the minimum number of operations needed such that there is at least
     * one occurrence of k consecutive black blocks.
     */
    public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        if (n < k)
            return -1;
        int moves = 0, count = 0, res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (blocks.charAt(i) == 'W') {
                moves++;
            } else {
                count++;
            }
            if (count + moves == k) {
                res = Math.min(res, moves);
                moves = count = 0;
                i += 1 - k;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 2;
        System.out.println(minimumRecolors(blocks, k));
    }
}
