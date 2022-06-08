package ArshSheet.arrays;

public class maxWater12 {
    static int solver(int[] arr) {
        int level = 0;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            level = Math.max((end - start) * (Math.min(arr[start], arr[end])), level);
            if (arr[start] < arr[end]) {
                start++;
            } else {
                end--;
            }
        }
        return level;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] arr1 = { 1, 2 };
        int level = solver(arr1);
        System.out.println(level);
    }
}
