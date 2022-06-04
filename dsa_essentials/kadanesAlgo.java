package dsa_essentials;

import java.util.Scanner;

/*
 * Kadane's Algo O(n)
 */
public class kadanesAlgo {
    public static int kadane(int[] arr,int n) {
        int largest_sum = 0;
        int curr_sum=0;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum + arr[i];
            if (curr_sum < 1) {
                curr_sum = 0;
            }
            largest_sum = Math.max(largest_sum, curr_sum);
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
        System.out.println("largest sum from array " + kadane(arr, n));
        sc.close();
    }
}
