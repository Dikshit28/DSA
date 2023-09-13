package Striver.segmentTree;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/380/C
/**
 * This Java code solves the problem described in Codeforces Problem 380C,
 * which involves processing a bracket sequence to answer queries about
 * maximum correct bracket subsequences.
 *
 * Key Points:
 * - The code uses a segment tree data structure to efficiently process the
 * bracket sequence.
 * - It reads the input bracket sequence and the number of queries from the
 * standard input.
 * - The `build` function recursively constructs the segment tree, representing
 * each node with a 2D array `seg`. Each row of `seg` contains three values:
 * `open`, `close`, and `full`, representing the count of open brackets,
 * close brackets, and the length of the maximum correct bracket subsequence
 * in the segment, respectively.
 * - The `merge` function combines the information from child nodes to update
 * the parent node during tree construction.
 * - The `query` function searches for the maximum correct bracket subsequence
 * within a specified range.
 * - For each query, it computes and prints twice the length of the maximum
 * correct bracket subsequence found.
 */
public class serejaAndBracketsCodeForces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        int[][] seg = new int[4 * n][3];

        build(0, 0, n - 1, s, seg);

        int m = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            int[] answer = query(0, 0, n - 1, l, r, seg);
            result.append(answer[2] * 2).append("\n");
        }

        System.out.println(result);
        scanner.close();
    }

    private static int[] merge(int[] left, int[] right) {
        int[] ans = new int[3];
        ans[2] = left[2] + right[2] + Math.min(left[0], right[1]);
        ans[0] = left[0] + right[0] - Math.min(left[0], right[1]);
        ans[1] = left[1] + right[1] - Math.min(left[0], right[1]);
        return ans;
    }

    private static void build(int ind, int low, int high, String s, int[][] seg) {
        if (low == high) {
            seg[ind][0] = (s.charAt(low) == '(') ? 1 : 0;
            seg[ind][1] = (s.charAt(low) == ')') ? 1 : 0;
            seg[ind][2] = 0;
            return;
        }
        int mid = (low + high) / 2;
        build(2 * ind + 1, low, mid, s, seg);
        build(2 * ind + 2, mid + 1, high, s, seg);
        seg[ind] = merge(seg[2 * ind + 1], seg[2 * ind + 2]);
    }

    private static int[] query(int ind, int low, int high, int l, int r, int[][] seg) {
        if (r < low || high < l) {
            return new int[] { 0, 0, 0 };
        }
        if (low >= l && high <= r) {
            return seg[ind];
        }
        int mid = (low + high) / 2;
        int[] left = query(2 * ind + 1, low, mid, l, r, seg);
        int[] right = query(2 * ind + 2, mid + 1, high, l, r, seg);
        return merge(left, right);
    }
}