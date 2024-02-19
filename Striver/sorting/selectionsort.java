package Striver.sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 2, 5, 1 };
        int n = 5;
        arr = selectionSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
