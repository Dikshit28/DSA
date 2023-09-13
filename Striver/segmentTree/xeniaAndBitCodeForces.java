package Striver.segmentTree;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/339/D

/*
 * Problem: Xenia, the beginner programmer, is given a sequence of non-negative integers. She needs to calculate a value "v" by performing a series of bitwise OR and XOR operations on the sequence.

Code Explanation:

The code uses a segment tree to efficiently perform the OR and XOR operations on the sequence.
It reads the initial sequence and queries to update elements.
The build method recursively constructs the segment tree, alternating between OR and XOR operations at each level.
The update method updates a single element in the sequence and re-calculates the segment tree.
Depending on whether "n" is even or odd, it initializes the segment tree for OR or XOR operations.
Finally, it prints the value "v" after each query.

Key Points:

Efficiently uses a segment tree for OR and XOR operations.
Handles queries to update elements in the sequence.
Alternates between OR and XOR operations based on "n" being even or odd.
 */

public class xeniaAndBitCodeForces {
    int[] seg;

    public xeniaAndBitCodeForces(int n) {
        seg = new int[4 * n];
    }

    public void build(int index, int low, int high, int[] arr, boolean orr) {
        if (low == high) {
            seg[index] = arr[low];
            return;
        }
        int mid = (low + high) / 2;
        build(2 * index + 1, low, mid, arr, !orr);
        build(2 * index + 2, mid + 1, high, arr, !orr);
        if (orr)
            seg[index] = seg[2 * index + 1] | seg[2 * index + 2];
        else
            seg[index] = seg[2 * index + 1] ^ seg[2 * index + 2];
    }

    public void update(int index, int low, int high, int[] arr, boolean orr, int i, int val) {
        if (low == high) {
            seg[index] = val;
            return;
        }
        int mid = (low + high) / 2;
        if (i <= mid)
            update(2 * index + 1, low, mid, arr, !orr, i, val);
        else
            update(2 * index + 2, mid + 1, high, arr, !orr, i, val);
        if (orr)
            seg[index] = seg[2 * index + 1] | seg[2 * index + 2];
        else
            seg[index] = seg[2 * index + 1] ^ seg[2 * index + 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n and q");
        String[] nq = sc.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int el = (int) Math.pow(2, n);
        int q = Integer.parseInt(nq[1]);
        System.out.println(n + " " + q);
        int[] arr = new int[el];
        System.out.println("enter elements of array");
        for (int i = 0; i < el; i++) {
            arr[i] = sc.nextInt();
        }
        xeniaAndBitCodeForces xb1 = new xeniaAndBitCodeForces(el);
        if (n % 2 == 0)
            xb1.build(0, 0, el - 1, arr, false);
        else
            xb1.build(0, 0, el - 1, arr, true);
        System.out.println("give queries");
        for (int j = 0; j < q; j++) {
            int i = sc.nextInt() - 1;
            int val = sc.nextInt();
            if (n % 2 == 0)
                xb1.update(0, 0, el - 1, arr, false, i, val);
            else
                xb1.update(0, 0, el - 1, arr, true, i, val);
            System.out.println(xb1.seg[0]);
        }
        sc.close();
    }
}
