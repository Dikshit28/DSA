package dsa_essentials;

import java.util.Scanner;
/**
 * Brute = O(n^3)
 * Prefix = O(n^2) 
 */

public class largest_sum {
    public static int largestBrute(int[] arr, int n) {
        int largest_sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                }
                largest_sum = Math.max(largest_sum, currSum);
            }
        }
        return largest_sum;
    }
    public static int largestPrefix(int[] arr,int n) {
        int largest_sum = 0;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i==0) {
                    largest_sum = Math.max(prefix[j],largest_sum);
                } else {
                    largest_sum = Math.max(prefix[j] - prefix[i - 1],largest_sum);
                }
            }
        }
        return largest_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " element ");
            arr[i] = sc.nextInt();
        }
        System.out.println("largest sum from array " + largestBrute(arr, n));
        System.out.println("largest sum from array " + largestPrefix(arr, n));
        sc.close();
    }
}
