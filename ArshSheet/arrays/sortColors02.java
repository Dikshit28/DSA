package ArshSheet.arrays;

public class sortColors02 {
    static void solver(int[] arr) {
        int n = arr.length, i = 0, j = 0, k = n - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 1, 2, 2, 0 };
        solver(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
