package dsa_essentials;

public class sort_bubble {
    public static void bubble_sort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 9, 1, -7 };
        int n = arr.length;
        System.out.println("Before ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
        bubble_sort(arr, n);
        System.out.println("\nAfter ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
