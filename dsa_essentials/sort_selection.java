package dsa_essentials;

public class sort_selection {
    public static void selection_sort(int[] arr,int n) {
        for (int i = 0; i < n-1; i++) {
            int curr = arr[i];
            int small = arr[i];
            int pos=i;
            for (int j = i + 1; j < n; j++) {
                if (small > arr[j]) {
                    small = arr[j];
                    pos = j;
                }
            }
            arr[i] = arr[pos];
            arr[pos] = curr;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 9, 1, -7 };
        int n = arr.length;
        System.out.println("Before ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
        selection_sort(arr, n);
        System.out.println("\nAfter ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
