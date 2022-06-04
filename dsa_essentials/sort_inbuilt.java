package dsa_essentials;

import java.util.Arrays;

public class sort_inbuilt {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 9, 1, -7 };
        int n = arr.length;
        System.out.println("Before ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("\nAfter ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
