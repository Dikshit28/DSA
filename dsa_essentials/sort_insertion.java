package dsa_essentials;

public class sort_insertion {
    public static void insertion_sort(int[] arr,int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while (prev > -1 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 9, 1, -7 };
        int n = arr.length;
        System.out.println("Before ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
        insertion_sort(arr, n);
        System.out.println("\nAfter ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
