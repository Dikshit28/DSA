package dsa_essentials;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " element ");
            arr[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < (n / 2); i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("" + arr[i] + ", ");
        }
        sc.close();
    }
}
