package LeetCodeContests;

import java.util.Arrays;

/*
2389. Longest Subsequence With Limited Sum
You are given an integer array nums of length n, and an integer array queries of length m.

Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.


Example 1:

Input: nums = [4,5,2,1], queries = [3,10,21]
Output: [2,3,4]
*/

public class weekly_308_1 {
    public static int[] answerQueries(int[] A, int[] queries) {
        Arrays.sort(A);
        int n = A.length, m = queries.length, res[] = new int[m];
        for (int i = 1; i < n; ++i)
            A[i] += A[i - 1];
        for (int i = 0; i < m; ++i) {
            int j = Arrays.binarySearch(A, queries[i]);
            res[i] = Math.abs(j + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 2, 1 }, queries = { 3, 10, 21 };
        int[] res = answerQueries(nums, queries);
        for (int i : res) {
            System.out.print(i + ", ");
        }
    }
}
