package ArshSheet.arrays;

public class moveZeros05 {
    static void solver(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;
        // i tracks 0
        // j tracks !0
        while (j < n) {
            if (arr[j] != 0) {
                if (arr[i] == 0) {
                    arr[i] = arr[j];
                    arr[j] = 0;
                }
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        solver(arr);
        for (int i : arr) {
            System.out.print(i);
        }

    }
}
