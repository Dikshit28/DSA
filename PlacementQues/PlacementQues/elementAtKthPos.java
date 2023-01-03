package PlacementQues;

public class elementAtKthPos {
    public static int kthelem(int[] a, int[] b, int k) {
        int n = a.length, m = b.length, i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                k--;
                if (k == 0)
                    return a[i];
                i++;
            } else {
                k--;
                if (k == 0)
                    return b[j];
                j++;
            }
        }
        // If array B[] is completely traversed
        while (i < m) {
            k--;
            if (k == 0)
                return a[i];
            i++;
        }

        // If array A[] is completely traversed
        while (j < n) {
            k--;
            if (k == 0)
                return b[j];
            j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6, 7, 8 };
        int[] b = { 2, 4, 5, 6, 8 };
        int k = 3;
        System.out.println(kthelem(a, b, k));
    }
}
