package Striver.sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 2, 5, 1 };
        int n = 5;
        System.out.println(Arrays.toString(bubbleSort(arr, n)));
    }

    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
