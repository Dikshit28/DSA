package Striver.segmentTree;

import java.util.Scanner;

//https://www.spoj.com/problems/INVCNT/
/**
 * Inversion Count using Segment Tree (SPOJ)
 *
 * This Java program calculates the number of inversions in an array using a
 * Segment Tree. The program takes multiple test cases as input and for each
 * test case, computes and prints the number of inversions in the array.
 *
 * Key Components:
 * - `inversionCountSPOJ` class: Represents the main program.
 * - `seg` array: Stores the segment tree.
 * - `build` method: Builds the segment tree.
 * - `query` method: Queries the segment tree to find the number of inversions.
 * - `update` method: Updates the segment tree after each element is processed.
 * - `main` method: Reads input, processes multiple test cases, and prints the
 * results.
 *
 * Input Format:
 * - The input begins with the number of test cases `t`.
 * - For each test case:
 * - An integer `n` representing the size of the array.
 * - `n` integers representing the elements of the array.
 *
 * Output Format:
 * - For each test case, the program prints the number of inversions in the
 * array.
 *
 * Example:
 * Input:
 * 2
 * 3
 * 3
 * 1
 * 2
 * 5
 * 2
 * 3
 * 8
 * 6
 * 1
 *
 * Output:
 * 2
 * 5
 *
 * Explanation:
 * - In the first test case, the array [3, 1, 2] has 2 inversions.
 * - In the second test case, the array [2, 3, 8, 6, 1] has 5 inversions.
 */
public class inversionCountSPOJ {
    int[] seg;

    public inversionCountSPOJ(int n) {
        seg = new int[4 * n];
    }

    public void build(int ind, int low, int high, int[] arr) {
        if (low == high) {
            seg[ind] = arr[low];
            return;
        }

        int mid = (low + high) / 2;
        build(2 * ind + 1, low, mid, arr);
        build(2 * ind + 2, mid + 1, high, arr);
        seg[ind] = seg[2 * ind + 1] + seg[2 * ind + 2];
    }

    public int query(int ind, int low, int high, int l, int r) {
        if (r < low || high < l)
            return 0;

        if (low >= l && high <= r)
            return seg[ind];

        int mid = (low + high) >> 1;
        int left = query(2 * ind + 1, low, mid, l, r);
        int right = query(2 * ind + 2, mid + 1, high, l, r);
        return left + right;
    }

    public void update(int ind, int low, int high, int i, int val) {
        if (low == high) {
            seg[ind] += val;
            return;
        }

        int mid = (low + high) / 2;
        if (i <= mid)
            update(2 * ind + 1, low, mid, i, val);
        else
            update(2 * ind + 2, mid + 1, high, i, val);
        seg[ind] = seg[2 * ind + 1] + seg[2 * ind + 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 1; testCase <= t; testCase++) {
            int n = scanner.nextInt(); // Size of the array
            int[] arr = new int[n];
            int mx = -1;

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                mx = Math.max(mx, arr[i]);
            }
            mx += 1;
            int[] freq = new int[mx];

            for (int i = 0; i < n; i++) {
                freq[arr[i]]++;
            }

            inversionCountSPOJ st = new inversionCountSPOJ(mx);
            st.build(0, 0, mx - 1, freq);

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                freq[arr[i]]--;
                st.update(0, 0, mx - 1, arr[i], -1);
                cnt += st.query(0, 0, mx - 1, 1, arr[i] - 1);
            }
            System.out.println();
            System.out.println(cnt);
        }
        scanner.close();
    }
}
