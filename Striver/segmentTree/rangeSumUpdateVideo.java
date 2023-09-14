package Striver.segmentTree;

import java.util.Scanner;

public class rangeSumUpdateVideo {
    int[][] seg;

    // first elem is segment tree and second is lazy seg tree
    public rangeSumUpdateVideo(int n) {
        seg = new int[4 * n][2];
    }

    public void build(int index, int low, int high, int[] arr) {
        if (low == high) {
            seg[index][0] = arr[low];
            seg[index][1] = 0;
            return;
        }
        int mid = (low + high) / 2;
        build(2 * index + 1, low, mid, arr);
        build(2 * index + 2, mid + 1, high, arr);
        seg[index][0] = seg[2 * index + 1][0] + seg[2 * index + 2][0];
    }

    public void update(int index, int low, int high, int left, int right, int val) {
        // update prev remaining updates and propagate downwards
        if (seg[index][1] != 0) {
            seg[index][0] += (high - low + 1) * seg[index][1];
            // propagate
            if (low != high) {
                seg[2 * index + 1][1] += seg[index][1];
                seg[2 * index + 2][1] += seg[index][1];
            }
            seg[index][1] = 0;
        }
        // no overlap
        if (high < left || low > right) {
            return;
        }
        // complete overlap
        if (low >= left && high <= right) {
            seg[index][0] += (high - low + 1) * val;
            if (low != high) {
                seg[2 * index + 1][1] += val;
                seg[2 * index + 2][1] += val;
            }
            return;
        }
        // partial overlap
        int mid = (low + high) / 2;
        update(2 * index + 1, low, mid, left, right, val);
        update(2 * index + 2, mid + 1, high, left, right, val);
        seg[index][0] = seg[2 * index + 1][0] + seg[2 * index + 2][0];
    }

    public int query(int index, int low, int high, int left, int right) {
        // update prev remaining updates and propagate downwards
        if (seg[index][1] != 0) {
            seg[index][0] += (high - low + 1) * seg[index][1];
            // propagate
            if (low != high) {
                seg[2 * index + 1][1] += seg[index][1];
                seg[2 * index + 2][1] += seg[index][1];
            }
            seg[index][1] = 0;
        }
        // no overlap
        if (high < left || low > right) {
            return 0;
        }
        // complete overlap
        if (low >= left && high <= right) {
            return seg[index][0];
        }
        int mid = (low + high) / 2;
        int l = query(2 * index + 1, low, mid, left, right);
        int r = query(2 * index + 2, mid + 1, high, left, right);
        return r + l;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of elements in the array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Input array elements
        }

        int q = scanner.nextInt(); // Number of queries
        rangeSumUpdateVideo segTree = new rangeSumUpdateVideo(n);
        segTree.build(0, 0, n - 1, arr);

        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt(); // Query type (1 for update, 2 for query)
            if (type == 1) {
                int left = scanner.nextInt(); // Left index of the update range
                int right = scanner.nextInt(); // Right index of the update range
                int val = scanner.nextInt(); // Value to update
                segTree.update(0, 0, n - 1, left, right, val);
            } else if (type == 2) {
                int left = scanner.nextInt(); // Left index of the query range
                int right = scanner.nextInt(); // Right index of the query range
                int result = segTree.query(0, 0, n - 1, left, right);
                System.out.println(result); // Output the query result
            }
        }

        scanner.close();
    }
}
