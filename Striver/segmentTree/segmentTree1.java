package Striver.segmentTree;

import java.util.Scanner;

public class segmentTree1 {
    int[] seg;

    public segmentTree1(int n) {
        seg = new int[4 * n];
    }

    public void build(int index, int low, int high, int[] arr) {
        if (low == high) {
            seg[index] = arr[low];
            return;
        }
        int mid = (low + high) / 2;
        build(2 * index + 1, low, mid, arr);
        build(2 * index + 2, mid + 1, high, arr);
        seg[index] = Math.min(seg[2 * index + 1], seg[2 * index + 2]);
    }

    public int query(int index, int low, int high, int left, int right) {
        if (high < left || low > right) {
            return Integer.MAX_VALUE;
        } else if (low >= left && high <= right) {
            return seg[index];
        } else {
            int mid = (low + high) / 2;
            int l = query(2 * index + 1, low, mid, left, right);
            int r = query(2 * index + 2, mid + 1, high, left, right);
            return Math.min(l, r);
        }
    }

    public void update(int index, int low, int high, int i, int val) {
        if (low == high) {
            seg[index] = val;
            return;
        }
        int mid = (low + high) / 2;
        if (i <= mid) {
            update(2 * index + 1, low, mid, i, val);
        } else {
            update(2 * index + 2, mid + 1, high, i, val);
        }
        seg[index] = Math.min(seg[2 * index + 1], seg[2 * index + 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        segmentTree1 sg1 = new segmentTree1(n1);
        System.out.println("enter array 1 ");
        for (int i = 0; i < n1; i++) {
            System.out.println("elem " + i);
            arr1[i] = sc.nextInt();
        }
        sg1.build(0, 0, n1 - 1, arr1);
        for (int i : sg1.seg) {
            System.out.print(i + ", ");
        }
        System.out.println("Enter no of queries");
        int q = sc.nextInt();
        for (; q > 0; q--) {
            System.out.println("enter left ");
            int left = sc.nextInt();
            System.out.println("enter right ");
            int right = sc.nextInt();
            int output = sg1.query(0, 0, n1 - 1, left, right);
            System.out.println("output = " + output);
        }
        // System.out.println("Enter size of array 2");
        // int n2 = sc.nextInt();
        // int[] arr2 = new int[n1];
        // segmentTree1 sg2 = new segmentTree1(n2);
        // System.out.println("enter array 2 ");
        // for (int i = 0; i < n1; i++) {
        // System.out.println("elem 1");
        // arr2[i] = sc.nextInt();
        // }
        // sg2.build(0, 0, n2 - 1, arr2);
        // System.out.println();
        // for (int i : sg2.seg) {
        // System.out.print(i + ", ");
        // }
        sc.close();
    }
}
