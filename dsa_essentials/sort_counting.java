package dsa_essentials;

public class sort_counting {
    public static void counting_sort(int[] arr,int n) {
        
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 9, 1, -7 };
        int n = arr.length;
        System.out.println("Before ");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }
        counting_sort(arr, n);
        System.out.println("\nAfter ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
