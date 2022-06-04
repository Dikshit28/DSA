package dsa_essentials;

import java.util.Arrays;
import java.util.Scanner;

/**
 * binary_search
 * time complexity O(log2(n))
 * Works only on sorted array
 */
public class binary_search {
    public static int binarysearch(int[] arr, int start, int n, int f) {
        int end = n - 1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid]==f) {
                return mid;
            } else if (arr[mid] < f) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+i+" element ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the element ");
        int f = sc.nextInt();
        int k = binarysearch(arr,0, n, f);
        if (k == -1) {
            System.out.println("Element " + f + " not found");
        }
        else {
            System.out.println("Element " + f + " found at " + k);
        }
        sc.close();
    }
}